package com.park.cloud.common.domain.po.dict;

import lombok.Data;

import java.util.Date;

@Data
public class DictAreaPO {
    private Integer areaId;

    private String areaCode;

    private String areaName;

    private Integer cantonId;

    private String areaRemark;

    private Date addTime;

    private Integer addUser;

    private String networkNum;

}