package com.park.cloud.common.domain.po.rep;

import lombok.Data;

import java.util.Date;
@Data
public class RepParkRefundByDayPO {
    private Long id;

    private String statisticsDay;

    private Integer cityId;

    private Integer cantonId;

    private Integer areaId;

    private Integer parkingSectionId;

    private String parkingSectionName;

    private Integer parkingType;

    private Integer refundNum;

    private Integer refundPrice;

    private Date addTime;

}