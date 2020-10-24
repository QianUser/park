package com.park.cloud.common.domain.po.dict;

import lombok.Data;

import java.util.Date;

@Data
public class DictCantonPO {
    private Integer cantonId;

    private String cantonName;

    private String cantonCode;

    private String cantonRemark;

    private Integer cityId;

    private Date addTime;

    private Integer addUser;

    private String cantonLat;

    private String cantonLng;

}