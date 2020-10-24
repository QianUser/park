package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 微信公众号code
 */
@Data
@ApiModel
public class MebUserOpenIdParams {
    @NotEmpty(message = "code不能为空")
    @ApiModelProperty(value = "微信公众号code", required = true)
    private String code;
}
