package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 巡检员管理添加参数
 */
@Data
@ApiModel
public class SysPdaUserAddParams extends CmsBaseParams {
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

}
