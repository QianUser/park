package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.DictBerthCityPOMapper;
import com.park.cloud.cms.mapper.DictSectionPOMapper;
import com.park.cloud.cms.service.DictSectionService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.DictSectionDto;
import com.park.cloud.common.domain.dto.cms.FindCantonDto;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.dict.DictBerthCityPOExample;
import com.park.cloud.common.domain.po.dict.DictSectionPO;
import com.park.cloud.common.domain.po.dict.DictSectionPOExample;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * 路段服务
 *
 * @author liyj
 * @create 2020/1/21
 * @since 1.0.0
 */
@Service
@Slf4j
public class DictSectionServiceImpl implements DictSectionService {

    @Autowired
    DictSectionPOMapper dictSectionPOMapper;

    @Autowired
    DictBerthCityPOMapper dictBerthCityPOMapper;

    @Autowired
    SysAreaAssService sysAreaAssService;

    /**
     * 添加路段接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult add(DictSectionAddParams param) {
        DictSectionPO po = new DictSectionPO();
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setAddUser(param.getLoginSysUserId());
        dictSectionPOMapper.insertSelective(po);
        return CommonResult.success();
    }

    /**
     * 更新路段接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(DictSectionUpdateParams param) {
        DictSectionPO po = new DictSectionPO();
        BeanUtils.copyProperties(param, po);
        dictSectionPOMapper.updateByPrimaryKeySelective(po);
        return CommonResult.success();
    }

    /**
     * 路段详情
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<DictSectionVO> detail(DictSectionDetailParams param) {
        DictSectionVO vo = dictSectionPOMapper.selectDetailById(param.getSectionId());
        if (vo == null) {
            return CommonResult.failed("数据不存在");
        }
        return CommonResult.success(vo);
    }

    /**
     * 路段删除接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult delete(DictSectionDeleteParams param) {
        //检查路段下的泊位
        DictBerthCityPOExample berthCityPOExample = new DictBerthCityPOExample();
        berthCityPOExample.createCriteria().andSectionIdEqualTo(param.getSectionId());
        if (dictBerthCityPOMapper.countByExample(berthCityPOExample) > 0) {
            return CommonResult.failed("该路段下有泊位，不能删除");
        }

        dictSectionPOMapper.deleteByPrimaryKey(param.getSectionId());
        return CommonResult.success();
    }

    /**
     * 搜索路段接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<DictSectionVO>> search(DictSectionSearchParams param) {
        DictSectionDto dto = new DictSectionDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);

        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<DictSectionVO> resultList = dictSectionPOMapper.selectByDto(dto);
        PageInfo<DictSectionVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<DictSectionVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    /**
     * 路段列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<List<DictSectionListVO>> list(DictSectionListParams param) {
        DictSectionDto dto = new DictSectionDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);

        List<DictSectionListVO> resultList = dictSectionPOMapper.selectListByDto(dto);
        return CommonResult.success(resultList);
    }

    /**
     * 路段列表接口,带有城市、行政区、片区的上下级关系
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<List<DictCityListWithChildVO>> listWithParent(DictSectionListParams param) {
        DictSectionDto dto = new DictSectionDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);

        List<DictSectionVO> resultList = dictSectionPOMapper.selectListWithParentByDto(dto);

        List<DictCityListWithChildVO> cityList = new ArrayList<>();
        if (CollectionUtils.isEmpty(resultList)) {
            return CommonResult.success(cityList);
        }

        Map<Integer, List<DictCantonListWithChildVO>> cityMap = new HashMap<>();
        Map<Integer, List<DictAreaListWithChildVO>> cantonMap = new HashMap<>();
        Map<Integer, List<DictSectionListVO>> areaMap = new HashMap<>();

        for (DictSectionVO vo : resultList) {
            Integer areaId = vo.getAreaId();
            List<DictSectionListVO> areaParkingList = areaMap.get(areaId);
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
                areaListWithChildVO.setSectionList(areaParkingList);
                areaList.add(areaListWithChildVO);
            }
            DictSectionListVO listVO = new DictSectionListVO();
            BeanUtils.copyProperties(vo, listVO);
            areaParkingList.add(listVO);
        }

        return CommonResult.success(cityList);
    }

    @Override
    public CommonResult<List<FindSectionAndParkVO>> listSectionAndPark(CmsBaseParams param) {
        FindCantonDto dto = new FindCantonDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);
          //获取街道名称和类型
       List<FindSectionAndParkVO>sectionList= dictSectionPOMapper.findSection(dto);
       for (int i=0;i<sectionList.size();i++){
            sectionList.get(i).setParkingType(1);
       }
       //获取停车场名称和类型
        List<FindSectionAndParkVO>parkList =  dictSectionPOMapper.findParkName(dto);
        for (int i=0;i<parkList.size();i++){
            parkList.get(i).setParkingType(0);
        }
        List<FindSectionAndParkVO>list = new ArrayList<>();
        list.addAll(sectionList);
        list.addAll(parkList);
        return CommonResult.success(list);
    }

    @Override
    public CommonResult<List<DictSectionVO>> listByIds(IdParams param) {
        DictSectionPOExample example = new DictSectionPOExample();
        List<String> strings = Arrays.asList(param.getId().split(","));
        List<Integer> ids = new ArrayList<>();
        strings.forEach(a->{
            ids.add(Integer.valueOf(a));
        });
        example.createCriteria().andSectionIdIn(ids);
        List<DictSectionPO> dictSectionPOS = dictSectionPOMapper.selectByExample(example);
        List<DictSectionVO> dictSectionVOS = new ArrayList<>();
        dictSectionPOS.stream().forEach(a->{
            DictSectionVO dictSectionVO = new DictSectionVO();
            BeanUtils.copyProperties(a,dictSectionVO);
            dictSectionVOS.add(dictSectionVO);
        });
        return CommonResult.success(dictSectionVOS);
    }

}