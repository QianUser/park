package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 巡检员
 */
@Data
@ApiModel
public class SysPdaUserVO implements Serializable {
    @ApiModelProperty(value = "主键，自动增长")
    private Integer pdaUserId;

    @ApiModelProperty(value = "巡检员名称")
    private String pdaUserName;

    @ApiModelProperty(value = "用户密码")
    private String pdaUserPwd;

    @ApiModelProperty(value = "用户真实姓名")
    private String pdaUserTrueName;

    @ApiModelProperty(value = "手机号码")
    private String pdaUserMobileNumber;

    @ApiModelProperty(value = "用户电子邮箱")
    private String pdaUserEmail;

    @ApiModelProperty(value = "1男,0女")
    private Byte pdaUserSex;

    @ApiModelProperty(value = "用户所属中队id")
    private Integer pdaUserTeamId;

    @ApiModelProperty(value = "用户所属中队")
    private String pdaUserTeamName;

    @ApiModelProperty(value = "用户状态（0：已锁定  1：启用中）")
    private Byte pdaUserStatus;
}
