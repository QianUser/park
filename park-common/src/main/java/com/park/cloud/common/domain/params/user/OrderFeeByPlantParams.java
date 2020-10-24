package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kris_ni
 * @date 2020/2/22
 */
@Data
@ApiModel
public class OrderFeeByPlantParams {

    @ApiModelProperty(value = "车牌号()")
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）()")
    private Integer plateType;
}
