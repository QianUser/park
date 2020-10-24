package com.park.cloud.common.domain.po.rep;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class RepParkOperateByHourPO {
    private Integer id;

    private String statisticsDay;

    private String statisticsHour;

    private Integer cityId;

    private Integer cantonId;

    private Integer areaId;

    private Integer parkingSectionId;

    private String parkingSectionName;

    private Integer parkingType;

    private Integer parkNum;

    private Integer currentParkNum;

    private Integer totalParkNum;

    private Integer payNum;

    private Integer arrearsNum;

    private Integer receivablePrice;

    private Integer receiptPrice;

    private BigDecimal payRatio;

    private Date addTime;

}