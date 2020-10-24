package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalTime;

@ApiModel
@Data
public class MonthlyStrategyTimeVO {


    @ApiModelProperty("开始时间")
    private LocalTime startTime;

    @ApiModelProperty("结束时间")
    private LocalTime endTime;
}
