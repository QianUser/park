package com.park.cloud.cms.feign;


import com.park.cloud.cms.feign.hystrix.TraRefundOrderServiceHystrix;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.cms.TraRefundOrderParams;
import com.park.cloud.common.domain.params.order.TraBargainOrderListParams;
import com.park.cloud.common.domain.params.order.TraRefundOrderPoParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.TraRefundOrderVO;
import com.park.cloud.common.domain.vo.order.RefundBargainOrderVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author liuhainan
 */
@Service
@FeignClient(value = "park-order-service", fallback = TraRefundOrderServiceHystrix.class)
public interface TraRefundOrderService {

    @PostMapping("refundOrder/list")
    CommonResult<PageHelperVO<TraRefundOrderVO>> list(@RequestBody TraRefundOrderParams params);

    @PostMapping("refundOrder/listAll")
    CommonResult<List<TraRefundOrderVO>> listAll(@RequestBody TraRefundOrderParams params);

    @PostMapping("refundOrder/add")
    CommonResult<String >add(@RequestBody TraRefundOrderPoParams params);

    @PostMapping("refundOrder/refundAgain")
    CommonResult<String >refundAgain(@RequestBody IdParams params);

    @PostMapping("refundOrder/update")
    CommonResult<String>update(@RequestBody TraRefundOrderPoParams params);


    /**
     * 路边订单列表查询
     * @param params
     * @return
     */
    @PostMapping("refundOrder/insideList")
    CommonResult<PageHelperVO<RefundBargainOrderVO>> insideOrderlist(@RequestBody TraBargainOrderListParams params);

    /**
     * 路边订单列表查询
     * @param params
     * @return
     */
    @PostMapping("refundOrder/insideAllList")
    CommonResult<List<RefundBargainOrderVO>> insideAllList(@RequestBody TraBargainOrderListParams params);


    /**
     * 路外订单列表查询
     * @param params
     * @return
     */
    @PostMapping("refundOrder/outsideList")
    CommonResult<PageHelperVO<RefundBargainOrderVO>> outsideOrderlist(@RequestBody TraBargainOrderListParams params);

    /**
     * 路外订单列表查询
     * @param params
     * @return
     */
    @PostMapping("refundOrder/outsideAllList")
    CommonResult<List<RefundBargainOrderVO>> outsideAllList(@RequestBody TraBargainOrderListParams params);


}
