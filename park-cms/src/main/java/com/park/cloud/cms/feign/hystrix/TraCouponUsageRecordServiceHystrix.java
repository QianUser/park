package com.park.cloud.cms.feign.hystrix;

import com.park.cloud.cms.feign.TraCouponUsageRecordService;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.TraCouponUsageRecordParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.CouponUsageRecordVO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liuhainan
 */
@Component
public class TraCouponUsageRecordServiceHystrix implements TraCouponUsageRecordService {

    @Override
    public CommonResult<PageHelperVO<CouponUsageRecordVO>> getCouponUsageRecords(TraCouponUsageRecordParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<List<CouponUsageRecordVO>> allList(TraCouponUsageRecordParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }
}
