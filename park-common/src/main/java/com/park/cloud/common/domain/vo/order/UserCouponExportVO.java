package com.park.cloud.common.domain.vo.order;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author liuhainan
 */
public class UserCouponExportVO {

    @ColumnWidth(18)
    @ExcelProperty(value = "购买者手机号")
    @ApiModelProperty("用户手机号")
    private String mobileNumber;

    @ColumnWidth(16)
    @ExcelProperty(value = "优惠券名称")
    private String cpName;

    @ColumnWidth(18)
    @ExcelProperty(value = "优惠券编号")
    @ApiModelProperty("优惠券编号")
    private String ucouponCode;

    @ColumnWidth(16)
    @ExcelProperty(value = "购买者类型")
    private String buyerType;

    @ColumnWidth(27)
    @ExcelProperty(value = "生效时间")
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ApiModelProperty(value = "生效时间")
    private Date effTime;

    @ColumnWidth(27)
    @ExcelProperty(value = "失效时间")
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ApiModelProperty(value = "失效时间")
    private Date failureTime;

    @ColumnWidth(13)
    @ExcelProperty(value = "使用状态")
    @ApiModelProperty(value = "使用状态")
    private String usageState;


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

    public String getUcouponCode() {
        return ucouponCode;
    }

    public void setUcouponCode(String ucouponCode) {
        this.ucouponCode = ucouponCode;
    }

    public String getBuyerType() {
        return buyerType;
    }

    public void setBuyerType(int buyerType) {
        if (buyerType == 1) {
            this.buyerType = "用户";
        } else if (buyerType == 2) {
            this.buyerType = "商户";
        }else {
            return;
        }
    }

    public Date getEffTime() {
        return effTime;
    }

    public void setEffTime(Date effTime) {
        this.effTime = effTime;
    }

    public Date getFailureTime() {
        return failureTime;
    }

    public void setFailureTime(Date failureTime) {
        this.failureTime = failureTime;
    }

    public String getUsageState() {
        return usageState;
    }

    public void setUsageState(Integer usageState) {
        switch (usageState){
            case 0:
                this.usageState = "生效";
                break;
            case 1:
                this.usageState = "失效";
                break;
            case 2:
                this.usageState = "已使用";
                break;
            default:
                break;
        }

    }
}
