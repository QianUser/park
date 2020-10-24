package com.park.cloud.common.domain.po.dict;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class DictParkingCityPO {
    private Integer parkingId;

    private String parkingName;

    private Integer parkingType;

    private Integer cityId;

    private Integer cantonId;

    private Integer areaId;

    private Integer sectionId;

    private Integer monthlyTicketLimit;

    private Integer monthlyTicketPrice;

    private Integer pricingStrategyId;

    private Integer monthlyStrategyId;

    private String parkingUser;

    private String parkingPwd;

    private Integer parkingMold;

    private Date addTime;

    private Integer addUser;

    private String seationAddress;

    private String managementUnit;

    private String parkingTel;

    private String imgPath;

    private Integer totalParkingNo;

    private Integer fixtureParkingNo;

    private Integer currentParkingNo;

    private String longitude;

    private String latitude;

    private String parkCode;

    private String cityCode;

    private String strategyInfo;

    private Integer companyId;

    private BigDecimal saturation;

    private Integer businessType;

    private String parkingRemark;

}