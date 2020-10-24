package com.park.cloud.common.domain.po.dac;

import lombok.Data;

import java.util.Date;
@Data
public class DacBerthInfoPO {
    private Long id;

    private String berthCode;

    private Integer operationState;

    private Integer updataType;

    private String cityCode;

    private String areaCode;

    private Float electriCity;

    private Float voltage;

    private Float temperature;

    private Date addTime;

    private String addUser;

    private String appKey;

    private String ipAddress;

}