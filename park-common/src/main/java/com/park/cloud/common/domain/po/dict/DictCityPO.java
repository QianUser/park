package com.park.cloud.common.domain.po.dict;

import lombok.Data;

import java.util.Date;

@Data
public class DictCityPO {
    private Integer cityId;

    private String cityName;

    private String cityCode;

    private String cityRemark;

    private Date addTime;

    private Integer addUser;

    private String cityLat;

    private String cityLng;

}