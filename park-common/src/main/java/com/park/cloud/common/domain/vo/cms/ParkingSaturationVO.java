package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 停车饱和度
 */
@Data
@ApiModel
public class ParkingSaturationVO implements Serializable {
    @ApiModelProperty(value = "停车场名称")
    private String parkingName;

    @ApiModelProperty(value = "停车场饱和度")
    private BigDecimal saturation;

    @ApiModelProperty(value = "当前空位数")
    private Integer currentParkingNo;

    @ApiModelProperty(value = "总车位数")
    private Integer totalParkingNo;

    @ApiModelProperty(value = "周转率")
    private Integer parkingRatio;
}
