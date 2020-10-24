package com.park.cloud.common.domain.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 支付记录
 *
 * @author liuhainan
 * @createDate 2020/04/11 10:17
 */
@Data
@ApiModel("支付记录")
public class OrderPaymentVO {

    @ApiModelProperty("主键")
    private Long orderPaymentId;

    @ApiModelProperty("订单编号")
    private String bargainOrderCode;

    @ApiModelProperty("停车号")
    private String parkUserId;

    @ApiModelProperty("用户申请时长")
    private Integer applyDuration;

    @ApiModelProperty("缴费/续费金额（分）")
    private Integer payPrice;

    @ApiModelProperty("缴费/续费方式（0:未知，1:手机APP,2:电话语音,3:电子标签," +
            "4:微信公众号,5:支付宝服务窗，6、PDA扫码，" +
            "7线下支付订单，8巡检员PDA代缴，9扫码（聚合、打印二维码）10、无感支付）")
    private Integer applyMethod;

    @ApiModelProperty("支付方式\\r0 PDA扫码支付\\r1余额支付\\r2微信支付\\r3支付宝支付\\r4 招行一卡通支付\\r5 线下支付（招行聚合二维码）\\r")
    private Integer payType;

    @ApiModelProperty("支付模式")
    private Integer payMethod;

    @ApiModelProperty("入库时间")
    private LocalDateTime addTime;

    @ApiModelProperty("泊位编号")
    private String berthCode;

    @ApiModelProperty("状态（,1：未清分 2：已清分 ）11和12缴费  ;21 和22是续费")
    private Integer payStatus;

    @ApiModelProperty("用户申请时间")
    private LocalDateTime applyInTime;

    @ApiModelProperty("扣费成功时间/订单记录时间")
    private LocalDateTime paymentTime;

    @ApiModelProperty("缴费订单编号")
    private String paymentCode;

    @ApiModelProperty("订单类型（0路外订单；1路内订单）")
    private Integer bargainOrderType;

    @ApiModelProperty("第三方支付网关交易流水号（微信支付，支付宝）")
    private String payerTradeNo;
}
