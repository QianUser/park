package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 一天中路外路内停车指数
 */
@Data
@ApiModel
public class ParkingCountHourVO implements Serializable {
    @ApiModelProperty(value = "路外停车")
    private List<ParkingCountTimeVO> curbCount;

    @ApiModelProperty(value = "路内停车")
    private List<ParkingCountTimeVO> offRoadCount;
}
