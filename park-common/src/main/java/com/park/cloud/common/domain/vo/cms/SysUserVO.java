package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class SysUserVO implements Serializable {

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "登录账号")
    private String userName;

    @ApiModelProperty(value = "真实姓名")
    private String userTrueName;

    @ApiModelProperty(value = "登录密码")
    private String userPwd;

    @ApiModelProperty(value = "性别 1男,0女")
    private Integer userSex;

    @ApiModelProperty(value = "手机号码")
    private String userMobileNumber;

    @ApiModelProperty(value = "电子邮箱")
    private String userEmail;

    @ApiModelProperty(value = "角色id")
    private Integer roleId;

    @ApiModelProperty(value = "所属单位id")
    private Integer companyId;

    @ApiModelProperty(value = "用户部门id")
    private Integer userDeptId;

    @ApiModelProperty(value = "用户职位")
    private Integer positionId;

    @ApiModelProperty(value = "用户状态（0：已锁定  1：启用中）")
    private Integer userStatus;

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

    @ApiModelProperty(value = "创建人姓名")
    private String addUserName;

    @ApiModelProperty(value = "角色名")
    private String roleName;

    @ApiModelProperty(value = "所属单位名")
    private String companyName;

    @ApiModelProperty(value = "用户部门名")
    private String userDeptName;

    @ApiModelProperty(value = "用户职位名")
    private String positionName;

}
