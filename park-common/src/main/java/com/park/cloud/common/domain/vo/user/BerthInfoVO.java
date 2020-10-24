package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

/**
 * @author kris_ni
 * @date 2020/2/7
 */
@Data
@ApiModel
public class BerthInfoVO {

    @ApiModelProperty(value ="主键")
    private Integer berthId;

    @ApiModelProperty(value ="泊位号")
    private String berthCode;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "免费时长(分钟)")
    private Integer freeDuration;

    @ApiModelProperty(value = "备注")
    private String pricingStrategyRemark;

    @ApiModelProperty(value = "营业时间段")
    private List<TimeDurianVO> openTimes;

    @ApiModelProperty(value = "收费策略费率")
    private List<PricingRateVO> pricingRateVOs;

    @ApiModelProperty(value = "工作日收费策略")
    private PricingRateVO workdayRate;

    @ApiModelProperty(value = "周末收费策略")
    private PricingRateVO weekendRate;

    @ApiModelProperty(value = "上限数额：0不设置上限；大于0有上限")
    private Integer upperLimit;

    @ApiModelProperty(value = "1：限制时间（分钟）；2限制金额（分）")
    private Integer limitType;
}
