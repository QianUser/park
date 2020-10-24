package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 用户更新支付密码
 */
@Data
@ApiModel
public class MebUserUpdatePayPwdParams extends ClientBaseParams {

    @NotNull(message = "用户ID不能为空")
    @ApiModelProperty(value = "用户ID", required = true)
    private Integer mebUserId;

    @NotEmpty(message = "验证码不能为空")
    @ApiModelProperty(value = "验证码", required = true)
    private String verifyCode;

    @NotEmpty(message = "密码不能为空")
    @ApiModelProperty(value = "用户交易支付密码", required = true)
    private String payPwd;

}
