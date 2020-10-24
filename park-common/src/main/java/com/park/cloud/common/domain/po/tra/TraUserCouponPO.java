package com.park.cloud.common.domain.po.tra;

import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
public class TraUserCouponPO {

    private Integer ucId;

    private String uCouponCode;

    private Integer copId;

    private Integer wxjlCpId;

    private String parkUserId;

    private Integer tsurplusNum;

    private String plateNumber;

    private Integer plateType;

    private Integer couponType;

    private String cmUid;

    private Integer pushStatus;

    private Date effTime;

    private Date failureTime;

    private Integer uparkingDownState;

    private Integer usageState;

    private String remark;

    private Date addTime;

}