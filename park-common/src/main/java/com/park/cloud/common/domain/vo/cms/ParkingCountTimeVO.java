package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 一天中某小时停车指数
 */
@Data
@ApiModel
public class ParkingCountTimeVO implements Serializable {
    @ApiModelProperty(value = "小时")
    private Integer hour;

    @ApiModelProperty(value = "某小时的停车指数")
    private BigDecimal hourCount;
}
