package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 停车场类型分布
 */
@Data
@ApiModel
public class ParkingTypeVO implements Serializable {
    @ApiModelProperty(value = "路外")
    private Integer offRoadCount;

    @ApiModelProperty(value = "路内")
    private Integer curbCount;
}
