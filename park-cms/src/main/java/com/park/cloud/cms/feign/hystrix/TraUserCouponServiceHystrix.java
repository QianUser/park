package com.park.cloud.cms.feign.hystrix;

import com.park.cloud.cms.feign.TraUserCouponService;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.GetUserCouponParams;
import com.park.cloud.common.domain.params.order.TraUserCouponAddListParams;
import com.park.cloud.common.domain.params.order.TraUserCouponAddParams;
import com.park.cloud.common.domain.params.order.TraUserCouponParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.GetUserCouponVO;
import com.park.cloud.common.domain.vo.order.UserCouponVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TraUserCouponServiceHystrix implements TraUserCouponService {
    @Override
    public CommonResult<PageHelperVO<UserCouponVO>> queryList(TraUserCouponParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<List<UserCouponVO>> allList(TraUserCouponParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<List<GetUserCouponVO>> userCoupons(GetUserCouponParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult add(TraUserCouponAddParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<String> addList(TraUserCouponAddListParams params) {
        return  CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }
}
