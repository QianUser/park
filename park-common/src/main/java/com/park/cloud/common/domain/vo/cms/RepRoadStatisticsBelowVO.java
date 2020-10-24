package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNameReproadStatisticsBelowVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/10 15:05
 **/
@Data
@ApiModel
public class RepRoadStatisticsBelowVO {
    @ApiModelProperty(value = "时间")
    private String time;

    @ApiModelProperty(value = "泊位日均收益")
    private BigDecimal berthRatio;
    @ApiModelProperty(value = "支付率")
    private BigDecimal payRatio;
    @ApiModelProperty(value = "自助缴费占比")
    private BigDecimal selfPayRatio;
    @ApiModelProperty(value = "PDA付费占比")
    private BigDecimal pdaPayRatio;
}
