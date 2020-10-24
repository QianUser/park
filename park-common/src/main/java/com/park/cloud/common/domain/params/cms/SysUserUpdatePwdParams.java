package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 用户修改密码
 */
@Data
@ApiModel
public class SysUserUpdatePwdParams extends CmsBaseParams {

    @NotEmpty(message = "旧密码不能为空")
    @ApiModelProperty(value = "旧密码：将密码进行MD5加密", example = "228b00fc523097b886548334e5d24947")
    private String userPwdOld;

    @NotEmpty(message = "新密码不能为空")
    @ApiModelProperty(value = "新密码：明文", example = "123456")
    private String userPwd;
}
