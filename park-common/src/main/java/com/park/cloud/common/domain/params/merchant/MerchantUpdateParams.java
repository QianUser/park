package com.park.cloud.common.domain.params.merchant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/05/09 10:20
 */
@Data
@ApiModel
public class MerchantUpdateParams extends MerchantBaseParams{


    @NotNull(message = "商户ID不能为空")
    @ApiModelProperty(value = "商户ID", required = true)
    private Integer mid;

    @ApiModelProperty(value = "商户名")
    private String mInfoName;

    @ApiModelProperty(value = "联系人")
    private String mInfoContacts;

    @ApiModelProperty(value = "电话")
    private String mTelephone;

    @ApiModelProperty(value = "地址")
    private String mAddress;

    @ApiModelProperty(value = "登录账号")
    private String mUid;

    @ApiModelProperty(value = "登陆密码")
    private String mPwd;

    @ApiModelProperty(value = "商户状态(0已锁定 1启用中)")
    private Integer mUserStatus;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "微信openId")
    private String merchantOpenId;
}
