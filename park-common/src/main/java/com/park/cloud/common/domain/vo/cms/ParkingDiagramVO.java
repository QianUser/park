package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 停车热力图
 */
@Data
@ApiModel
public class ParkingDiagramVO implements Serializable {
    @ApiModelProperty(value = "停车场名称")
    private String parkingName;

    @ApiModelProperty(value = "当前空位数")
    private Integer currentParkingNo;

    @ApiModelProperty(value = "经度")
    private String longitude;

    @ApiModelProperty(value = "纬度")
    private String latitude;

    @ApiModelProperty(value = "停车场饱和度")
    private BigDecimal saturation;

    @ApiModelProperty(value = "当前停车数")
    private Integer currentCarParkNo;

    @ApiModelProperty(value = "车场车位数")
    private Integer totalParkingNo;
}
