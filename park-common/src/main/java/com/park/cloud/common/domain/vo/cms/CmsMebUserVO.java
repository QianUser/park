package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class CmsMebUserVO implements Serializable {

    @ApiModelProperty(value = "用户ID")
    private Integer mebUserId;

    @ApiModelProperty(value = "停车服务号")
    private String parkUserId;

    @ApiModelProperty(value = "注册途径（1表示app，2官网, 3公众号）")
    private Integer userType;

    @ApiModelProperty(value = "用户昵称")
    private String userNickname;

    @ApiModelProperty(value = "用户手机号码")
    private String mobileNumber;

    @ApiModelProperty(value = "余额")
    private Integer overagePrice;

    @ApiModelProperty(value = "微信ID")
    private String userOpenId;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

}