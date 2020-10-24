package com.park.cloud.common.domain.po.rep;

import lombok.Data;

import java.util.Date;
@Data
public class RepParkTimePO {
    private Integer id;

    private String statisticsDay;

    private String statisticsHour;

    private Integer cityId;

    private Integer cantonId;

    private Integer areaId;

    private Integer parkingSectionId;

    private String parkingSectionName;

    private Integer parkingType;

    private Integer parkTimeType;

    private Integer parkNum;

    private Date updateTime;

}