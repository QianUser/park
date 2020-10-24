package com.park.cloud.common.domain.po.meb;

import lombok.Data;

import java.util.Date;

@Data
public class MebBindVehicleInfoPO {
    private Integer mebBindVehicleInfoId;

    private String parkUserId;

    private String plateNumber;

    private Integer plateType;

    private Date addTime;

    private String viNumber;

    private Date lastTime;

    private Integer bindStatus;

    private Date unbundlingDate;

    private Integer isAutomatic;

    private Integer isAutoCoupon;

}