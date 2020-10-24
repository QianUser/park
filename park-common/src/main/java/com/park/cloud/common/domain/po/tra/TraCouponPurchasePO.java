package com.park.cloud.common.domain.po.tra;

import lombok.Data;

import java.util.Date;

@Data
public class TraCouponPurchasePO {
    private Integer copId;

    private Integer wxjlCpId;

    private String cmuId;

    private Integer buyerType;

    private Integer pNumber;

    private String buAmount;

    private Integer rTension;

    private Integer buyingChannel;

    private Date addTime;

    private Integer payStatus;

    private String payerTradeNo;

    private String couponPurchaseOrderNo;

}