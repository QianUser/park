package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface RepParkOperateByMonthService {
    //仅查询报表上方数据
    CommonResult<RepParkOperateByMonthVO> dealStatistics(RepParkOperateByMonthCountParams params);

    CommonResult<PageHelperVO<RepParkOperateByMonthPageVO>> getRepOperateByMonth(RepParkOperateByMonthParams params);


    CommonResult<PageHelperVO<RepParkOperateDetailsVO>> detailsList(RepPerkOperateDetailsParams params);


    CommonResult<PageHelperVO<RepRunStatisticsByMonthVO>> getRunStatisticsByMonth(RepRunStatisticsByMonthParams params);


    CommonResult<RepRunStatisticsTopVO> repRunStatistics(RepRunStatisticsByMonthParams params);

    CommonResult<List<RepRunBelowStatisticsVO>> repRunBelowStatistics(RepRunStatisticsByMonthParams params);

}
