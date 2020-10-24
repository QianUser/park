package com.park.cloud.common.domain.po.sys;

import lombok.Data;

import java.util.Date;

@Data
public class SysUserPO {
    private Integer userId;

    private String userName;

    private String userPwd;

    private String userTrueName;

    private Integer companyId;

    private Integer userDeptId;

    private Integer roleId;

    private Integer areaId;

    private Integer positionId;

    private Integer userSex;

    private String userMobileNumber;

    private String userEmail;

    private Date addTime;

    private Integer addUser;

    private Integer userStatus;

}