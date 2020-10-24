package com.park.cloud.common.domain.po.sys;

import lombok.Data;

import java.util.Date;

@Data
public class SysRolePO {
    private Integer roleId;

    private String roleName;

    private String roleRemark;

    private String pageIds;

    private String menuContent;

    private Integer roleStatus;

    private Date addTime;

    private Integer addUser;
}