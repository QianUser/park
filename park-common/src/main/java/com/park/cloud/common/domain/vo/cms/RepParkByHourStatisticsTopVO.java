package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNameRepParkByHourStatisticsTopVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/11 14:03
 **/
@Data
@ApiModel
public class RepParkByHourStatisticsTopVO {
    @ApiModelProperty(value = "今日停车次数")
    private Integer parkNum;
    @ApiModelProperty(value = "今日停车金额")
    private Integer receiptPrice;
    @ApiModelProperty(value = "当前在场车辆数")
    private Integer currentParkNum;
    @ApiModelProperty(value = "当前车位占有率")
    private BigDecimal stallOccupancy;
    @ApiModelProperty(value = "当前车位周转率")
    private BigDecimal turnoverRate;
}
