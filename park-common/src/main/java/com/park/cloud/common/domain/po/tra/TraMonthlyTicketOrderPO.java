package com.park.cloud.common.domain.po.tra;

import lombok.Data;

import java.util.Date;

@Data
public class TraMonthlyTicketOrderPO {
    private Integer id;

    private Integer parkingSectionId;

    private Integer parkingType;

    private String monthlyTicketOrderNo;

    private Integer monthlyRateId;

    private String parkUserId;

    private Integer monthlyTicketPrice;

    private Integer monthNum;

    private Integer payPrice;

    private String plateNumber;

    private Integer plateType;

    private Integer orderStatus;

    private Date startDate;

    private Date endDate;

    private Integer payType;

    private String payerTradeNo;

    private Integer orderType;
}