package com.park.cloud.common.domain.params.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel("包月收费策略费率")
public class TraMonthlyPricingRateParams {

    @ApiModelProperty("主键")
    private Integer monthlyRateId;

    @ApiModelProperty("包月收费策略")
    private Integer monthlyStrategyId;

    @NotNull(message = "开始时间不为空")
    @ApiModelProperty("开始时间(HH:mm)")
    private String startTime;

    @NotNull(message = "次日结束时间不能为空")
    @ApiModelProperty("次日结束时间(HH:mm)")
    private String endTime;

    @NotNull(message = "日期类型不能为空")
    @ApiModelProperty("日期类型（1工作日日间2工作日夜间和非工作日全天，3 全天）")
    private Integer rateDateType;

    @NotNull(message = "包月价格不能为空")
    @ApiModelProperty("包月价格（元）")
    private Integer ratePrice;

    @ApiModelProperty("创建时间")
    private Date addTime;

    @ApiModelProperty("创建人")
    private Integer addUser;
}
