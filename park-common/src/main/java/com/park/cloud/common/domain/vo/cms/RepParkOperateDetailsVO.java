package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @ClassNameRepParkOperateDetailsVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/5 13:42
 **/
@Data
@ApiModel
public class RepParkOperateDetailsVO {
    @ApiModelProperty(value = "订单号")
    private String orderCode;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "计费时长")
    private Integer actualDuration;
    @ApiModelProperty(value = "应缴金额")
    private float payCharge;
    @ApiModelProperty(value = "优惠金额")
    private float freeCharge;
    @ApiModelProperty(value = "退费金额")
    private Integer refundPrice;
    @ApiModelProperty(value = "实收金额")
    private Integer payPrice;
    @ApiModelProperty(value = "支付方式")
    private Integer payType;

    @ApiModelProperty(value = "交易时间")
    private Date paymentTime;

    @ApiModelProperty(value = "支付流水号")
    private String payerTradeNo;
}
