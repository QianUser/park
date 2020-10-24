package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserScheduleDetailVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserScheduleVO;

import java.util.List;

/**
 * SysPdaScheduleService
 * 班次管理服务
 *
 * @author zyj
 * @date 2020/2/25
 */
public interface SysPdaUserScheduleService {

    /**
     * 排班列表查询
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<SysPdaUserScheduleVO>> search(SysPdaUserScheduleSearchParams param);

    /**
     * 排班详情
     * @param param
     * @return
     */
    CommonResult<List<SysPdaUserScheduleDetailVO>> detail(SysPdaUserScheduleDetailParams param);

    /**
     * 删除排班
     * @param param
     * @return
     */
    CommonResult delete(SysPdaUserScheduleDeleteParams param);

    /**
     * 添加排班
     * @param param
     * @return
     */
    CommonResult add(SysPdaUserScheduleAddParams param);

    /**
     * 新增删除排班
     * @param param
     * @return
     */
    CommonResult update(SysPdaUserScheduleUpdateParams param);
}