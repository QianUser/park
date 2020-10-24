package com.park.cloud.cms.feign.hystrix;

import com.park.cloud.cms.feign.TraCouponPolicyService;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.order.GetUserListParams;
import com.park.cloud.common.domain.params.order.TraCouponPolicyListParams;
import com.park.cloud.common.domain.params.order.TraCouponPolicyUpdateParams;
import com.park.cloud.common.domain.params.order.TraWxjlCouponPolicyParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.CouponPolicyVO;
import com.park.cloud.common.domain.vo.order.UserVo;
import org.springframework.stereotype.Component;

/**
 * @author liuhainan
 */
@Component
public class TraCouponPolicyServiceHystrix implements TraCouponPolicyService {
    @Override
    public CommonResult<PageHelperVO<CouponPolicyVO>> getcouponPolicyPOs(TraCouponPolicyListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult update(TraCouponPolicyUpdateParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult deleteById(IdParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult insert(TraWxjlCouponPolicyParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<PageHelperVO<UserVo>> userList(GetUserListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }
}
