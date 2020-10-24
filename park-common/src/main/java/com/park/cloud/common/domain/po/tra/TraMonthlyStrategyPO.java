package com.park.cloud.common.domain.po.tra;

import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
public class TraMonthlyStrategyPO {
    private Integer monthlyStrategyId;

    private String monthlyStrategyName;

    private String remark;

    private Date addTime;

    private Integer addUser;

}