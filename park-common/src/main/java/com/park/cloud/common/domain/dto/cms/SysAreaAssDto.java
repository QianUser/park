package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class SysAreaAssDto implements Serializable {

    @ApiModelProperty(value = "登录账号")
    private String userName;

    @ApiModelProperty(value = "用户真实姓名")
    private String userTrueName;

}