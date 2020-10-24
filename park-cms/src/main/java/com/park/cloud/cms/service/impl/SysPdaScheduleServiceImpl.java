package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.SysPdaScheduleMapper;
import com.park.cloud.cms.service.SysPdaScheduleService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.SysPdaScheduleDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.sys.SysPdaSchedulePO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaScheduleListVO;
import com.park.cloud.common.domain.vo.cms.SysPdaScheduleVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 班次管理服务
 *
 * @author zyj
 * @date 2020/2/25
 */
@Service
@Slf4j
public class SysPdaScheduleServiceImpl implements SysPdaScheduleService {

    @Autowired
    SysPdaScheduleMapper sysPdaScheduleMapper;

    /**
     * 班次列表查询
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<SysPdaScheduleVO>> search(SysPdaScheduleSearchParams param) {
        try {
            //设置分页查询
            PageHelper.startPage(param.getPageNum(), param.getPageSize());

            SysPdaScheduleDto dto = new SysPdaScheduleDto();
            BeanUtils.copyProperties(param, dto);
            List<SysPdaSchedulePO> resultList = sysPdaScheduleMapper.selectSchedule(dto);
            PageInfo<SysPdaSchedulePO> pageInfo = new PageInfo<>(resultList);
            PageHelperVO<SysPdaScheduleVO> pageHelperResponse = new PageHelperVO<>();
            BeanUtils.copyProperties(pageInfo, pageHelperResponse);
            List<SysPdaScheduleVO> list = new ArrayList<>();
            pageHelperResponse.setList(list);
            if (!CollectionUtils.isEmpty(resultList)) {
                for (SysPdaSchedulePO po : resultList) {
                    SysPdaScheduleVO vo = new SysPdaScheduleVO();
                    BeanUtils.copyProperties(po, vo);
                    list.add(vo);
                }
            }
        return CommonResult.success(pageHelperResponse);
        } catch (Exception e) {
            log.error("获取班次列表失败：", e);
            return CommonResult.failed();
        }
    }

    /**
     * 添加班次
     * @param param
     * @return
     */
    @Override
    public CommonResult add(SysPdaScheduleAddParams param) {
        SysPdaSchedulePO po = new SysPdaSchedulePO();
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setAddUser(param.getLoginSysUserId());
        sysPdaScheduleMapper.insertSelective(po);
        return CommonResult.success();
    }

    /**
     * 更新班次
     * @param param
     * @return
     */
    @Override
    public CommonResult update(SysPdaScheduleUpdateParams param) {
        SysPdaSchedulePO po = new SysPdaSchedulePO();
        BeanUtils.copyProperties(param, po);
        sysPdaScheduleMapper.updateByPrimaryKeySelective(po);
        return CommonResult.success();
    }

    /**
     * 班次详情
     * @param param
     * @return
     */
    @Override
    public CommonResult<SysPdaScheduleVO> detail(SysPdaScheduleDetailParams param) {
        SysPdaScheduleDto dto = new SysPdaScheduleDto();
        BeanUtils.copyProperties(param, dto);
        SysPdaSchedulePO result = sysPdaScheduleMapper.selectByPrimaryKey(dto);
        SysPdaScheduleVO vo = new SysPdaScheduleVO();
        if (result != null) {
            BeanUtils.copyProperties(result, vo);
        }
        return CommonResult.success(vo);
    }

    /**
     * 删除班次
     * @param param
     * @return
     */
    @Override
    public CommonResult delete(SysPdaScheduleDeleteParams param) {
        SysPdaSchedulePO po = new SysPdaSchedulePO();
        BeanUtils.copyProperties(param, po);
        sysPdaScheduleMapper.deleteByPrimaryKey(po);
        return CommonResult.success();
    }

    @Override
    public CommonResult<List<SysPdaScheduleListVO>> list(SysPdaScheduleListParams param) {
        return null;
    }

}