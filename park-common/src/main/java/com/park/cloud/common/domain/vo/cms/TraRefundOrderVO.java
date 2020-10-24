package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("退费订单参数")
public class TraRefundOrderVO {

    @ApiModelProperty("主键")
    private Long refundOrderId;

    @ApiModelProperty("订单编号")
    private String bargainOrderCode;

    @ApiModelProperty("支付单编号")
    private Integer orderPaymentId;

    @ApiModelProperty("退费订单编号")
    private String refundOrderCode;

    @ApiModelProperty("泊位编号")
    private String berthCode;

    @ApiModelProperty("退费金额")
    private Integer refundPrice;

    @ApiModelProperty("停车场名称")
    private String parkingName;

    @ApiModelProperty("退费时间")
    private Date refundTime;

    @ApiModelProperty("状态（1：未退费 2：已退费")
    private Integer refundStatus;

    @ApiModelProperty("类型（0，未知 1，正常退费 2，异常改单退费）")
    private Integer refundType;

    @ApiModelProperty("订单类型（0路外订单；1路内订单）")
    private Integer bargainOrderType;

    @ApiModelProperty("备注")
    private String remark;
}
