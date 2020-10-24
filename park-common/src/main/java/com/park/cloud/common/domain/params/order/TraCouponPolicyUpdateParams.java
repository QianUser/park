package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class TraCouponPolicyUpdateParams extends CmsBaseParams {

    @NotNull(message = "主键不能为空")
    @ApiModelProperty(value = "主键")
    private Integer wxjlCpId;

    @ApiModelProperty(value = "策略名")
    private String wxjlCpName;

    @ApiModelProperty(value = "优惠券类型")
    private Integer relationType;

    @ApiModelProperty(value = "使用次数(默认1,包月、包年在有效期内不限次)")
    private Integer useNumber;

    @ApiModelProperty(value = "支付类型")
    private Integer paymentType;

    @ApiModelProperty(value = "发放规则")
    private Integer rulesType;

    @ApiModelProperty(value = "优惠券面额")
    private String couponMoney;

    @ApiModelProperty(value = "优惠券价格")
    private Float couponPrice;

    @ApiModelProperty(value = "发券张数")
    private Integer couponNum;

    @ApiModelProperty(value = "剩余数量")
    private Integer surplusNum;

    @ApiModelProperty(value = "适用停车场id集合")
    private String parkingIdList;

    @ApiModelProperty(value = "适用路段id集合(0通用)")
    private String sectionIdList;

    @ApiModelProperty(value = "适用商户id集合")
    private String mid;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "有限期开始时间")
    private Date startTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "有限期结束时间")
    private Date endTime;

    @ApiModelProperty(value = "发券使用有效期(天数)")
    private Integer termOfValidity;

    @ApiModelProperty(value = "1生效 2停用 3已过期")
    private Integer cpStatus;

    @ApiModelProperty(value = "备注")
    private String remark;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
    private Date addTime;
}
