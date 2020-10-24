package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNameRepRunStatisticsTopVO
 * @Description 运营统计上方模块
 * @Author liangshuang
 * @Date 2020/3/11 10:05
 **/
@Data
@ApiModel
public class RepRunStatisticsTopVO {
    @ApiModelProperty(value = "当前交易次数")
    private Integer tradEnum;
    @ApiModelProperty(value = "当前应收总金额")
    private Integer receivablePrice;
    @ApiModelProperty(value = "当前实收总金额")
    private Integer receiptPrice;
    @ApiModelProperty(value = "当前支付次数")
    private Integer payNum;
    @ApiModelProperty(value = "当前欠费次数")
    private Integer arrearsNum;
    @ApiModelProperty(value = "当前支付率")
    private BigDecimal payRatio;
}
