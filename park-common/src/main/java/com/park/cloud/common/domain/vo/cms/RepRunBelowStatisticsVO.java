package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNamerepRunBelowStatisticsVO
 * @Description 运营统计下方数据
 * @Author liangshuang
 * @Date 2020/3/11 10:43
 **/
@Data
@ApiModel
public class RepRunBelowStatisticsVO {
    @ApiModelProperty(value = "时间")
    private String statisticsDay;
    @ApiModelProperty(value = "交易次数")
    private Integer tradEnum;
    @ApiModelProperty(value = "停车次数")
    private Integer parkNum;
    @ApiModelProperty(value = "应收总金额")
    private Integer receivablePrice;
    @ApiModelProperty(value = "实收总金额")
    private Integer receiptPrice;
    @ApiModelProperty(value = "支付次数")
    private Integer payNum;
    @ApiModelProperty(value = "欠费次数")
    private Integer arrearsNum;
    @ApiModelProperty(value = "支付率")
    private BigDecimal payRatio;
}
