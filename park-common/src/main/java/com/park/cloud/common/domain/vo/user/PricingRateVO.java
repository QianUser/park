package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kris_ni
 * @date 2020/2/21
 */
@Data
@ApiModel
public class PricingRateVO {

    @ApiModelProperty(value = "收费策略")
    private Integer pricingStrategyId;

    @ApiModelProperty(value = "开始分钟数")
    private Integer rateStartMinute;

    @ApiModelProperty(value = "间隔分钟数")
    private Integer rateEndMinute;

    @ApiModelProperty(value = "日期类型（1工作日2周末）")
    private Integer rateDateType;

    @ApiModelProperty(value = "区段费用")
    private Integer ratePrice;

    @ApiModelProperty(value = "最小计费单元(分钟)")
    private Integer rateUnit;

    @ApiModelProperty(value = "起始费用")
    private Integer defaultPrice;
}
