package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * 用户注册参数
 */
@Data
@ApiModel
public class MebUserRegParams extends ClientBaseParams {

    @NotEmpty(message = "手机号不能为空")
    @ApiModelProperty(value = "手机号", required = true)
    private String mobileNumber;

    @NotEmpty(message = "验证码不能为空")
    @ApiModelProperty(value = "验证码", required = true)
    private String verifyCode;

    @ApiModelProperty(value = "用户昵称")
    private String userNickname;

}
