package com.park.cloud.common.domain.po.opm;

import lombok.Data;

import java.util.Date;

@Data
public class OpmUnbindVehicleInfoPO {
    private Integer id;

    private String parkUserId;

    private String mobileNumber;

    private String plateNumber;

    private Integer plateType;

    private Date addTime;

    private Integer addUser;
}