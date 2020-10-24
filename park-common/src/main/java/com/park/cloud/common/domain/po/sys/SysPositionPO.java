package com.park.cloud.common.domain.po.sys;

import lombok.Data;

import java.util.Date;

@Data
public class SysPositionPO {
    private Integer positionId;

    private String positionName;

    private Integer positionSort;

    private Date addTime;

    private Integer addUser;

    private Integer companyId;

}