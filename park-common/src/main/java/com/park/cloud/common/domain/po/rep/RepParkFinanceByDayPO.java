package com.park.cloud.common.domain.po.rep;

import lombok.Data;

import java.util.Date;
@Data
public class RepParkFinanceByDayPO {
    private Integer id;

    private String statisticsDay;

    private Integer cityId;

    private Integer cantonId;

    private Integer areaId;

    private Integer parkingSectionId;

    private String parkingSectionName;

    private Integer parkingType;

    private Integer payType;

    private Integer payNum;

    private Integer receivablePrice;

    private Integer couponPrice;

    private Integer refundPrice;

    private Integer receiptPrice;

    private Integer arrearsPrice;

    private Date addTime;

}