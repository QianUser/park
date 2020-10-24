package com.park.cloud.common.domain.vo.order;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;

/**
 * @author liuhainan
 */
public class BargainOrderExportVO {

    @ColumnWidth(18)
    @ExcelProperty(value = "手机号")
    private String mobileNumber;

    @ColumnWidth(16)
    @ExcelProperty(value = "泊位编号")
    private String berthCode;

    @ColumnWidth(18)
    @ExcelProperty(value = "车牌号")
    private String plateNumber;

    @ColumnWidth(12)
    @ExcelProperty(value = "申请方式")
    private String applyMethod;

    @ExcelProperty(value = "进场时间")
    @ColumnWidth(27)
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    private Date berthStartParkingTime;

    @ExcelProperty(value = "出场时间")
    @ColumnWidth(27)
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    private Date berthEndParkingTime;

    @ColumnWidth(18)
    @ExcelProperty(value = "计费时长(分)")
    private Integer actualDuration;

    @ColumnWidth(18)
    @ExcelProperty(value = "订单金额")
    private Integer payCharge;

    @ColumnWidth(13)
    @ExcelProperty(value = "订单状态")
    private String orderStatus;

    @ColumnWidth(13)
    @ExcelProperty(value = "支付状态")
    private String payStatus;

    @ColumnWidth(10)
    @ExcelProperty(value = "支付方式")
    private String payType;

    @ColumnWidth(16)
    @ExcelProperty(value = "订单Id")
    private Long traBargainOrderId;

    @ColumnWidth(16)
    @ExcelProperty(value = "订单编号")
    private String bargainOrderCode;

    @ExcelIgnore
    private Integer plateType;


    public Long getTraBargainOrderId() {
        return traBargainOrderId;
    }

    public void setTraBargainOrderId(Long traBargainOrderId) {
        this.traBargainOrderId = traBargainOrderId;
    }

    public String getBargainOrderCode() {
        return bargainOrderCode;
    }

    public void setBargainOrderCode(String bargainOrderCode) {
        this.bargainOrderCode = bargainOrderCode;
    }

    public String getBerthCode() {
        return berthCode;
    }

    public void setBerthCode(String berthCode) {
        this.berthCode = berthCode;
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

    public Integer getPayCharge() {
        return payCharge;
    }

    public void setPayCharge(Integer payCharge) {
        this.payCharge = payCharge;
    }

    public String getApplyMethod() {
        return applyMethod;
    }

    public void setApplyMethod(Integer applyMethod) {
        if(applyMethod==null){
            return;
        }
        switch (applyMethod) {
            case 0:
                this.applyMethod = "未知";
                break;
            case 1:
                this.applyMethod = "手机APP";
                break;
            case 2:
                this.applyMethod = "电话语音";
                break;
            case 3:
                this.applyMethod = "电子标签";
                break;
            case 4:
                this.applyMethod = "微信公众号";
                break;
            case 5:
                this.applyMethod = "支付宝服务窗";
                break;
            case 6:
                this.applyMethod = "PDA缴费";
                break;
            case 7:
                this.applyMethod = "线下支付订单";
                break;
            case 8:
                this.applyMethod = "巡检员PDA代缴";
                break;
            case 9:
                this.applyMethod = "扫码";
                break;
            case 10:
                this.applyMethod = "无感支付";
                break;
            default:
                break;
        }
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        if(orderStatus==null){
            return;
        }
        switch(orderStatus){
            case 1:
                this.orderStatus = "进行中";
                break;
            case 2:
                this.orderStatus = "已完成";
                break;
            default:
                break;
        }
    }

    public Date getBerthStartParkingTime() {
        return berthStartParkingTime;
    }

    public void setBerthStartParkingTime(LocalDateTime berthStartParkingTime) {
        if(Objects.isNull(berthStartParkingTime)){
            return;
        }
        this.berthStartParkingTime = Date.from(berthStartParkingTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public Date getBerthEndParkingTime() {
        return berthEndParkingTime;
    }

    public void setBerthEndParkingTime(LocalDateTime berthEndParkingTime) {
        if(Objects.isNull(berthEndParkingTime)){
            return;
        }
        this.berthEndParkingTime = Date.from(berthEndParkingTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public String getPayType() {
        return payType;
    }

    public Integer getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(Integer actualDuration) {
        this.actualDuration = actualDuration;
    }

    public void setPayType(Integer payType) {
        if(payType==null){
            return;
        }

        switch (payType) {
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
                return;
        }

    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        if(payStatus==0){
            this.payStatus = "未支付";
        }else if(payStatus==1){
            this.payStatus = "已支付";
        }else {
            return;
        }
    }
}
