package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 当日停车金额
 */
@Data
@ApiModel
public class ParkingAmountVO implements Serializable {
    @ApiModelProperty(value = "今日停车金额")
    private BigDecimal parkingAmount;

    @ApiModelProperty(value = "今日路外停车金额")
    private BigDecimal offRoadParkingAmount;

    @ApiModelProperty(value = "今日路内停车金额")
    private BigDecimal curbParkingAmount;

    @ApiModelProperty(value = "今日停车次数")
    private Integer parkingCount;

    @ApiModelProperty(value = "今日路外停车次数")
    private Integer offRoadParkingCount;

    @ApiModelProperty(value = "今日路内停车次数")
    private Integer curbParkingCount;

    @ApiModelProperty(value = "实时空位")
    private Integer currentParkingNo;

    @ApiModelProperty(value = "路外实时空位")
    private Integer currentOffRoadParkingNo;

    @ApiModelProperty(value = "路内实时空位")
    private Integer currentCurbParkingNo;

    @ApiModelProperty(value = "总的停车位数量")
    private Integer parkingNo;

    @ApiModelProperty(value = "路外总的停车位数量")
    private Integer offRoadParkingNo;

    @ApiModelProperty(value = "路内总的停车位数量")
    private Integer curbParkingNo;

    @ApiModelProperty(value = "周转率")
    private BigDecimal parkingRatio;

    @ApiModelProperty(value = "路外周转率")
    private BigDecimal offRoadParkingRatio;

    @ApiModelProperty(value = "路内周转率")
    private BigDecimal curbParkingRatio;
}
