package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class SysUserAddParams extends CmsBaseParams {

    @NotEmpty(message = "登录账号不能为空")
    @ApiModelProperty(value = "登录账号", required = true)
    private String userName;

    @NotEmpty(message = "密码不能为空")
    @ApiModelProperty(value = "密码(明文)", required = true)
    private String userPwd;

    @NotEmpty(message = "真实姓名不能为空")
    @ApiModelProperty(value = "用户真实姓名", required = true)
    private String userTrueName;

    @NotNull(message = "所属单位不能为空")
    @ApiModelProperty(value = "所属单位id", required = true)
    private Integer companyId;

    //todo 适配360，其他环境打开
//    @NotNull(message = "用户部门不能为空")
    @ApiModelProperty(value = "用户部门id", required = true)
    private Integer userDeptId;

    //todo 适配360，其他环境打开
//    @NotNull(message = "角色不能为空")
    @ApiModelProperty(value = "角色id)", required = true)
    private Integer roleId;

    //todo 适配360，其他环境打开
//    @NotNull(message = "用户职位不能为空")
    @ApiModelProperty(value = "用户职位", required = true)
    private Integer positionId;

    @NotNull(message = "性别不能为空")
    @ApiModelProperty(value = "性别：1男,0女", required = true)
    private Integer userSex;

    @NotEmpty(message = "手机号码不能为空")
    @ApiModelProperty(value = "用户手机号码", required = true)
    private String userMobileNumber;

    //todo 适配360，其他环境打开
//    @NotEmpty(message = "电子邮箱不能为空")
    @ApiModelProperty(value = "用户电子邮箱", required = true)
    private String userEmail;

}