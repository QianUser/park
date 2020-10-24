package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNameRepRunStatisticsByMonthVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/10 16:06
 **/
@Data
@ApiModel
public class RepRunStatisticsByMonthVO {

    @ApiModelProperty(value = "停车场名称")
    private String sectionName;
    @ApiModelProperty(value = "日期")
    private String  statisticsDay;
    @ApiModelProperty(value = "停车次数")
    private Integer parkNum;
    @ApiModelProperty(value = "支付次数")
    private Integer payNum;
    @ApiModelProperty(value = "欠费次数")
    private Integer arrearsNum;
    @ApiModelProperty(value = "支付率")
    private BigDecimal payRatio;
    @ApiModelProperty(value = "应收金额")
    private Integer receivablePrice;
    @ApiModelProperty(value = "实收金额")
    private Integer receiptPrice;
}
