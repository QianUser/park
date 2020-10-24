package com.park.cloud.common.domain.params.order;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kris_ni
 * @date 2020/3/3
 */
@Data
public class CouponConditionsParams {

    @ApiModelProperty("用户优惠券主键")
    private Integer ucId;

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;
}
