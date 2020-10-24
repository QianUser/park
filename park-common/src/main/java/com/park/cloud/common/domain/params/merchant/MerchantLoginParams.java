package com.park.cloud.common.domain.params.merchant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/05/07 17:51
 */
@Data
@ApiModel
public class MerchantLoginParams implements Serializable {

    @NotEmpty(message = "登陆账号不能为空")
    @ApiModelProperty(value = "登陆账号", example = "admin",required = true)
    private String merchantName;

    @NotEmpty(message = "密码不能为空")
    @ApiModelProperty(value = "密码,将密码进行MD5加密", example = "228b00fc523097b886548334e5d24947",required = true)
    private String merchantPwd;
}
