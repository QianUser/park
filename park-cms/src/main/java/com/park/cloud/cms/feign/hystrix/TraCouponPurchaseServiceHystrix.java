package com.park.cloud.cms.feign.hystrix;

import com.park.cloud.cms.feign.TraCouponPurchaseService;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.TraCouponPurchaseParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.CouponPurchaseVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TraCouponPurchaseServiceHystrix implements TraCouponPurchaseService {
    @Override
    public CommonResult<PageHelperVO<CouponPurchaseVO>> getCouponPurchasePOs(TraCouponPurchaseParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<List<CouponPurchaseVO>> allList(TraCouponPurchaseParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }
}
