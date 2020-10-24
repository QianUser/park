package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户修改个人信息
 */
@Data
@ApiModel
public class SysUserUpdatePersonalInfoParams extends CmsBaseParams {

    @ApiModelProperty(value = "真实姓名")
    private String userTrueName;

    @ApiModelProperty(value = "性别 1男,0女")
    private Integer userSex;

    @ApiModelProperty(value = "手机号码")
    private String userMobileNumber;

    @ApiModelProperty(value = "电子邮箱")
    private String userEmail;
}
