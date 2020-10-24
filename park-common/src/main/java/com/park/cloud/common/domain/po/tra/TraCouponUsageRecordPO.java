package com.park.cloud.common.domain.po.tra;

import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
public class TraCouponUsageRecordPO {
    private Integer curId;

    private String uCouponCode;

    private String bargainOrderCode;

    private Date addTime;

}