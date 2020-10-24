package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.SysPdaUserScheduleMapper;
import com.park.cloud.cms.service.SysPdaUserScheduleService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.SysPdaUserScheduleDetailDto;
import com.park.cloud.common.domain.dto.cms.SysPdaUserScheduleDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.sys.SysPdaUserScheduleDetailPO;
import com.park.cloud.common.domain.po.sys.SysPdaUserSchedulePO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserScheduleDetailVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserScheduleVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * 排班管理服务
 *
 * @author zyj
 * @date 2020/2/25
 */
@Service
@Slf4j
public class SysPdaUserScheduleServiceImpl implements SysPdaUserScheduleService {

    @Autowired
    SysPdaUserScheduleMapper sysPdaUserScheduleMapper;

    /**
     * 排班列表查询
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<SysPdaUserScheduleVO>> search(SysPdaUserScheduleSearchParams param) {
        try {
            //设置分页查询
            PageHelper.startPage(param.getPageNum(), param.getPageSize());

            SysPdaUserScheduleDto dto = new SysPdaUserScheduleDto();
            BeanUtils.copyProperties(param, dto);
            // 设置默认查询年份
            if (dto.getYear() == null) {
                dto.setYear(Calendar.getInstance().get(Calendar.YEAR));
            }
            List<SysPdaUserSchedulePO> resultList = sysPdaUserScheduleMapper.selectUserSchedule(dto);
            PageInfo<SysPdaUserSchedulePO> pageInfo = new PageInfo<>(resultList);
            PageHelperVO<SysPdaUserScheduleVO> pageHelperResponse = new PageHelperVO<>();
            BeanUtils.copyProperties(pageInfo, pageHelperResponse);
            List<SysPdaUserScheduleVO> list = new ArrayList<>();
            pageHelperResponse.setList(list);
            if (!CollectionUtils.isEmpty(resultList)) {
                for (SysPdaUserSchedulePO po : resultList) {
                    SysPdaUserScheduleVO vo = new SysPdaUserScheduleVO();
                    BeanUtils.copyProperties(po, vo);
                    vo.getScheduleMonth().removeIf(Objects::isNull);
                    list.add(vo);
                }
            }
            return CommonResult.success(pageHelperResponse);
        } catch (Exception e) {
            log.error("获取排班列表失败：", e);
            return CommonResult.failed();
        }
    }

    /**
     * 月排班详情
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<List<SysPdaUserScheduleDetailVO>> detail(SysPdaUserScheduleDetailParams param) {
        try {
            SysPdaUserScheduleDetailDto dto = new SysPdaUserScheduleDetailDto();
            BeanUtils.copyProperties(param, dto);
            List<SysPdaUserScheduleDetailPO> result = sysPdaUserScheduleMapper.selectUserScheduleDetail(dto);
            List<SysPdaUserScheduleDetailVO> voList = new ArrayList<>();
            if (!CollectionUtils.isEmpty(result)) {
                for (SysPdaUserScheduleDetailPO po : result) {
                    SysPdaUserScheduleDetailVO vo = new SysPdaUserScheduleDetailVO();
                    BeanUtils.copyProperties(po, vo);
                    voList.add(vo);
                }
            }
            return CommonResult.success(voList);
        } catch (Exception e) {
            log.error("获取排班详情失败：", e);
            return CommonResult.failed();
        }
    }

    /**
     * 删除排班
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult delete(SysPdaUserScheduleDeleteParams param) {
        try {
            SysPdaUserScheduleDetailPO po = new SysPdaUserScheduleDetailPO();
            BeanUtils.copyProperties(param, po);
            sysPdaUserScheduleMapper.deleteByPrimaryKey(po);
        } catch (Exception e) {
            log.error("删除排班列表失败：", e);
            return CommonResult.failed();
        }
        return CommonResult.success();
    }

    /**
     * 添加排班
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult add(SysPdaUserScheduleAddParams param) {
        try {
            SysPdaUserSchedulePO po = new SysPdaUserSchedulePO();
            BeanUtils.copyProperties(param, po);
            po.setAddTime(new Date());
            po.setAddUser(param.getLoginSysUserId());
            sysPdaUserScheduleMapper.insertSelective(po);
        } catch (Exception e) {
            log.error("新增排班列表失败：", e);
            return CommonResult.failed();
        }
        return CommonResult.success();
    }

    /**
     * 添加删除排班
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(SysPdaUserScheduleUpdateParams param) {
        try {
            List<SysPdaUserScheduleAddParams> addParams = param.getAddParams();
            if (!CollectionUtils.isEmpty(addParams)) {
                for (SysPdaUserScheduleAddParams addParam : addParams) {
                    SysPdaUserSchedulePO po = new SysPdaUserSchedulePO();
                    BeanUtils.copyProperties(addParam, po);
                    po.setAddTime(new Date());
                    po.setAddUser(param.getLoginSysUserId());
                    sysPdaUserScheduleMapper.insertSelective(po);
                }
            }

            List<SysPdaUserScheduleDeleteParams> deleteParams = param.getDeleteParams();
            if (!CollectionUtils.isEmpty(deleteParams)) {
                for (SysPdaUserScheduleDeleteParams deleteParam : deleteParams) {
                    SysPdaUserScheduleDetailPO po = new SysPdaUserScheduleDetailPO();
                    BeanUtils.copyProperties(deleteParam, po);
                    sysPdaUserScheduleMapper.deleteByPrimaryKey(po);
                }
            }
        } catch (Exception e) {
            log.error("新增删除排班列表失败：", e);
            return CommonResult.failed();
        }
        return CommonResult.success();
    }

}