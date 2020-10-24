package com.park.cloud.common.domain.vo.order;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import java.util.Date;




/**
 * @author liuhainan
 */
public class CouponPurchaseExporVO {

    @ColumnWidth(18)
    @ExcelProperty(value = "购买者手机号")
    private String mobileNumber;

    @ColumnWidth(16)
    @ExcelProperty(value = "优惠券名称")
    private String cpName;

    @ColumnWidth(16)
    @ExcelProperty(value = "用户类型")
    private String buyerType;

    @ColumnWidth(13)
    @ExcelProperty(value = "购买张数")
    private Integer pNumber;

    @ColumnWidth(13)
    @ExcelProperty(value = "买入金额")
    private String buAmount;

    @ColumnWidth(18)
    @ExcelProperty(value = "发放剩余张数")
    private Integer rTension;

    @ColumnWidth(13)
    @ExcelProperty(value = "购买渠道")
    private String buyingChannel;

    @ColumnWidth(27)
    @ExcelProperty(value = "购买时间")
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    private Date addTime;

    public void setBuyingChannel(int buyingChannel) {
        switch (buyingChannel) {
            case 1:
                this.buyingChannel = "官网";
                break;
            case 2:
                this.buyingChannel = "APP";
                break;
            case 3:
                this.buyingChannel = "公众号";
                break;
            case 4:
                this.buyingChannel = "平台发放";
                break;
            default:
                break;
        }
    }


    public void setBuyerType(int buyerType) {
        if (buyerType == 1) {
            this.buyerType = "用户";
        } else if (buyerType == 2) {
            this.buyerType = "商户";
        }

    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getBuyerType() {
        return buyerType;
    }

    public Integer getpNumber() {
        return pNumber;
    }

    public void setpNumber(Integer pNumber) {
        this.pNumber = pNumber;
    }

    public String getBuAmount() {
        return buAmount;
    }

    public void setBuAmount(String buAmount) {
        this.buAmount = buAmount;
    }

    public Integer getrTension() {
        return rTension;
    }

    public void setrTension(Integer rTension) {
        this.rTension = rTension;
    }

    public String getBuyingChannel() {
        return buyingChannel;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}