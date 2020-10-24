package com.park.cloud.common.domain.po.dict;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class DictSectionPO {
    private Integer sectionId;

    private String sectionName;

    private Integer cityId;

    private Integer cantonId;

    private Integer areaId;

    private Integer monthlyTicketLimit;

    private Integer monthlyTicketPrice;

    private Integer pricingStrategyId;

    private Integer monthlyStrategyId;

    private Integer sectionMold;

    private String sectionLongitude;

    private String sectionLatitude;

    private String sectionRemark;

    private Date addTime;

    private Integer addUser;

    private String bottomDirection;

    private String seationAddress;

    private String policeSectionCode;

    private String policeSectionName;

    private Integer berthForm;

    private String cityCode;

    private Integer totalBerthNo;

    private Integer currentBerthNo;

    private BigDecimal saturation;
}