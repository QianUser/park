package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassNameRepParkFinanceByDayPageVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/7 14:39
 **/
@Data
@ApiModel
public class RepParkFinanceByDayPageVO {
    @ApiModelProperty(value = "统计表的id(查看详情是用)")
    private String financeId;
    @ApiModelProperty(value = "停车场名称")
    private String sectionName;
    @ApiModelProperty(value = "日期")
    private String statisticsDay;
    @ApiModelProperty(value = "支付方式")
    private Integer payType;
    @ApiModelProperty(value = "支付笔数")
    private Integer payNum;
    @ApiModelProperty(value = "应收金额")
    private Integer receivablePrice;
    @ApiModelProperty(value = "优惠金额")
    private Integer couponPrice;
    @ApiModelProperty(value = "退费金额")
    private Integer refundPrice;
    @ApiModelProperty(value = "实收金额")
    private Integer receiptPrice;
}
