package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 停车时长
 */
@Data
@ApiModel
public class ParkingTimeVO implements Serializable {
    @ApiModelProperty(value = "0~0.5")
    private Integer timeOne;

    @ApiModelProperty(value = "0.5~1")
    private Integer timeTwo;

    @ApiModelProperty(value = "1~2")
    private Integer timeThree;

    @ApiModelProperty(value = "2~3")
    private Integer timeFour;

    @ApiModelProperty(value = "3~4")
    private Integer timeFive;

    @ApiModelProperty(value = ">4")
    private Integer timeSix;
}
