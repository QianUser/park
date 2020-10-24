package com.park.cloud.cms.feign;

import com.park.cloud.cms.feign.hystrix.InvEinvoiceServiceHystrix;
import com.park.cloud.cms.feign.hystrix.TraCouponPurchaseServiceHystrix;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.TraCouponPurchaseParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.CouponPurchaseVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author liuhainan
 */
@Service
@FeignClient(value = "park-order-service", fallback = TraCouponPurchaseServiceHystrix.class)
public interface TraCouponPurchaseService {

    @PostMapping("couponPurchase/list")
    CommonResult<PageHelperVO<CouponPurchaseVO>> getCouponPurchasePOs(@RequestBody TraCouponPurchaseParams params);

    @PostMapping("couponPurchase/allList")
    CommonResult<List<CouponPurchaseVO>> allList(@RequestBody TraCouponPurchaseParams params);
}
