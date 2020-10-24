package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassNameRepParkOperatePageVO
 * @Description 停车日报表列表数据
 * @Author liangshuang
 * @Date 2020/3/3 16:55
 **/
@Data
@ApiModel
public class RepParkOperatePageVO {
    @ApiModelProperty(value = "订单号")
    private String bargainOrderCode;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "入场时间")
    private Date startParkingTime;

    @ApiModelProperty(value = "出场时间")
    private Date endParkingTime;

    @ApiModelProperty(value = "停车时长")
    private Integer actualDuration;

    @ApiModelProperty(value = "应收金额")
    private Integer payCharge;
    @ApiModelProperty(value = "实收金额")
    private Integer payPrice;
    @ApiModelProperty(value = "支付方式")
    private Integer payType;
    @ApiModelProperty(value = "支付流水号")
    private String payerTradeNo;

}
