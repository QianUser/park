package com.park.cloud.common.domain.po.tra;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class TraOrderPaymentInfoPO {

    private Long orderPaymentId;

    private String bargainOrderCode;

    private String parkUserId;

    private Integer applyDuration;

    private Integer payPrice;

    private Integer applyMethod;

    private Integer payType;

    private Integer payMethod;

    private LocalDateTime addTime;

    private String berthCode;

    private Integer payStatus;

    private LocalDateTime applyInTime;

    private LocalDateTime paymentTime;

    private String paymentCode;

    private Integer bargainOrderType;

    private String payerTradeNo;

    private Byte refundStatus;

    private Integer refundPrice;

}