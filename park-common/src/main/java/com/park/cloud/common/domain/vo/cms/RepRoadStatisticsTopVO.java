package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNameRepRoadStatisticsTopVO
 * @Description 路内运营报表上方模块数据
 * @Author liangshuang
 * @Date 2020/3/10 10:53
 **/
@Data
@ApiModel
public class RepRoadStatisticsTopVO {
    @ApiModelProperty(value = "总订单数")
    private Integer orderCount;

    @ApiModelProperty(value = "已完成订单")
    private Integer finishCount;

    @ApiModelProperty(value = "欠费订单数")
    private Integer arrearageCount;

    @ApiModelProperty(value = "补缴订单数")
    private Integer paymentCount;

    @ApiModelProperty(value = "总收益")
    private Integer earingsCount;

    @ApiModelProperty(value = "泊位日均收益")
    private BigDecimal berthRatio;
    @ApiModelProperty(value = "支付率")
    private BigDecimal payRatio;
    @ApiModelProperty(value = "自助缴费占比")
    private BigDecimal selfPayRatio;
    @ApiModelProperty(value = "PDA付费占比")
    private BigDecimal pdaPayRatio;
}
