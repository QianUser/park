package com.park.cloud.common.domain.po.dict;

import lombok.Data;

import java.util.Date;

@Data
public class DictSpecialListPO {
    private Integer specialListId;

    private String mobileNumber;

    private String plateNumber;

    private Integer plateType;

    private Integer areaId;

    private Integer cantonId;

    private String cardNumber;

    private Integer specialListType;

    private String specialListRemark;

    private Date addTime;

    private Integer addUser;

    private Integer companyId;

}