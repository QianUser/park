package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.SysCompanyPOMapper;
import com.park.cloud.cms.service.SysCompanyService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.SysCompanyDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.sys.SysCompanyPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysCompanyListVO;
import com.park.cloud.common.domain.vo.cms.SysCompanyVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 单位管理服务
 *
 * @author liyj
 * @create 2020/1/20
 * @since 1.0.0
 */
@Service
@Slf4j
public class SysCompanyServiceImpl implements SysCompanyService {

    @Autowired
    SysCompanyPOMapper sysCompanyPOMapper;

    /**
     * 添加单位接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult add(SysCompanyAddParams param) {
        SysCompanyPO po = new SysCompanyPO();
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setAddUser(param.getLoginSysUserId());
        sysCompanyPOMapper.insertSelective(po);
        return CommonResult.success();
    }

    /**
     * 更新单位接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(SysCompanyUpdateParams param) {
        SysCompanyPO po = new SysCompanyPO();
        BeanUtils.copyProperties(param, po);
        sysCompanyPOMapper.updateByPrimaryKeySelective(po);
        return CommonResult.success();
    }

    /**
     * 单位详情接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<SysCompanyVO> detail(SysCompanyDetailParams param) {
        SysCompanyPO po = sysCompanyPOMapper.selectByPrimaryKey(param.getCompanyId());
        if (po == null) {
            return CommonResult.failed("数据不存在");
        }
        SysCompanyVO vo = new SysCompanyVO();
        BeanUtils.copyProperties(po, vo);
        return CommonResult.success(vo);
    }

    /**
     * 搜索单位接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<SysCompanyVO>> search(SysCompanySearchParams param) {
        SysCompanyDto dto = new SysCompanyDto();
        BeanUtils.copyProperties(param, dto);
        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<SysCompanyVO> resultList = sysCompanyPOMapper.selectByDto(dto);
        PageInfo<SysCompanyVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<SysCompanyVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    /**
     * 单位列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<List<SysCompanyListVO>> list(SysCompanyListParams param) {
        SysCompanyDto dto = new SysCompanyDto();
        BeanUtils.copyProperties(param, dto);

        List<SysCompanyListVO> resultList = sysCompanyPOMapper.selectListByDto(dto);
        return CommonResult.success(resultList);
    }
}