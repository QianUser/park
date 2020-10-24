package com.park.cloud.common.domain.vo.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author kris_ni
 * @date 2020/2/1
 */
@Data
@ApiModel
public class OrderPaymentInfoVO {

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    //    @JsonFormat(pattern = "yyyy-MM-dd")
//    @ApiModelProperty(value = "支付日期")
//    private LocalDate payDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "支付日期")
    private LocalDateTime payDateTime;

    @JsonFormat(pattern = "HH:mm:ss")
    @ApiModelProperty(value = "支付时间")
    private LocalTime payTime;

    @ApiModelProperty(value = "支付金额（元）")
    private Float payPrice;

    @ApiModelProperty(value = "支付方式\n" +
            "0 PDA扫码支付\n" +
            "1余额支付\n" +
            "2微信支付\n" +
            "3支付宝支付\n" +
            "4 招行一卡通支付\n" +
            "5 线下支付（招行聚合二维码）")
    private Integer payType;

    private Integer month;
}
