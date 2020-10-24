package com.park.cloud.cms.feign;

import com.park.cloud.cms.feign.hystrix.TraMonthlyStrategyServiceHystrix;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.order.TraMonthlyStrategyDeleteParams;
import com.park.cloud.common.domain.params.order.TraMonthlyStrategyListParams;
import com.park.cloud.common.domain.params.order.TraMonthlyStrategyParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.TraMonthlyStrategyVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author liuhainan
 */
@Service
@FeignClient(value = "park-order-service", fallback = TraMonthlyStrategyServiceHystrix.class)
public interface TraMonthlyStrategyService {

    @PostMapping("monthlyStrategy/add")
    CommonResult add(@RequestBody TraMonthlyStrategyParams params);

    @PostMapping("monthlyStrategy/update")
    CommonResult update(@RequestBody TraMonthlyStrategyParams params);

    @PostMapping("monthlyStrategy/delete")
    CommonResult delete(@RequestBody TraMonthlyStrategyDeleteParams params);

    @PostMapping("monthlyStrategy/list")
    CommonResult<PageHelperVO<TraMonthlyStrategyVO>> list(@RequestBody TraMonthlyStrategyListParams params);

    @PostMapping("monthlyStrategy/all")
    CommonResult<List<TraMonthlyStrategyVO>> all(@RequestBody TraMonthlyStrategyListParams params);

    @PostMapping("monthlyStrategy/detaile")
    CommonResult<TraMonthlyStrategyVO> detaile(@RequestBody IdParams params);
}
