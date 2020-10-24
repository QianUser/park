package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class SysUserUpdateParams extends CmsBaseParams {

    @NotNull(message = "用户id不能为空")
    @ApiModelProperty(value = "用户id", required = true)
    private Integer userId;

    @ApiModelProperty(value = "登录账号")
    private String userName;

    @ApiModelProperty(value = "密码(明文)")
    private String userPwd;

    @ApiModelProperty(value = "用户真实姓名")
    private String userTrueName;

    @ApiModelProperty(value = "所属单位id")
    private Integer companyId;

    @ApiModelProperty(value = "用户部门id")
    private Integer userDeptId;

    @ApiModelProperty(value = "角色id)")
    private Integer roleId;

    @ApiModelProperty(value = "用户职位")
    private Integer positionId;

    @ApiModelProperty(value = "性别：1男,0女")
    private Integer userSex;

    @ApiModelProperty(value = "用户手机号码")
    private String userMobileNumber;

    @ApiModelProperty(value = "用户电子邮箱")
    private String userEmail;

    @ApiModelProperty(value = "用户状态（0：已锁定  1：启用中）")
    private Integer userStatus;
}