package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNameRepParkFinanceByDayPageExporVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/4/26 17:04
 **/
@Data
public class RepParkFinanceByDayPageExporVO {

    @ExcelProperty(value = "统计表的id(查看详情时用)")
    private String financeId;
    @ExcelProperty(value = "停车场名称")
    private String sectionName;
    @ExcelProperty(value = "日期")
    private String statisticsDay;
    @ExcelProperty(value = "支付方式")
    private String payType;
    @ExcelProperty(value = "支付笔数")
    private Integer payNum;
    @ExcelProperty(value = "应收金额")
    private String receivablePrice;
    @ExcelProperty(value = "优惠金额")
    private String couponPrice;
    @ExcelProperty(value = "退费金额")
    private String refundPrice;
    @ExcelProperty(value = "实收金额")
    private String receiptPrice;

    public void setReceivablePrice(Integer receivablePrice) {
        if(receivablePrice == null || receivablePrice == 0){
            this.receivablePrice = "0" ;
        }
        this.receivablePrice = new BigDecimal(receivablePrice).divide(new BigDecimal(100)).toString();
    }

    public void setCouponPrice(Integer couponPrice) {
        if(couponPrice == null || couponPrice == 0){
            this.couponPrice = "0" ;
        }
        this.couponPrice =  new BigDecimal(couponPrice).divide(new BigDecimal(100)).toString();
    }

    public void setRefundPrice(Integer refundPrice) {
        if(refundPrice == null || refundPrice == 0){
            this.refundPrice = "0" ;
        }
        this.refundPrice = new BigDecimal(refundPrice).divide(new BigDecimal(100)).toString();
    }

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

    public void setReceiptPrice(Integer receiptPrice) {
        if(receiptPrice == null || receiptPrice == 0){
            this.receiptPrice = "0" ;
        }
        this.receiptPrice = new BigDecimal(receiptPrice).divide(new BigDecimal(100)).toString();

    }

}
