package com.park.cloud.cms.feign.hystrix;

import com.park.cloud.cms.feign.TraRefundOrderService;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.cms.TraRefundOrderParams;
import com.park.cloud.common.domain.params.order.TraBargainOrderListParams;
import com.park.cloud.common.domain.params.order.TraRefundOrderPoParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.TraRefundOrderVO;
import com.park.cloud.common.domain.vo.order.RefundBargainOrderVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TraRefundOrderServiceHystrix implements TraRefundOrderService {
    @Override
    public CommonResult<PageHelperVO<TraRefundOrderVO>> list(TraRefundOrderParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<List<TraRefundOrderVO>> listAll(TraRefundOrderParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<String> add(TraRefundOrderPoParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<String> refundAgain(IdParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<String> update(TraRefundOrderPoParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<PageHelperVO<RefundBargainOrderVO>> insideOrderlist(TraBargainOrderListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<List<RefundBargainOrderVO>> insideAllList(TraBargainOrderListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<PageHelperVO<RefundBargainOrderVO>> outsideOrderlist(TraBargainOrderListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<List<RefundBargainOrderVO>> outsideAllList(TraBargainOrderListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }
}
