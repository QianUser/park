package com.park.cloud.common.domain.po.meb;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 用户数
 */
@Data
@ApiModel
public class MebUserDataPO {

    @ApiModelProperty(value = "统计日期")
    private String statisticsDay;

    @ApiModelProperty(value = "总用户数")
    private Integer totalCount;

    @ApiModelProperty(value = "今日新增用户数")
    private Integer todayNewCount;

    @ApiModelProperty(value = "今日交易用户数")
    private Integer todayTradeCount;

    @ApiModelProperty(value = "今日活跃用户数")
    private Long todayActiveCount;

    @ApiModelProperty(value = "添加时间")
    private Date addTime;
}
