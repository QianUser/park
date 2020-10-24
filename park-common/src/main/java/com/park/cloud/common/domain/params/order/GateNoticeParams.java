package com.park.cloud.common.domain.params.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kris_ni
 * @date 2020/3/12
 */
@Data
@ApiModel
public class GateNoticeParams {

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "路外停车场编号")
    private String parkCode;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;

    @ApiModelProperty(value = "支付金额，单位分")
    private Integer amount;

    @ApiModelProperty(value = "支付方式0 PDA扫码支付 1余额支付 2微信支付 3支付宝支付 4 招行一卡通支付 5 线下支付（招行聚合二维码）")
    private Integer payType;

    @ApiModelProperty(value = "支付方式产生的订单号（支付流水号）")
    private String payerTradeNo;

    @ApiModelProperty(value = "停车场生成的订单号（与交易记录表的BargainOrderCode关联")
    private String parkOrderNo;
}
