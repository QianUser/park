package com.park.cloud.cms.feign;

import com.park.cloud.cms.feign.hystrix.TraCouponPolicyServiceHystrix;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.order.GetUserListParams;
import com.park.cloud.common.domain.params.order.TraCouponPolicyListParams;
import com.park.cloud.common.domain.params.order.TraCouponPolicyUpdateParams;
import com.park.cloud.common.domain.params.order.TraWxjlCouponPolicyParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.CouponPolicyVO;
import com.park.cloud.common.domain.vo.order.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author liuhainan
 */
@Service
@FeignClient(value = "park-order-service", fallback = TraCouponPolicyServiceHystrix.class)
public interface TraCouponPolicyService {

    @PostMapping("couponPolicy/list")
    CommonResult<PageHelperVO<CouponPolicyVO>> getcouponPolicyPOs(@RequestBody TraCouponPolicyListParams params);

    @PostMapping("couponPolicy/update")
    CommonResult update(@RequestBody TraCouponPolicyUpdateParams params);

    @PostMapping("couponPolicy/deleteById")
    CommonResult deleteById(@RequestBody IdParams params);

    @PostMapping("couponPolicy/insert")
    CommonResult insert(@RequestBody TraWxjlCouponPolicyParams params);

    @PostMapping("couponPolicy/userList")
    CommonResult<PageHelperVO<UserVo>> userList(@RequestBody GetUserListParams params);
}
