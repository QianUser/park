package com.park.cloud.common.domain.vo.merchant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/05/09 17:35
 */
@Data
@ApiModel
public class CouponPurchaseVO {

    @ApiModelProperty(value = "主键")
    private Integer copId;

    @ApiModelProperty(value = "优惠券名称")
    private String cpName;

    @ApiModelProperty(value = "停车服务号")
    private String cmuId;

    @ApiModelProperty(value = "购买张数")
    private Integer pNumber;

    @ApiModelProperty(value = "买入金额")
    private String buAmount;

    @ApiModelProperty(value = "发放剩余张数")
    private Integer rTension;

    @ApiModelProperty(value = "购买时间")
    private Date addTime;

    @ApiModelProperty(value = "优惠类型：0现金优惠券 1折扣优惠券 2时间优惠券 3全免")
    private Integer relationType;

    @ApiModelProperty(value = "优惠券价格")
    private Float couponPrice;
}
