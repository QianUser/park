package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class MebMerchantVO implements Serializable {

    @ApiModelProperty(value = "商户ID")
    private Integer mid;

    @ApiModelProperty(value = "商户编号")
    private String mInfoCode;

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

}