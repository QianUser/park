package com.park.cloud.common.domain.params.order;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kris_ni
 * @date 2020/1/21
 */
@Data
public class TraBargainOrderPayParams {

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    @ApiModelProperty("用户优惠券主键")
    private Integer ucId;

    @ApiModelProperty(value = "支付用户的openid")
    private String openId;

    @ApiModelProperty(value = "支付方式0 PDA扫码支付 1余额支付 2微信支付 3支付宝支付 4 招行一卡通支付 5 线下支付（招行聚合二维码）")
    private Integer payType;

    @ApiModelProperty(value = "支付业务类型：1停车费，2包月券购买；3购买优惠券")
    private Integer subId;

    @ApiModelProperty(value = "支付用户的停车号")
    private String parkUserId;

}
