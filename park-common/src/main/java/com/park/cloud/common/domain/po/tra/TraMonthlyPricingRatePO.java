package com.park.cloud.common.domain.po.tra;

import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
public class TraMonthlyPricingRatePO {
    private Integer monthlyRateId;

    private Integer monthlyStrategyId;

    private Date startTime;

    private Date endTime;

    private Integer rateDateType;

    private Integer ratePrice;

    private Date addTime;

    private Integer addUser;
}