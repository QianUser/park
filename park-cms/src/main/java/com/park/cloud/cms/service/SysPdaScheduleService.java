package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaScheduleListVO;
import com.park.cloud.common.domain.vo.cms.SysPdaScheduleVO;

import java.util.List;

/**
 * SysPdaScheduleService
 * 班次管理服务
 *
 * @author zyj
 * @date 2020/2/25
 */
public interface SysPdaScheduleService {

    /**
     * 班次列表查询
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<SysPdaScheduleVO>> search(SysPdaScheduleSearchParams param);

    /**
     * 添加班次
     * @param param
     * @return
     */
    CommonResult add(SysPdaScheduleAddParams param);

    /**
     * 更新班次
     * @param param
     * @return
     */
    CommonResult update(SysPdaScheduleUpdateParams param);

    /**
     * 班次详情
     * @param param
     * @return
     */
    CommonResult<SysPdaScheduleVO> detail(SysPdaScheduleDetailParams param);

    /**
     * 删除班次
     * @param param
     * @return
     */
    CommonResult delete(SysPdaScheduleDeleteParams param);

    CommonResult<List<SysPdaScheduleListVO>> list(SysPdaScheduleListParams param);
}