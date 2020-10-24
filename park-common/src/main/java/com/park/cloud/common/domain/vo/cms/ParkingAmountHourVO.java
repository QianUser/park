package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 一天中路外路内停车金额
 */
@Data
@ApiModel
public class ParkingAmountHourVO implements Serializable {
    @ApiModelProperty(value = "路外停车金额")
    private List<ParkingAmountTimeVO> curbAmount;

    @ApiModelProperty(value = "路内停车金额")
    private List<ParkingAmountTimeVO> offRoadAmount;
}
