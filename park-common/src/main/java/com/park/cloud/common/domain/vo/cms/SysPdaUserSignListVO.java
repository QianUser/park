package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 签到信息
 */
@Data
@ApiModel
public class SysPdaUserSignListVO implements Serializable {
    @ApiModelProperty(value = "签到信息名称")
    private String pdaUserName;

    @ApiModelProperty(value = "手机号码")
    private String pdaUserMobileNumber;

    @ApiModelProperty(value = "用户正式姓名")
    private String pdaUserTrueName;

    @ApiModelProperty(value = "用户所属中队")
    private String pdaUserTeamName;

    @ApiModelProperty(value = "用户状态（0：已锁定  1：启用中）")
    private Byte pdaUserStatus;
}
