package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kris_ni
 * @date 2020/2/2
 */
@Data
public class OrderDetailParams {

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;
}
