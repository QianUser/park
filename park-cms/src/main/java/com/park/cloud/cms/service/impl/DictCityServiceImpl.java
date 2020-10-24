package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.DictCantonPOMapper;
import com.park.cloud.cms.mapper.DictCityPOMapper;
import com.park.cloud.cms.service.DictCityService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.DictCityDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.dict.DictCantonPOExample;
import com.park.cloud.common.domain.po.dict.DictCityPO;
import com.park.cloud.common.domain.po.dict.DictCityPOExample;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictCityListVO;
import com.park.cloud.common.domain.vo.cms.DictCityVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * 城市服务
 *
 * @author liyj1
 * @create 2020/1/31
 * @since 1.0.0
 */
@Service
@Slf4j
public class DictCityServiceImpl implements DictCityService {

    @Autowired
    DictCityPOMapper dictCityPOMapper;

    @Autowired
    DictCantonPOMapper dictCantonPOMapper;

    @Autowired
    SysAreaAssService sysAreaAssService;

    /**
     * 添加城市接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult add(DictCityAddParams param) {
        DictCityPO po = new DictCityPO();
        DictCityPOExample example = new DictCityPOExample();
        example.createCriteria().andCityCodeEqualTo(param.getCityCode());
        List<DictCityPO> dictCityPOS = dictCityPOMapper.selectByExample(example);
        if (Objects.nonNull(dictCityPOS) && dictCityPOS.size() > 0) {
            return CommonResult.failed("无法添加重复的城市！");
        }
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setAddUser(param.getLoginSysUserId());
        dictCityPOMapper.insertSelective(po);
        return CommonResult.success();
    }

    /**
     * 更新城市接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(DictCityUpdateParams param) {

        DictCityPO dictCityPO = dictCityPOMapper.selectByPrimaryKey(param.getCityId());
        if (Objects.isNull(dictCityPO) || Objects.isNull(dictCityPO.getCityId())) {
            return CommonResult.failed("未查询到该记录");
        }
        if (StringUtils.isNotEmpty(param.getCityCode()) && !dictCityPO.getCityCode().equals(param.getCityCode())) {

            DictCityPOExample example = new DictCityPOExample();
            example.createCriteria().andCityCodeEqualTo(param.getCityCode());
            List<DictCityPO> dictCityPOS = dictCityPOMapper.selectByExample(example);
            if (Objects.nonNull(dictCityPOS) && dictCityPOS.size() > 0) {
                return CommonResult.failed("该城市已经存在！");
            }

        }


        DictCityPO po = new DictCityPO();
        BeanUtils.copyProperties(param, po);
        dictCityPOMapper.updateByPrimaryKeySelective(po);
        return CommonResult.success();
    }

    /**
     * 城市详情
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<DictCityVO> detail(DictCityDetailParams param) {
        DictCityPO po = dictCityPOMapper.selectByPrimaryKey(param.getCityId());
        if (po == null) {
            return CommonResult.failed("数据不存在");
        }
        DictCityVO vo = new DictCityVO();
        BeanUtils.copyProperties(po, vo);
        return CommonResult.success(vo);
    }

    /**
     * 城市删除接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult delete(DictCityDeleteParams param) {
        //检查城市下的行政区
        DictCantonPOExample example = new DictCantonPOExample();
        example.createCriteria().andCityIdEqualTo(param.getCityId());
        if (dictCantonPOMapper.countByExample(example) > 0) {
            return CommonResult.failed("该城市下有行政区，不能删除");
        }

        dictCityPOMapper.deleteByPrimaryKey(param.getCityId());
        return CommonResult.success();
    }

    /**
     * 搜索城市接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<DictCityVO>> search(DictCitySearchParams param) {
        DictCityDto dto = new DictCityDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);

        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<DictCityVO> resultList = dictCityPOMapper.selectByDto(dto);
        PageInfo<DictCityVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<DictCityVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    /**
     * 城市列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<List<DictCityListVO>> list(DictCityListParams param) {
        DictCityDto dto = new DictCityDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);

        List<DictCityListVO> resultList = dictCityPOMapper.selectListByDto(dto);
        return CommonResult.success(resultList);
    }
}