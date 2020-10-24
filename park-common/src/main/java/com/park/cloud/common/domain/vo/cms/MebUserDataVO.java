package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 用户数
 */
@Data
@ApiModel
public class MebUserDataVO implements Serializable {
    @ApiModelProperty(value = "统计日期")
    private String statisticsDay;

    @ApiModelProperty(value = "总用户数")
    private Integer totalCount;

    @ApiModelProperty(value = "总用户数占比")
    private BigDecimal totalCountRate;

    @ApiModelProperty(value = "今日新增用户数")
    private Integer todayNewCount;

    @ApiModelProperty(value = "今日新增用户数占比")
    private BigDecimal todayNewCountRate;

    @ApiModelProperty(value = "今日交易用户数")
    private Integer todayTradeCount;

    @ApiModelProperty(value = "今日交易用户数占比")
    private BigDecimal todayTradeCountRate;

    @ApiModelProperty(value = "今日活跃用户数")
    private Long todayActiveCount;

    @ApiModelProperty(value = "今日活跃用户数占比")
    private BigDecimal todayActiveCountRate;
}
