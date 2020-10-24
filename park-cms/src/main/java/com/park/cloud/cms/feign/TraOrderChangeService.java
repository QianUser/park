package com.park.cloud.cms.feign;

import com.park.cloud.cms.feign.hystrix.TraOrderChangeServiceHystrix;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.TraOrderChangeListParams;
import com.park.cloud.common.domain.params.order.TraOrderChangeParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.TraOrderChangeVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author liuhainan
 */
@Service
@FeignClient(value = "park-order-service", fallback = TraOrderChangeServiceHystrix.class)
public interface TraOrderChangeService {


    /**
     * 新增改单记录
     * @param params
     * @return
     */
    @PostMapping("orderChange/add")
    CommonResult<String> add(@RequestBody TraOrderChangeParams params);

    /**
     * 根据订单编号查询改单历史
     * @param params
     * @return
     */
    @PostMapping("orderChange/list")
    CommonResult<PageHelperVO<TraOrderChangeVO>> list(@RequestBody TraOrderChangeListParams params);


}
