package com.park.cloud.common.domain.params.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author kris_ni
 * @date 2020/3/12
 */
@Data
@ApiModel
@ToString
public class OrderDetailForGateParams {

    @ApiModelProperty(value = "路外停车场编号")
    private String parkCode;

    @ApiModelProperty(value = "停车场生成的订单号（与交易记录表的BargainOrderCode关联")
    private String parkOrderNo;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;
}
