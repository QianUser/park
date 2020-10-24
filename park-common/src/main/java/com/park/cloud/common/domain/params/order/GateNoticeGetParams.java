package com.park.cloud.common.domain.params.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kris_ni
 * @date 2020/3/24
 */
@Data
@ApiModel
public class GateNoticeGetParams {

    @ApiModelProperty(value = "金额（单位分）")
    private Integer totalFee;

    @ApiModelProperty(value = "商品id（调用方生成的商品id）")
    private String tradeNo;

    @ApiModelProperty(value = "支付人")
    private String payUserId;

    @ApiModelProperty(value = "返回的聚合支付传递的参数，例子：\"subId\":\"{\\\"amount\\\": 0, \\\"parkCode\\\": \\\"string\\\",  \\\"parkOrderNo\\\": \\\"string\\\",  \\\"plateNumber\\\": \\\"string\\\",  \\\"plateType\\\": 0}\"")
    private String subId;

    @ApiModelProperty(value = "支付方式产生的订单号")
    private String payTradeNo;

    @ApiModelProperty(value = "支付方式，2微信，3支付宝")
    private Integer payType;
}
