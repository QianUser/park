package com.park.cloud.common.domain.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class MebUserDto implements Serializable {
    @ApiModelProperty(value = "手机号")
    private String mobileNumber;

    @ApiModelProperty(value = "用户openid")
    private String userOpenId;

    @ApiModelProperty(value = "停车服务号")
    private String parkUserId;

    @ApiModelProperty(value = "用户状态（已锁定 = 0,启用中 = 1,注销申请处理中 = 2,已注销 = 3）")
    private Integer userStatus;
}
