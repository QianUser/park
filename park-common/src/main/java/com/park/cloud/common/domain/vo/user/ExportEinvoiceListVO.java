package com.park.cloud.common.domain.vo.user;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;

import java.util.Date;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/04/26 10:37
 */
public class ExportEinvoiceListVO {

    @ColumnWidth(16)
    @ExcelProperty(value = "订单号")
    private String bargainOrderCode;

    @ColumnWidth(15)
    @ExcelProperty(value = "手机号")
    private String mobileNumber;

    @ColumnWidth(18)
    @ExcelProperty(value = "车牌号")
    private String plateNumber;

    @ExcelIgnore
    private Integer plateType;

    @ExcelProperty(value = "订单金额")
    private Double payCharge;

    @ColumnWidth(27)
    @ExcelProperty(value = "支付时间")
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    private Date payTime;

    @ExcelProperty(value = "发票类型")
    private String companyType;

    @ColumnWidth(27)
    @ExcelProperty(value = "申请时间")
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    private Date addTime;

    @ColumnWidth(14)
    @ExcelProperty(value = "发票状态")
    private String orderStatus;

    @ColumnWidth(14)
    @ExcelProperty(value = "邮件发送")
    private String emailStatus;

    public Integer getPlateType() {
        return plateType;
    }

    public void setPlateType(Integer plateType) {
        if(plateType==null){
            return;
        }
        switch (plateType) {
            case 1:
                this.plateNumber = plateNumber + "(蓝牌)";
                break;
            case 2:
                this.plateNumber = plateNumber + "(绿牌)";
                break;
            case 3:
                this.plateNumber = plateNumber + "(黄牌)";
                break;
            case 4:
                this.plateNumber = plateNumber + "(其他)";
                break;
            default:
                return;
        }
    }

    public String getBargainOrderCode() {
        return bargainOrderCode;
    }

    public void setBargainOrderCode(String bargainOrderCode) {
        this.bargainOrderCode = bargainOrderCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        if(this.plateNumber !=null){
            this.plateNumber = plateNumber+this.plateNumber;
        }
        this.plateNumber = plateNumber;
    }

    public Double getPayCharge() {
        return payCharge;
    }

    public void setPayCharge(Integer payCharge) {
        this.payCharge = Double.valueOf(payCharge)/100;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        switch (companyType){
            case "01":
                this.companyType = "企业";
                break;
            case "02":
                this.companyType = "机关事业单位";
                break;
            case "03":
                this.companyType = "个人";
                break;
            default:
                this.companyType = "其他";
                break;
        }

    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        if(orderStatus==0){
            this.orderStatus = "已申请";
        }else if(orderStatus ==1){
            this.orderStatus = "下发成功";
        }else if(orderStatus==9999){
            this.orderStatus = "下发失败";
        }else {
            return;
        }

    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(Integer emailStatus) {
        if(emailStatus==0){
            this.emailStatus = "未发送";
        }else if(emailStatus==1){
            this.emailStatus = "已发送";
        }else {
            return;}

    }
}
