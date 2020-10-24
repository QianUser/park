package com.park.cloud.common.domain.vo.order;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/04/23 17:21
 */
public class ExportOutsideOrderVO {

    @ColumnWidth(17)
    @ExcelProperty(value = "停车场")
    private String parkName;

    @ColumnWidth(18)
    @ExcelProperty(value = "手机号")
    private String mobileNumber;

    @ColumnWidth(18)
    @ExcelProperty(value = "车牌号")
    private String plateNumber;

    @ExcelIgnore
    private Integer plateType;

    @ExcelProperty(value = "进场时间")
    @ColumnWidth(27)
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    private Date berthStartParkingTime;

    @ExcelProperty(value = "出场时间")
    @ColumnWidth(27)
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    private Date berthEndParkingTime;

    @ColumnWidth(18)
    @ExcelProperty(value = "停车时长")
    private Integer parkTime;

    @ColumnWidth(18)
    @ExcelProperty(value = "订单金额")
    private String payCharge;

    @ExcelProperty(value = "车辆类型")
    private String chargeType;

    @ExcelProperty(value = "优惠金额")
    private String freeCharge;

    @ExcelProperty(value = "优惠时长")
    private Integer discountTime;

    @ColumnWidth(13)
    @ExcelProperty(value = "订单状态")
    private String orderStatus;

    @ColumnWidth(13)
    @ExcelProperty(value = "支付状态")
    private String payStatus;

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
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

    public Integer getParkTime() {
        return parkTime;
    }

    public void setParkTime(Integer parkTime) {
        this.parkTime = parkTime;
    }

    public String getPayCharge() {
        return payCharge;
    }

    public void setPayCharge(Float payCharge) {
        if(Objects.isNull(payCharge)){
            this.payCharge = "0";
        }else {
            this.payCharge = payCharge.toString();
        }

    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(Integer chargeType) {
        if(chargeType ==null){
            return;
        }
        switch (chargeType){
            case 0:
                this.chargeType = "临时卡";
                break;
            case 1:
                this.chargeType = "月卡";
                break;
            case 2:
                this.chargeType = "年卡";
                break;
            case 3:
                this.chargeType = "免费";
            default:
                break;
        }

    }

    public String getFreeCharge() {
        return freeCharge;
    }

    public void setFreeCharge(Float freeCharge) {
        if(Objects.isNull(freeCharge)){
            this.freeCharge = "0";
        }else{
            this.freeCharge = freeCharge.toString();
        }

    }

    public Integer getDiscountTime() {
        return discountTime;
    }

    public void setDiscountTime(Integer discountTime) {
        this.discountTime = discountTime;
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
