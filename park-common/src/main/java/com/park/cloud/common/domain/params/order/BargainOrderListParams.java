package com.park.cloud.common.domain.params.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author liuhainan
 */
@Data
public class BargainOrderListParams extends PageHelperParams {
    @ApiModelProperty(value = "订单Id")
    private Long traBargainOrderId;

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    @ApiModelProperty(value = "泊位编号")
    private String berthCode;

    @ApiModelProperty(value = "用户手机号码")
    private String mobileNumber;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",  timezone="GMT+8")
    @ApiModelProperty(value = "计费开始时间")
    private LocalDateTime startParkingTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",  timezone="GMT+8")
    @ApiModelProperty(value = "计费结束时间")
    private LocalDateTime endParkingTime;

    @ApiModelProperty(value = "申请方式（0:未知，1:手机APP,2:电话语音,3:电子标签,4:微信公众号,5:支付宝服务窗，6、PDA缴费，7线下支付订单,8巡检员PDA代缴，9扫码（聚合、打印二维码）10、无感支付）")
    private Integer applyMethod;

    @ApiModelProperty(value = "支付方式0 PDA扫码支付 1余额支付 2微信支付 3支付宝支付 4 招行一卡通支付 5 线下支付（招行聚合二维码）")
    private Integer payType;

    @ApiModelProperty(value = "订单类型（0路外订单；1路内订单")
    private Integer bargainOrderType;

}
