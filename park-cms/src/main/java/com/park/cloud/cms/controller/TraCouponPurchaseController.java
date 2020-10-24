package com.park.cloud.cms.controller;

import com.park.cloud.cms.feign.TraCouponPurchaseService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.TraCouponPurchaseParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.CouponPurchaseVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author liuhainan
 */
@Api(value = "优惠券购买记录", tags = {"优惠券购买记录接口"})
@RequestMapping(value = "couponPurchase")
@Slf4j
@RestController
public class TraCouponPurchaseController {

    @Autowired
    private TraCouponPurchaseService purchaseService;

    @PostMapping("list")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    public CommonResult<PageHelperVO<CouponPurchaseVO>> getCouponPurchasePOs(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) TraCouponPurchaseParams params) {
        return purchaseService.getCouponPurchasePOs(params);
    }

}
