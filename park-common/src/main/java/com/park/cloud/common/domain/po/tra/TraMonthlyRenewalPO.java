package com.park.cloud.common.domain.po.tra;

import lombok.Data;

import java.util.Date;

@Data
public class TraMonthlyRenewalPO {
    private Integer monthlyRenewalId;

    private String monthlyTicketOrderNo;

    private String parkUserId;

    private Date addTime;

    private Integer monthlyTicketUserId;

    private Integer orderStatus;
}