package com.park.cloud.common.domain.params.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author kris_ni
 * @date 2020/1/17
 */
@Data
@ApiModel
@ToString
public class TraBargainOrderCaculateParams {

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;

    @ApiModelProperty(value = "订单类型（0路外订单；1路内订单")
    private Integer bargainOrderType;

    @ApiModelProperty(value = "申请方式（路边）：0自主泊车；1pda")
    private Integer applyMethod;

    @ApiModelProperty(value = "泊位编号")
    private String berthCode;
}
