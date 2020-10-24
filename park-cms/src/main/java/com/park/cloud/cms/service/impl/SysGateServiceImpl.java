package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.SysUserPOMapper;
import com.park.cloud.cms.service.SysGateService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.SysUserDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysGateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 闸机服务
 */
@Service
@Slf4j
public class SysGateServiceImpl implements SysGateService {

    @Autowired
    SysUserPOMapper sysUserPOMapper;

    @Override
    public CommonResult add(SysGateAddParams param) {
        return CommonResult.success();
    }

    @Override
    public CommonResult update(SysGateUpdateParams param) {
        return CommonResult.success();
    }

    @Override
    public CommonResult<SysGateVO> detail(SysGateDetailParams param) {
        SysGateVO vo = new SysGateVO();
        return CommonResult.success(vo);
    }

    @Override
    public CommonResult delete(SysGateDeleteParams param) {
        return CommonResult.success();
    }

    @Override
    public CommonResult<PageHelperVO<SysGateVO>> search(SysGateSearchParams param) {
        SysUserDto dto = new SysUserDto();
        BeanUtils.copyProperties(param, dto);
        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        //todo
        List<SysGateVO> resultList = new ArrayList<>();
        PageInfo<SysGateVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<SysGateVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

}