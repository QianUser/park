package com.park.cloud.cms.feign;

import com.park.cloud.cms.feign.hystrix.TraPricingStrategyServiceHystrix;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.order.TraPricingStrategyListParams;
import com.park.cloud.common.domain.params.order.TraPricingStrategyParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.TraPricingStrategyVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author liuhainan
 */
@Service
@FeignClient(value = "park-order-service", fallback = TraPricingStrategyServiceHystrix.class)
public interface TraPricingStrategyService {

    @PostMapping("pricingStrategy/list")
    CommonResult<PageHelperVO<TraPricingStrategyVO>> selectList(@RequestBody TraPricingStrategyListParams params);

    @PostMapping("pricingStrategy/all")
    CommonResult<List<TraPricingStrategyVO>> all(@RequestBody TraPricingStrategyListParams params);

    @PostMapping("pricingStrategy/detail")
    CommonResult<TraPricingStrategyVO> detail(@RequestBody IdParams params);


    @PostMapping("pricingStrategy/insert")
    CommonResult<TraPricingStrategyVO> insert(@RequestBody TraPricingStrategyParams traPricingStrategyPO);

    @PostMapping("pricingStrategy/update")
    CommonResult update(@RequestBody TraPricingStrategyParams params);

    @PostMapping("pricingStrategy/deleteById")
    CommonResult deleteById(@RequestBody IdParams params);
}
