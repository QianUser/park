package com.park.cloud.common.domain.vo.merchant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/05/07 17:36
 */
@Data
@ApiModel
public class MerchantLoginVO implements Serializable {

    @ApiModelProperty(value = "商户登录态token")
    private String merchantToken;

    @ApiModelProperty(value = "主键")
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

    @ApiModelProperty(value = "登陆账号(不能与sys_user表重复)")
    private String mUid;

    @ApiModelProperty(value = "登陆密码")
    private String mPwd;

    @ApiModelProperty(value = "所属商户id(mid)")
    private Integer subMid;

    @ApiModelProperty(value = "失效时间")
    private Date expireTime;

    @ApiModelProperty(value = "登录状态")
    private Integer loginStatus;

    @ApiModelProperty(value = "商户状态(0已锁定 1启用中)")
    private Integer mUserStatus;

    @ApiModelProperty(value = "设备编号")
    private String deviceEimi;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "添加时间")
    private Date addTime;

    @ApiModelProperty(value = "微信openId")
    private String merchantOpenId;
}
