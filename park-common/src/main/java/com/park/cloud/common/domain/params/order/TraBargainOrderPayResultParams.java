package com.park.cloud.common.domain.params.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author kris_ni
 * @date 2020/1/30
 */
@Data
@ApiModel
@ToString
public class TraBargainOrderPayResultParams {

    @ApiModelProperty(value = "支付状态：0失败；1成功")
    private Integer payStatus;

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    @ApiModelProperty(value = "支付流水号")
    private String payerTradeNo;

    @ApiModelProperty(value = "失败信息")
    private String errMsg;

    @ApiModelProperty(value = "支付金额")
    private Integer payPrice;

    @ApiModelProperty(value = "支付业务类型：1停车费，2包月券购买；3购买优惠券")
    private String subId;

}


