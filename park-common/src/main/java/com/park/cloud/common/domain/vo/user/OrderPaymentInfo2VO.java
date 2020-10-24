//package com.park.cloud.common.domain.vo.user;
//
///**
// * @Author: xiawei
// * @Date: 2020/7/22 10:41
// */
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;
//import java.time.LocalDateTime;
//
//@Data
//@ApiModel
//public class OrderPaymentInfo2VO {
//
//    @ApiModelProperty(value = "订单编号")
//    private String bargainOrderCode;
//
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @ApiModelProperty(value = "支付日期")
//    private LocalDateTime payDateTime;
//
//    @ApiModelProperty(value = "支付金额（分）")
//    private Integer payPrice;
//
//    @ApiModelProperty(value = "支付方式\n" +
//            "0 PDA扫码支付\n" +
//            "1余额支付\n" +
//            "2微信支付\n" +
//            "3支付宝支付\n" +
//            "4 招行一卡通支付\n" +
//            "5 线下支付（招行聚合二维码）")
//    private Integer payType;
//}
//
