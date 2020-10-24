package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.DictBerthCityPOMapper;
import com.park.cloud.cms.mapper.DictCantonPOMapper;
import com.park.cloud.cms.mapper.DictSectionPOMapper;
import com.park.cloud.cms.service.DictBerthCityService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.DictBerthCityDto;
import com.park.cloud.common.domain.params.cms.DictBerthCityAddParams;
import com.park.cloud.common.domain.params.cms.DictBerthCityDetailParams;
import com.park.cloud.common.domain.params.cms.DictBerthCitySearchParams;
import com.park.cloud.common.domain.params.cms.DictBerthCityUpdateParams;
import com.park.cloud.common.domain.po.dict.DictBerthCityPO;
import com.park.cloud.common.domain.po.dict.DictBerthCityPOExample;
import com.park.cloud.common.domain.po.dict.DictCantonPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictBerthCityVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * 泊位服务
 *
 * @author liyj
 * @create 2020/1/22
 * @since 1.0.0
 */
@Service
@Slf4j
public class DictBerthCityServiceImpl implements DictBerthCityService {
    @Autowired
    DictSectionPOMapper dictSectionPOMapper;

    @Autowired
    DictCantonPOMapper dictCantonPOMapper;

    @Autowired
    DictBerthCityPOMapper dictBerthCityPOMapper;

    @Autowired
    SysAreaAssService sysAreaAssService;

    /**
     * 添加泊位接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult add(DictBerthCityAddParams param) {

        DictBerthCityPOExample example = new DictBerthCityPOExample();
        example.createCriteria().andSnCodeEqualTo(param.getSnCode());
        long count = dictBerthCityPOMapper.countByExample(example);
        if(count>0){
            return CommonResult.failed("泊位设备SN号不能重复！");
        }

        DictBerthCityPOExample example2 = new DictBerthCityPOExample();
        example2.createCriteria().andBerthCodeEqualTo(param.getBerthCode());
        long count2 = dictBerthCityPOMapper.countByExample(example2);
        if(count2>0){
            return CommonResult.failed("泊位号不能重复！");
        }

        DictBerthCityPO po = new DictBerthCityPO();
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setAddUser(param.getLoginSysUserId());

        //查询城市ID
        po.setCityId(this.getCityId(param.getCantonId()));

        dictBerthCityPOMapper.insertSelective(po);

        //更新路段泊位数
        dictSectionPOMapper.updateTotalBerthNo(po.getSectionId());
        return CommonResult.success();
    }

    /**
     * 更新泊位接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(DictBerthCityUpdateParams param) {
        DictBerthCityPO po = new DictBerthCityPO();

        if(Objects.nonNull(param.getSnCode())){
            DictBerthCityPOExample example = new DictBerthCityPOExample();
            example.createCriteria().andSnCodeEqualTo(param.getSnCode()).andBerthIdNotEqualTo(param.getBerthId());
            long count = dictBerthCityPOMapper.countByExample(example);
            if(count>0){
                return CommonResult.failed("泊位设备SN号不能重复！");
            }
        }

        if(Objects.nonNull(param.getBerthCode())){
            DictBerthCityPOExample example2 = new DictBerthCityPOExample();
            example2.createCriteria().andBerthCodeEqualTo(param.getBerthCode()).andBerthIdNotEqualTo(param.getBerthId());
            long count2 = dictBerthCityPOMapper.countByExample(example2);
            if(count2>0){
                return CommonResult.failed("泊位号不能重复！");
            }
        }


        BeanUtils.copyProperties(param, po);
        //查询城市ID
        po.setCityId(this.getCityId(param.getCantonId()));

        dictBerthCityPOMapper.updateByPrimaryKeySelective(po);
        return CommonResult.success();
    }

    /**
     * 泊位详情
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<DictBerthCityVO> detail(DictBerthCityDetailParams param) {
        DictBerthCityPO po = dictBerthCityPOMapper.selectByPrimaryKey(param.getBerthId());
        if (po == null) {
            return CommonResult.failed("数据不存在");
        }
        DictBerthCityVO vo = new DictBerthCityVO();
        BeanUtils.copyProperties(po, vo);
        return CommonResult.success(vo);
    }

    /**
     * 搜索泊位接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<DictBerthCityVO>> search(DictBerthCitySearchParams param) {
        DictBerthCityDto dto = new DictBerthCityDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);

        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<DictBerthCityVO> resultList = dictBerthCityPOMapper.selectByDto(dto);
        PageInfo<DictBerthCityVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<DictBerthCityVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    /**
     * 根据行政区ID获取城市ID
     *
     * @param cantonId
     * @return
     */
    private Integer getCityId(Integer cantonId) {
        if (cantonId == null) {
            return null;
        }
        DictCantonPO po = dictCantonPOMapper.selectByPrimaryKey(cantonId);
        if (po == null) {
            return null;
        }
        return po.getCityId();
    }
}