package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.RepParkFinanceByDayCountParams;
import com.park.cloud.common.domain.params.cms.RepParkFinanceByDayParams;
import com.park.cloud.common.domain.params.cms.RepParkFinanceDetailsParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.RepParkFinanceDetailsVO;
import com.park.cloud.common.domain.vo.cms.RepParkFinanceByDayCountVO;
import com.park.cloud.common.domain.vo.cms.RepParkFinanceByDayPageVO;
import com.park.cloud.common.domain.vo.cms.RepParkFinanceSummarizeVO;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface RepParkFinanceByDayService {
    CommonResult<RepParkFinanceByDayCountVO> dealStatistics(RepParkFinanceByDayCountParams params);

    CommonResult<PageHelperVO<RepParkFinanceByDayPageVO>> getRepParkFinance(RepParkFinanceByDayParams params);


    CommonResult<PageHelperVO<RepParkFinanceDetailsVO>> detailsList(RepParkFinanceDetailsParams params);

    CommonResult<List<RepParkFinanceDetailsVO>> detailsAllList(RepParkFinanceDetailsParams params,Boolean pageFlag);

    CommonResult<RepParkFinanceSummarizeVO> dealSummarize(RepParkFinanceByDayCountParams params);
}
