package com.park.cloud.cms.feign.hystrix;

import com.park.cloud.cms.feign.OrderService;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liuhainan
 */
@Component
public class OrderServiceHystrix implements OrderService {


    @Override
    public CommonResult<PageHelperVO<BargainOrderVO>> insideList(TraBargainOrderListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<List<BargainOrderVO>> insideAllList(TraBargainOrderListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<PageHelperVO<BargainOrderVO>> insideRefundList(TraBargainOrderListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<PageHelperVO<BargainOrderVO>> outsideList(TraBargainOrderListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<List<BargainOrderVO>> outsideAllList(TraBargainOrderListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<PageHelperVO<BargainOrderVO>> outsideRefundList(TraBargainOrderListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<ChangeOrderVO> changeOrder(TraBargainOrderChangeParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<TraBargainOrderVO> caculate(TraBargainOrderCaculateParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult stopPark(StopParkParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<PageHelperVO<BargainOrderVO>> list(TraBargainOrderListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<PageHelperVO<TraBargainOrderVO>> unpayOrderList(TraBargainOrderListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<BargainOrderDetailVO> orderDetail(TraBargainOrderDetailParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult confirmChange(TraBargainOrderChangeParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<List<OrderPaymentVO>> orderPaymentList(OrderPaymentParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }
}
