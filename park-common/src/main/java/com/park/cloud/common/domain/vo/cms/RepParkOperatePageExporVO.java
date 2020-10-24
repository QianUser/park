package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @ClassNameRepParkOperatePageExporVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/4/26 16:50
 **/
@Data
public class RepParkOperatePageExporVO {
    @ExcelProperty(value = "订单号")
    private String bargainOrderCode;

    @ExcelProperty(value = "车牌号")
    private String plateNumber;

    @ExcelProperty(value = "入场时间")
    private Date startParkingTime;

    @ExcelProperty(value = "出场时间")
    private Date endParkingTime;

    @ExcelProperty(value = "停车时长")
    private Integer actualDuration;

    @ExcelProperty(value = "应收金额")
    private Integer payCharge;
    @ExcelProperty(value = "实收金额")
    private Integer payPrice;
    @ExcelProperty(value = "支付方式")
    private String payType;
    @ExcelProperty(value = "支付流水号")
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
                this.payType = "线下支付";
            default:
                break;
        }
    }
}
