package com.park.cloud.common.domain.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class UserCouponVO {

    @ApiModelProperty("主键")
    private Integer ucId;

    @ApiModelProperty(value = "优惠券名称")
    private String cpName;

    @ApiModelProperty("用户手机号")
    private String mobileNumber;

    @ApiModelProperty("优惠券编号")
    private String ucouponCode;

    @ApiModelProperty(value = "购买者类型：1用户2商户")
    private Integer buyerType;

    @ApiModelProperty(value = "生效时间")
    private Date effTime;

    @ApiModelProperty(value = "失效时间")
    private Date failureTime;

    @ApiModelProperty(value = "使用状态 0生效 1失效 2已使用")
    private Integer usageState;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    @ApiModelProperty(value = "购买渠道：1官网 2 APP 3 公众号 4平台发放5商户发放")
    private Integer buyingChannel;

    @ApiModelProperty(value = "添加时间")
    private Date addTime;
}
