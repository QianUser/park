package com.park.cloud.cms.feign;

import com.park.cloud.cms.feign.hystrix.OrderServiceHystrix;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
@FeignClient(value = "park-order-service", fallback = OrderServiceHystrix.class)
public interface OrderService {

    /**
     * 查询路内接口
     * @param params
     * @return
     */
    @RequestMapping(value = "bOrder/insideList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    CommonResult<PageHelperVO<BargainOrderVO>> insideList(@RequestBody TraBargainOrderListParams params);

    /**
     * 查询所有路内接口
     * @param params
     * @return
     */
    @RequestMapping(value = "bOrder/insideAllList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    CommonResult<List<BargainOrderVO>> insideAllList(@RequestBody TraBargainOrderListParams params);

    /**
     * 查询路内退费订单接口
     * @param params
     * @return
     */
    @RequestMapping(value = "bOrder/insideRefundList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    CommonResult<PageHelperVO<BargainOrderVO>> insideRefundList(@RequestBody TraBargainOrderListParams params);

    /**
     * 查询路外接口
     * @param params
     * @return
     */
    @RequestMapping(value = "bOrder/outsideList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    CommonResult<PageHelperVO<BargainOrderVO>> outsideList(@RequestBody  TraBargainOrderListParams params);

    /**
     * 查询路外接口
     * @param params
     * @return
     */
    @RequestMapping(value = "bOrder/outsideAllList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    CommonResult<List<BargainOrderVO>> outsideAllList(@RequestBody  TraBargainOrderListParams params);


    /**
     * 查询路外退费接口
     * @param params
     * @return
     */
    @RequestMapping(value = "bOrder/outsideRefundList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    CommonResult<PageHelperVO<BargainOrderVO>> outsideRefundList(@RequestBody  TraBargainOrderListParams params);

    /**
     * 改单
     * @param params
     * @return
     */
    @RequestMapping(value = "bOrder/changeOrder", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    CommonResult<ChangeOrderVO> changeOrder(@RequestBody TraBargainOrderChangeParams params);

    /**
     * 根据订单号计算当前进行中的订单金额
     * @param params
     * @return
     */
    @RequestMapping(value = "bOrder/calculate", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    CommonResult<TraBargainOrderVO> caculate(@RequestBody TraBargainOrderCaculateParams params);

    @RequestMapping(value = "bOrder/stopPark", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    CommonResult stopPark(@RequestBody StopParkParams params);

    /**
     * 所有列表查询
     * @param params
     * @return
     */
    @RequestMapping(value = "bOrder/list", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    CommonResult<PageHelperVO<BargainOrderVO>> list(@RequestBody TraBargainOrderListParams params);


    /**
     * 欠费订单列表
     * @param params
     * @return
     */
    @RequestMapping(value = "bOrder/unpayList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    CommonResult<PageHelperVO<TraBargainOrderVO>> unpayOrderList(@RequestBody TraBargainOrderListParams params);

    @RequestMapping(value = "bargainOrder/detail", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    CommonResult<BargainOrderDetailVO> orderDetail(@RequestBody TraBargainOrderDetailParams params);

    @RequestMapping(value = "bOrder/confirmChange", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    CommonResult confirmChange(@RequestBody TraBargainOrderChangeParams params);

    /**
     * 根据订单号查询支付订单
     * @param params
     * @return
     */
    @RequestMapping(value = "bOrder/orderPaymentList", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    CommonResult<List<OrderPaymentVO>> orderPaymentList(@RequestBody OrderPaymentParams  params);
}
