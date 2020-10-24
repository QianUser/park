package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalTime;

@ApiModel
@Data
public class MonthlyTrategyBackParams {

    @ApiModelProperty("日期类型")
    private Integer rateDateType;

    @ApiModelProperty("包月策略ID")
    private Integer monthlyRateId;

}
