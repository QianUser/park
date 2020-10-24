package com.park.cloud.common.domain.params.third;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 阿里云短信发送验证码参数.
 */
@Data
@ApiModel
public class AliSmsVerifyCodeParams implements Serializable{

    @ApiModelProperty(value = "待发送手机号，多个以逗号隔开", required = true)
    private String phoneNumbers;

    @ApiModelProperty(value = "验证码", required = true)
    private String code;

    @ApiModelProperty(value = "手机区号/国家区号", example = "0086或者+86")
    private String mobileCode;

}
