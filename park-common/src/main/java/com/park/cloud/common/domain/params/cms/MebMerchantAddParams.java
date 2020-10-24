package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class MebMerchantAddParams extends CmsBaseParams {

    @NotEmpty(message = "商户名不能为空")
    @ApiModelProperty(value = "商户名", required = true)
    private String mInfoName;

    @NotEmpty(message = "联系人不能为空")
    @ApiModelProperty(value = "联系人", required = true)
    private String mInfoContacts;

    @NotEmpty(message = "电话不能为空")
    @ApiModelProperty(value = "电话", required = true)
    private String mTelephone;

    @NotEmpty(message = "地址不能为空")
    @ApiModelProperty(value = "地址", required = true)
    private String mAddress;

    @NotEmpty(message = "登录账号不能为空")
    @ApiModelProperty(value = "登录账号", required = true)
    private String mUid;

    @NotEmpty(message = "登陆密码不能为空")
    @ApiModelProperty(value = "登陆密码", required = true)
    private String mPwd;

    @NotNull(message = "商户状态不能为空")
    @ApiModelProperty(value = "商户状态(0已锁定 1启用中)", required = true)
    private Integer mUserStatus;

    @ApiModelProperty(value = "备注")
    private String remark;

}