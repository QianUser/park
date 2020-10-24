package com.park.cloud.common.domain.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class TraMonthlyPricingRateVO {

    @ApiModelProperty("主键")
    private Integer monthlyRateId;

    @ApiModelProperty("包月收费策略")
    private Integer monthlyStrategyId;

    @ApiModelProperty("开始时间(HH:mm)")
    private Date startTime;

    @ApiModelProperty("次日结束时间(HH:mm)")
    private Date endTime;

    @ApiModelProperty("日期类型（1工作日日间2工作日夜间和非工作日全天，3 全天）")
    private Integer rateDateType;

    @ApiModelProperty("包月价格（元）")
    private Integer ratePrice;

    @ApiModelProperty("创建时间")
    private Date addTime;

    @ApiModelProperty("创建人")
    private Integer addUser;
}
