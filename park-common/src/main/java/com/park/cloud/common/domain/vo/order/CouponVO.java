package com.park.cloud.common.domain.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author kris_ni
 * @date 2020/2/12
 */
@Data
@ApiModel
public class CouponVO {

    @ApiModelProperty("主键")
    private Integer ucId;

    @ApiModelProperty(value = "优惠券名称")
    private String cpName;

    @ApiModelProperty("优惠券编号")
    private String uCouponCode;

    @ApiModelProperty(value = "优惠类型：0现金优惠券 1折扣优惠券 2时间优惠券 3全免")
    private Integer relationType;

    @ApiModelProperty(value = "优惠券面额")
    private String couponMoney;

    @ApiModelProperty(value = "生效时间")
    private Date effTime;

    @ApiModelProperty(value = "失效时间")
    private Date failureTime;

    @ApiModelProperty(value = "说明")
    private List<String> descriptions;
}
