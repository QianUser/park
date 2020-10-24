package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.DictCityPOMapper;
import com.park.cloud.cms.mapper.DictParkingCityPOMapper;
import com.park.cloud.cms.service.DictParkingCityService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.DictParkingCityDto;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.dict.DictCityPO;
import com.park.cloud.common.domain.po.dict.DictParkingCityPO;
import com.park.cloud.common.domain.po.dict.DictParkingCityPOExample;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.*;
import com.park.cloud.common.util.ApiStringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * 停车场服务
 *
 * @author liyj
 * @create 2020/1/22
 * @since 1.0.0
 */
@Service
@Slf4j
public class DictParkingCityServiceImpl implements DictParkingCityService {

    @Autowired
    DictParkingCityPOMapper parkingCityPOMapper;

    @Autowired
    SysAreaAssService sysAreaAssService;

    @Autowired
    private DictCityPOMapper dictCityPOMapper;

    /**
     * 添加停车场接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<Object> add(DictParkingCityAddParams param) {
        DictParkingCityPO po = new DictParkingCityPO();
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setAddUser(param.getLoginSysUserId());

        DictCityPO dictCityPO = dictCityPOMapper.selectByPrimaryKey(param.getCityId());
        if (Objects.nonNull(dictCityPO)) {
            po.setCityCode(dictCityPO.getCityCode());
        }
        //生成停车场编号
        String parkCode = "P" + System.currentTimeMillis() + ApiStringUtil.getRandomNum(6);
        po.setParkCode(parkCode);

        if (Objects.isNull(param.getTotalParkingNo())){
            po.setTotalParkingNo(0);
        }
        po.setCurrentParkingNo(po.getTotalParkingNo());
        parkingCityPOMapper.insertSelective(po);
        return CommonResult.success();
    }

    /**
     * 更新停车场接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(DictParkingCityUpdateParams param) {
        DictParkingCityPO po = new DictParkingCityPO();
        BeanUtils.copyProperties(param, po);
        // 更新总车位时更新当前可用车位
        DictParkingCityPO dictParkingCityPO = parkingCityPOMapper.selectByPrimaryKey(po.getParkingId());
        Integer usedParkingNo = dictParkingCityPO.getTotalParkingNo() - dictParkingCityPO.getCurrentParkingNo();
        if (po.getTotalParkingNo() < usedParkingNo) {
            return CommonResult.failed("总车位数不能小于已停车车位数");
        }
        po.setCurrentParkingNo(po.getTotalParkingNo() - usedParkingNo);
        parkingCityPOMapper.updateByPrimaryKeySelective(po);
        return CommonResult.success();
    }

    /**
     * 停车场详情
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<DictParkingCityVO> detail(DictParkingCityDetailParams param) {
        DictParkingCityVO vo = parkingCityPOMapper.selectDetailById(param.getParkingId());
        if (vo == null) {
            return CommonResult.failed("数据不存在");
        }
        return CommonResult.success(vo);
    }

    /**
     * 搜索停车场接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<DictParkingCityVO>> search(DictParkingCitySearchParams param) {
        DictParkingCityDto dto = new DictParkingCityDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);

        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<DictParkingCityVO> resultList = parkingCityPOMapper.selectByDto(dto);
        PageInfo<DictParkingCityVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<DictParkingCityVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    /**
     * 停车场列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<List<DictParkingCityListVO>> list(DictParkingCityListParams param) {
        DictParkingCityDto dto = new DictParkingCityDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);

        List<DictParkingCityListVO> resultList = parkingCityPOMapper.selectListByDto(dto);
        return CommonResult.success(resultList);
    }

    /**
     * 停车场列表接口,带有城市、行政区、片区的上下级关系
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<List<DictCityListWithChildVO>> listWithParent(DictParkingCityListParams param) {
        DictParkingCityDto dto = new DictParkingCityDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);

        List<DictParkingCityVO> resultList = parkingCityPOMapper.selectListWithParentByDto(dto);

        List<DictCityListWithChildVO> cityList = new ArrayList<>();
        if (CollectionUtils.isEmpty(resultList)) {
            return CommonResult.success(cityList);
        }

        Map<Integer, List<DictCantonListWithChildVO>> cityMap = new HashMap<>();
        Map<Integer, List<DictAreaListWithChildVO>> cantonMap = new HashMap<>();
        Map<Integer, List<DictParkingCityListVO>> areaMap = new HashMap<>();

        for (DictParkingCityVO vo : resultList) {
            Integer areaId = vo.getAreaId();
            List<DictParkingCityListVO> areaParkingList = areaMap.get(areaId);
            if (areaParkingList == null) {
                areaParkingList = new ArrayList<>();
                areaMap.put(areaId, areaParkingList);
                Integer cantonId = vo.getCantonId();
                List<DictAreaListWithChildVO> areaList = cantonMap.get(cantonId);
                if (areaList == null) {
                    areaList = new ArrayList<>();
                    cantonMap.put(cantonId, areaList);
                    Integer cityId = vo.getCityId();
                    List<DictCantonListWithChildVO> cantonList = cityMap.get(cityId);
                    if (cantonList == null) {
                        cantonList = new ArrayList<>();
                        cityMap.put(cityId, cantonList);
                        DictCityListWithChildVO cityListWithChildVO = new DictCityListWithChildVO();
                        BeanUtils.copyProperties(vo, cityListWithChildVO);
                        cityListWithChildVO.setCantonList(cantonList);
                        cityList.add(cityListWithChildVO);
                    }
                    DictCantonListWithChildVO cantonListWithChildVO = new DictCantonListWithChildVO();
                    BeanUtils.copyProperties(vo, cantonListWithChildVO);
                    cantonListWithChildVO.setAreaList(areaList);
                    cantonList.add(cantonListWithChildVO);
                }
                DictAreaListWithChildVO areaListWithChildVO = new DictAreaListWithChildVO();
                BeanUtils.copyProperties(vo, areaListWithChildVO);
                areaListWithChildVO.setParkingList(areaParkingList);
                areaList.add(areaListWithChildVO);
            }
            DictParkingCityListVO listVO = new DictParkingCityListVO();
            BeanUtils.copyProperties(vo, listVO);
            areaParkingList.add(listVO);
        }

        return CommonResult.success(cityList);
    }

    @Override
    public CommonResult<List<DictParkingCityVO>> listByIds(IdParams params) {
        DictParkingCityPOExample dictParkingCityPOExample = new DictParkingCityPOExample();
        List<String> strings = Arrays.asList(params.getId().split(","));
        List<Integer> ids = new ArrayList<>();
        strings.forEach(a->{
            ids.add(Integer.valueOf(a));
        });
        dictParkingCityPOExample.createCriteria().andParkingIdIn(ids);
        List<DictParkingCityPO> dictParkingCityPOS = parkingCityPOMapper.selectByExample(dictParkingCityPOExample);
        List<DictParkingCityVO> list = new ArrayList<>();
        dictParkingCityPOS.stream().forEach(a->{
            DictParkingCityVO dictParkingCityVO = new DictParkingCityVO();
            BeanUtils.copyProperties(a,dictParkingCityVO);
            list.add(dictParkingCityVO);
        });
        return CommonResult.success(list);
    }

}