package com.park.cloud.common.domain.po.dict;

import lombok.Data;

import java.util.Date;

@Data
public class DictCityCodeTablePO {
    private Integer codeId;

    private String name;

    private String numberCode;

    private String letterCode;

    private Integer codeType;

    private String parentNumberCode;

    private Date addTime;

    private Integer addUser;

}