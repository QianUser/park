package com.park.cloud.cms.feign;

import com.park.cloud.cms.feign.hystrix.TraUserCouponServiceHystrix;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.GetUserCouponParams;
import com.park.cloud.common.domain.params.order.TraUserCouponAddListParams;
import com.park.cloud.common.domain.params.order.TraUserCouponAddParams;
import com.park.cloud.common.domain.params.order.TraUserCouponParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.GetUserCouponVO;
import com.park.cloud.common.domain.vo.order.UserCouponVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author liuhainan
 */
@Service
@FeignClient(value = "park-order-service", fallback = TraUserCouponServiceHystrix.class)
public interface TraUserCouponService {

    @PostMapping("userCoupon/list")
    CommonResult<PageHelperVO<UserCouponVO>> queryList(@RequestBody TraUserCouponParams params);

    @PostMapping("userCoupon/allList")
    CommonResult<List<UserCouponVO>> allList(@RequestBody TraUserCouponParams params);

    @PostMapping("userCoupon/userCoupons")
    CommonResult<List<GetUserCouponVO>> userCoupons(@RequestBody GetUserCouponParams params);

    @PostMapping("userCoupon/add")
    CommonResult<String> add(@RequestBody TraUserCouponAddParams params);

    @PostMapping("userCoupon/addList")
    CommonResult<String> addList(@RequestBody TraUserCouponAddListParams params);
}

