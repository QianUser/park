package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * 公众号接口参数基类
 */
@Data
@ApiModel
public class ClientBaseParams implements Serializable{

    @NotEmpty(message = "openid不能为空")
    @ApiModelProperty(value = "公众号用户openid")
    private String userOpenId;
}
