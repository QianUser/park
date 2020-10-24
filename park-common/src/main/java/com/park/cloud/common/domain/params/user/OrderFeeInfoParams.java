package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kris_ni
 * @date 2020/2/1
 */
@Data
@ApiModel("停车缴费请求参数")
public class OrderFeeInfoParams extends ClientBaseParams {

    @ApiModelProperty(value = "停车服务号")
    private String parkUserId;

    @ApiModelProperty(value = "订单类型（0路外订单；1路内订单")
    private Integer bargainOrderType;

}
