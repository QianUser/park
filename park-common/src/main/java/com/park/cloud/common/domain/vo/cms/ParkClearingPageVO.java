package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassNameParkClearingPageVO
 * @Description 清分结算列表数据
 * @Author liangshuang
 * @Date 2020/3/6 11:23
 **/
@Data
@ApiModel
public class ParkClearingPageVO {
    @ApiModelProperty(value = "停车场名称")
    private String  sectionName;

    @ApiModelProperty(value = "日期")
    private String statisticsDay;
    @ApiModelProperty(value = "停车次数")
    private Integer parkNum;
    @ApiModelProperty(value = "交易笔数")
    private Integer tradeNum;

    @ApiModelProperty(value = "支付次数")
    private Integer payNum;

    @ApiModelProperty(value = "停车收入")
    private Integer receivablePrice;
    @ApiModelProperty(value = "支付率")
    private Integer payRatio;
}
