package com.park.cloud.common.domain.po.sys;

import lombok.Data;

import java.util.Date;

@Data
public class SysAreaAssPO {
    private Integer areaassId;

    private Integer userId;

    private Integer areaAssType;

    private String cityIds;

    private String cantonIds;

    private String areaIds;

    private String other;

    private Integer addUser;

    private Date addTime;

    private String remarks;

}