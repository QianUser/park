package com.park.cloud.common.domain.po.rep;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class RepBerthUsePO {
    private Integer berthUseId;

    private String statisticsDay;

    private Integer cityId;

    private Integer cantonId;

    private Integer areaId;

    private Integer sectionId;

    private String sectionName;

    private Integer applyMethod;

    private String berthCode;

    private Integer payNum;

    private Integer tradeNum;

    private BigDecimal payNumRate;

    private Integer payPrice;

    private Integer arrearsPrice;

    private Integer receivablePrice;

    private BigDecimal payPriceRate;

    private Date addTime;

}