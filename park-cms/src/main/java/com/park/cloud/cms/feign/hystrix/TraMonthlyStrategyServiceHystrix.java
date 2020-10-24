package com.park.cloud.cms.feign.hystrix;

import com.park.cloud.cms.feign.TraMonthlyStrategyService;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.order.TraMonthlyStrategyDeleteParams;
import com.park.cloud.common.domain.params.order.TraMonthlyStrategyListParams;
import com.park.cloud.common.domain.params.order.TraMonthlyStrategyParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.TraMonthlyStrategyVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TraMonthlyStrategyServiceHystrix implements TraMonthlyStrategyService {
    @Override
    public CommonResult add(TraMonthlyStrategyParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult update(TraMonthlyStrategyParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult delete(TraMonthlyStrategyDeleteParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<PageHelperVO<TraMonthlyStrategyVO>> list(TraMonthlyStrategyListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<List<TraMonthlyStrategyVO>> all(TraMonthlyStrategyListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<TraMonthlyStrategyVO> detaile(IdParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }
}
