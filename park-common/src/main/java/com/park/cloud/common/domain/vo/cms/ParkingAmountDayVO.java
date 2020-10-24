package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 一个月中一天停车金额
 */
@Data
@ApiModel
public class ParkingAmountDayVO implements Serializable {
    @ApiModelProperty(value = "日期")
    private String date;

    @ApiModelProperty(value = "一天的停车金额")
    private BigDecimal dayAmount;
}
