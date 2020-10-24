package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassNameRepParkFinanceDetailsExporVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/4/26 17:02
 **/
@Data
public class RepParkFinanceDetailsExporVO {
    @ExcelProperty(value = "订单号")
    private String orderCode;
    @ExcelProperty(value = "车牌号")
    private String plateNumber;
    @ExcelProperty(value = "计费时长")
    private Integer actualDuration;

    @ExcelProperty(value = "应收金额")
    private float payCharge;
    @ExcelProperty(value = "优惠金额")
    private float freeCharge;
    @ExcelProperty(value = "退费金额")
    private BigDecimal refundPrice;
    @ExcelProperty(value = "实收金额")
    private BigDecimal  payPrice;
    @ExcelProperty(value = "支付方式")
    private String payType;
    @ExcelProperty(value = "交易时间")
    private Date paymentTime;

    @ExcelProperty(value = "交易流水号")
    private String payerTradeNo;
    public void setPayTypeStr(Integer payType) {
        switch(payType) {
            case 0:
                this.payType = "PDA扫码支付";
                break;
            case 1:
                this.payType = "余额支付";
                break;
            case 2:
                this.payType = "微信支付";
                break;
            case 3:
                this.payType = "支付宝支付";
                break;
            case 4:
                this.payType = "招行一卡通支付";
                break;
            case 5:
                this.payType = "线下支付（招行聚合二维码）";
            default:
                break;
        }
    }

    public String getPayerTradeNo() {
        return payerTradeNo;
    }

    public void setPayerTradeNo(String payerTradeNo) {
        this.payerTradeNo = payerTradeNo;
    }
}
