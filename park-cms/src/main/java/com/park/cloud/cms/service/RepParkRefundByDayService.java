package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.RepParkCountRefundParams;
import com.park.cloud.common.domain.params.cms.RepParkRefundByDayParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.RepParkCountRefundVO;
import com.park.cloud.common.domain.vo.cms.RepParkRefundByDayVO;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface RepParkRefundByDayService {
    CommonResult<PageHelperVO<RepParkRefundByDayVO>> getRepParkRefund(RepParkRefundByDayParams params);


    CommonResult<RepParkCountRefundVO> dealStatistics(RepParkCountRefundParams params);
}
