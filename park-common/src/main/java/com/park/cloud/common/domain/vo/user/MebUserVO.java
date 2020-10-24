package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel
public class MebUserVO {

    @ApiModelProperty(value = "用户ID")
    private Integer mebUserId;

    @ApiModelProperty(value = "停车服务号")
    private String parkUserId;

    @ApiModelProperty(value = "用户昵称")
    private String userNickname;

    @ApiModelProperty(value = "用户手机号码")
    private String mobileNumber;

    @ApiModelProperty(value = "账号可用金额（单位：分）")
    private Integer overagePrice;

    @ApiModelProperty(value = "账户冻结金额（单位：分）")
    private Integer freezePrice;

    @ApiModelProperty(value = "是否老用户（首次注册时有效）")
    private Boolean isOld;

    @ApiModelProperty(value = "公众号用户openid")
    private String userOpenId;
}