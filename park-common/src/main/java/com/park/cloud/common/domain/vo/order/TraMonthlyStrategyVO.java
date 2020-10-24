package com.park.cloud.common.domain.vo.order;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author liuhainan
 */
@Data
public class TraMonthlyStrategyVO {

    @ApiModelProperty("主键")
    private Integer monthlyStrategyId;

    @ApiModelProperty("策略名称")
    private String monthlyStrategyName;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("创建时间")
    private Date addTime;

    @ApiModelProperty("创建人")
    private Integer addUser;

    @ApiModelProperty("包月收费策略费率")
    private List<TraMonthlyPricingRateVO> pricingRates;
}
