package com.park.cloud.common.domain.po.rep;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class RepParkOperateByMonthPO {
    private Integer id;

    private String statisticsDay;

    private Integer cityId;

    private Integer cantonId;

    private Integer areaId;

    private Integer parkingSectionId;

    private String parkingSectionName;

    private String parkingType;

    private Integer parkNum;

    private Integer tradEnum;

    private Integer payNum;

    private Integer arrearsNum;

    private Integer receivablePrice;

    private Integer receiptPrice;

    private BigDecimal payRatio;

    private Date addTime;

}