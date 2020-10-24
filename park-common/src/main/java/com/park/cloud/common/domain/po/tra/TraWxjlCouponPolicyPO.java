package com.park.cloud.common.domain.po.tra;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@ApiModel
public class TraWxjlCouponPolicyPO {

    @ApiModelProperty(value = "主键")
    private Integer wxjlCpId;

    @NotBlank(message = "策略名不能为空！")
    @ApiModelProperty(value = "策略名")
    private String wxjlCpName;

    @NotNull(message = "优惠券类型不能为空！")
    @ApiModelProperty(value = "优惠券类型")
    private Integer relationType;

    @NotNull(message = "使用次数不能为空！")
    @ApiModelProperty(value = "使用次数(默认1,包月、包年在有效期内不限次)")
    private Integer useNumber;

    @NotNull(message = "支付类型不能为空！")
    @ApiModelProperty(value = "支付类型")
    private Integer paymentType;

    @NotNull(message = "发放规则不能为空！")
    @ApiModelProperty(value = "发放规则")
    private Integer rulesType;

    @NotBlank(message = "优惠券面额不能为空!")
    @ApiModelProperty(value = "优惠券面额")
    private String couponMoney;

    @NotNull(message = "优惠券价格不能为空！")
    @ApiModelProperty(value = "优惠券价格")
    private Float couponPrice;

    @NotNull(message = "发券张数不能为空！")
    @ApiModelProperty(value = "发券张数")
    private Integer couponNum;

    @NotNull(message = "剩余数量 不能为空！")
    @ApiModelProperty(value = "剩余数量")
    private Integer surplusNum;

    @NotBlank(message = "适用停车场id集合不能为空！")
    @ApiModelProperty(value = "适用停车场id集合")
    private String parkingIdList;

    @ApiModelProperty(value = "适用路段id集合(0通用)")
    private String sectionIdList;

    @NotBlank(message = "适用商户id集合不能为空！")
    @ApiModelProperty(value = "适用商户id集合")
    private String mid;

    @NotBlank(message = "有限期开始时间不能为空！")
    @ApiModelProperty(value = "有限期开始时间")
    private Date startTime;

    @NotBlank(message = "有限期结束时间不能为空！")
    @ApiModelProperty(value = "有限期结束时间")
    private Date endTime;

    @NotNull(message = "发券使用有效期不能为空！")
    @ApiModelProperty(value = "发券使用有效期(天数)")
    private Integer termOfValidity;

    @ApiModelProperty(value = "1生效 2停用 3已过期")
    private Integer cpStatus;

    @ApiModelProperty(value = "备注")
    private String remark;

    @NotNull(message = "创建时间不能为空！")
    @ApiModelProperty(value = "创建时间")
    private Date addTime;
}