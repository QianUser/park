package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class TraMonthlyTicketOrderAddParams extends ClientBaseParams{


    private Integer id;

    @NotNull(message = "停车场Id或者路段Id不能为空")
    @ApiModelProperty(value = "停车场Id或者路段Id",allowEmptyValue = false)
    private Integer parkingSectionId;

    @NotNull(message = "停车场类型不能为空")
    @ApiModelProperty(value = "停车场类型，0路外停车场；1路内停车场",allowEmptyValue = false)
    private Integer parkingType;

    @ApiModelProperty("生成的订单号（与交易记录表的BargainOrderCode关联）")
    private String monthlyTicketOrderNo;

    @NotNull(message = "包月策略id不能为空")
    @ApiModelProperty(value = "包月策略id",allowEmptyValue = false)
    private Integer monthlyRateId;

    @NotNull(message = "用户停车号不能为空")
    @ApiModelProperty(value = "用户停车号",allowEmptyValue = false)
    private String parkUserId;

    @ApiModelProperty("包月价格（元）")
    private Integer monthlyTicketPrice;

    @NotNull(message = "租赁月数不能为空")
    @ApiModelProperty(value = "租赁月数",allowEmptyValue = false)
    private Integer monthNum;

    @ApiModelProperty("支付金额")
    private Integer payPrice;

    @NotBlank(message = "车牌号不能为空！")
    @ApiModelProperty(value = "车牌号",allowEmptyValue = false)
    private String plateNumber;

    @NotNull(message = "车牌类型不能为空！")
    @ApiModelProperty(value = "1蓝2绿3黄4其他",allowEmptyValue = false)
    private Integer plateType;

    @ApiModelProperty("1未付款，2已付款，3已退款")
    private Integer orderStatus;

    @ApiModelProperty(value = "日期类型（1工作日日间2工作日夜间和非工作日全天，3 全天）")
    private Integer rateDateType;

    @ApiModelProperty("策略开始时间(HH:mm)")
    private String startTime;

    @ApiModelProperty("策略次日结束时间(HH:mm)")
    private String endTime;

    @ApiModelProperty("包月开始日期")
    private String startDate;

    @ApiModelProperty("包月结束日期")
    private String endDate;

    @NotNull(message = "支付方式不能为空")
    @ApiModelProperty(value = "支付方式0 PDA扫码支付 1余额支付 2微信支付 3支付宝支付 4 招行一卡通支付 5 线下支付（招行聚合二维码）",allowEmptyValue = false)
    private Integer payType;

    @ApiModelProperty("第三方支付网关交易流水号（微信支付，支付宝）")
    private String payerTradeNo;

    @ApiModelProperty("1购买 2续费")
    private Integer orderType;

}
