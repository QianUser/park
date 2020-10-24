package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNameRepParkOperateVO
 * @Description 停车日报表上方数据统计返回
 * @Author liangshuang
 * @Date 2020/3/3 16:36
 **/
@Data
@ApiModel
public class RepParkOperateVO {

    @ApiModelProperty(value = "交易次数")
    private Integer tradeNum;

    @ApiModelProperty(value = "支付笔数")
    private Integer payNum;

    @ApiModelProperty(value = "应收总金额")
    private Integer receivablePrice;

    @ApiModelProperty(value = "实收总金额")
    private BigDecimal receiptPrice;

    @ApiModelProperty(value = "欠费笔数")
    private Integer arrearsNum;

    @ApiModelProperty(value = "支付率")
    private BigDecimal payRatio;

}
