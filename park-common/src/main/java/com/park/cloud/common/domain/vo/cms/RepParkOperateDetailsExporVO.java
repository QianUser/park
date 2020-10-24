package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @ClassNameRepParkOperateDetailsExporVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/4/26 16:30
 **/
@Data
public class RepParkOperateDetailsExporVO {
    @ExcelProperty(value = "订单号",index = 0)
    private String orderCode;

    @ExcelProperty(value = "车牌号",index = 1)
    private String plateNumber;

    @ExcelProperty(value = "计费时长",index = 2)
    private Integer actualDuration;
    @ExcelProperty(value = "应缴金额",index = 3)
    private float payCharge;
    @ExcelProperty(value = "优惠金额",index = 4)
    private float freeCharge;
    @ExcelProperty(value = "退费金额",index = 5)
    private Integer refundPrice;
    @ExcelProperty(value = "实收金额",index = 6)
    private Integer payPrice;
    @ExcelProperty(value = "支付方式",index = 7)
    private String payType;

    @ExcelProperty(value = "交易时间",index = 8)
    private Date paymentTime;

    @ExcelProperty(value = "支付流水号",index = 9)
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
                break;
            default:
                break;
        }
    }
}
