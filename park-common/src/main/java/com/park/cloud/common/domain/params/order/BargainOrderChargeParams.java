package com.park.cloud.common.domain.params.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kris_ni
 * @date 2020/4/11
 */
@Data
@ApiModel
public class BargainOrderChargeParams {

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    @ApiModelProperty(value = "支付业务类型：1停车费，2包月券购买；3购买优惠券")
    private Integer subId;
}
