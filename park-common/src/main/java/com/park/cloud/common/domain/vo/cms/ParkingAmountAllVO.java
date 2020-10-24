package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 停车场营收
 */
@Data
@ApiModel
public class ParkingAmountAllVO implements Serializable {
    @ApiModelProperty(value = "停车场名称")
    private String parkingName;

    @ApiModelProperty(value = "停车场营收")
    private Integer payCharge;
}
