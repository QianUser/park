package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class TraMonthlyTicketOrderVO {

    private Integer id;

    @ApiModelProperty("停车场Id或者路段Id")
    private Integer parkingSectionId;

    @ApiModelProperty("停车场类型，0路外停车场；1路内停车场")
    private Integer parkingType;

    @ApiModelProperty("生成的订单号（与交易记录表的BargainOrderCode关联）")
    private String monthlyTicketOrderNo;

    @ApiModelProperty("包月策略id")
    private Integer monthlyRateId;

    @ApiModelProperty("包月策略名称")
    private String monthlyStrategyName;

    @ApiModelProperty("日期类型（1工作日日间2工作日夜间和非工作日全天，3 全天）")
    private Integer rateDateType;

    @ApiModelProperty("用户id")
    private String parkUserId;

    @ApiModelProperty("包月价格（元）")
    private Integer monthlyTicketPrice;

    @ApiModelProperty("租赁月数")
    private Integer monthNum;

    @ApiModelProperty("支付金额")
    private Integer payPrice;

    @ApiModelProperty("车牌号")
    private String plateNumber;

    @ApiModelProperty("1蓝2绿3黄4其他")
    private Integer plateType;

    @ApiModelProperty("1未付款，2已付款，3已退款")
    private Integer orderStatus;

    @ApiModelProperty("包月开始日期")
    private Date startDate;

    @ApiModelProperty("包月结束日期")
    private Date endDate;

    @ApiModelProperty("支付方式0 PDA扫码支付 1余额支付 2微信支付 3支付宝支付 4 招行一卡通支付 5 线下支付（招行聚合二维码）")
    private Integer payType;

    @ApiModelProperty("第三方支付网关交易流水号（微信支付，支付宝）")
    private String payerTradeNo;

    @ApiModelProperty("1购买 2续费")
    private Byte orderType;
}
