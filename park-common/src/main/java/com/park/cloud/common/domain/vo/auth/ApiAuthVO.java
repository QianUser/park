package com.park.cloud.common.domain.vo.auth;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 接口认证
 * @author 1004185
 */
@Data
@ApiModel
public class ApiAuthVO implements Serializable {

    @ApiModelProperty(value = "接口调用者")
    private String userName;

    @ApiModelProperty(value = "AccessId")
    private String accessId;

    @ApiModelProperty(value = "接口签名用秘钥")
    private String accessKey;

}
