package com.park.cloud.cms.feign.hystrix;

import com.park.cloud.cms.feign.TraPricingStrategyService;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.order.TraPricingStrategyListParams;
import com.park.cloud.common.domain.params.order.TraPricingStrategyParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.TraPricingStrategyVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TraPricingStrategyServiceHystrix implements TraPricingStrategyService {

    @Override
    public CommonResult<PageHelperVO<TraPricingStrategyVO>> selectList(TraPricingStrategyListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<List<TraPricingStrategyVO>> all(TraPricingStrategyListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<TraPricingStrategyVO> detail(IdParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<TraPricingStrategyVO> insert(TraPricingStrategyParams traPricingStrategyPO) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult update(TraPricingStrategyParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult deleteById(IdParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }
}
