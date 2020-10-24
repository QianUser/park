package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * 用户登录
 */
@Data
@ApiModel
public class SysUserLoginParams implements Serializable{

    @NotEmpty(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名", example = "admin")
    private String userName;

    @NotEmpty(message = "密码不能为空")
    @ApiModelProperty(value = "密码,将密码进行MD5加密", example = "228b00fc523097b886548334e5d24947")
    private String userPwd;
}
