package com.park.cloud.common.domain.po.tra;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("收费策略费率实体")
public class TraPricingRatePO {

    @ApiModelProperty(value = "主键")
    private Integer rateId;

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

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

    @ApiModelProperty(value = "创建人")
    private Integer addUser;

    @ApiModelProperty(value = "起始费用")
    private Integer defaultPrice;

}