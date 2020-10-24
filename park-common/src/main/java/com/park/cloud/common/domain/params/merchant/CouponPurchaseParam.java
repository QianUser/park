package com.park.cloud.common.domain.params.merchant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/05/08 11:51
 */
@Data
@ApiModel
public class CouponPurchaseParam extends MerchantBaseParams{

    @NotNull(message = "优惠策略id不能为空")
    @ApiModelProperty(value = "策略表id",required = true)
    private Integer wxjlCpId;

    @NotNull(message = "购买者类型不能为空")
    @ApiModelProperty(value = "购买者类型:1用户 2商户",required = true)
    private Integer buyerType;

    @NotNull(message = "购买张数不能为空")
    @ApiModelProperty(value = "购买张数",required = true)
    @Min(value = 1,message = "购买张数不能小于1")
    private Integer pNumber;

    @NotNull(message = "购买渠道不能为空！")
    @ApiModelProperty(value = "购买渠道: 1官网 2 APP 3 公众号 4平台发放",required = true)
    private Integer buyingChannel;

    @ApiModelProperty("支付金额")
    private Integer totalPrice;

    @ApiModelProperty("支付方式：1余额支付 2微信支付 3支付宝支付 4 招行一卡通支付 5 线下支付（招行聚合二维码）")
    private Integer payType;

    @ApiModelProperty("微信Code")
    private String wxCode;

    public Integer getpNumber() {
        return pNumber;
    }

    public void setpNumber(Integer pNumber) {
        this.pNumber = pNumber;
    }
}
