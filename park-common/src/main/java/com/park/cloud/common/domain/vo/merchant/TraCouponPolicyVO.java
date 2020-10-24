package com.park.cloud.common.domain.vo.merchant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/05/09 15:52
 */
@Data
@ApiModel
public class TraCouponPolicyVO {


    @ApiModelProperty(value = "主键")
    private Integer wxjlCpId;

    @ApiModelProperty(value = "策略名")
    private String wxjlCpName;

    @ApiModelProperty(value = "优惠类型：0现金优惠券 1折扣优惠券 2时间优惠券 3全免")
    private Integer relationType;

    @ApiModelProperty(value = "使用次数：包月包年不限次，默认1")
    private Integer useNumber;

    @ApiModelProperty(value = "优惠券面额")
    private String couponMoney;

    @ApiModelProperty(value = "优惠价格(发放规则为[购买发放]时有效)")
    private Float couponPrice;

    @ApiModelProperty(value = "发券张数")
    private Integer couponNum;

    @ApiModelProperty(value = "剩余数量")
    private Integer surplusNum;

    @ApiModelProperty(value = "适用停车场id集合(0通用)")
    private String parkingIdList;

    @ApiModelProperty(value = "适用路段id集合(0通用)")
    private String sectionIdList;

    @ApiModelProperty(value = "适用商户id集合")
    private String mid;

    @ApiModelProperty(value = "有限期开始时间")
    private Date startTime;

    @ApiModelProperty(value = "有限期结束时间")
    private Date endTime;

    @ApiModelProperty(value = "发券使用有效期(天数)")
    private Integer termOfValidity;

    @ApiModelProperty(value = "0失效 1生效 2停用 3已过期")
    private Integer cpStatus;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

    @ApiModelProperty(value = "停车场名称集合")
    private List<String> parkNames;

    @ApiModelProperty(value = "路段名称集合")
    private List<String> sectionNames;


}
