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
 * @createDate 2020/04/22 10:59
 */
public class SelfParkingExportVO {

    @ColumnWidth(19)
    @ExcelProperty(value = "订单编号")
    private String bargainOrderCode;

    @ColumnWidth(18)
    @ExcelProperty(value = "手机号")
    private String mobileNumber;

    @ColumnWidth(16)
    @ExcelProperty(value = "泊位编号")
    private String berthCode;

    @ColumnWidth(18)
    @ExcelProperty(value = "车牌号")
    private String plateNumber;

    @ExcelIgnore
    private Integer plateType;

    @ColumnWidth(16)
    @ExcelProperty(value = "欠费金额")
    private Float payCharge;

    @ColumnWidth(16)
    @ExcelProperty(value = "补缴状态")
    private String payStatus;

    @ColumnWidth(27)
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty(value = "补缴时间")
    private Date payTime;

    @ColumnWidth(27)
    @ExcelProperty(value = "入场时间")
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    private Date berthStartParkingTime;

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

    public String getBerthCode() {
        return berthCode;
    }

    public void setBerthCode(String berthCode) {
        this.berthCode = berthCode;
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

    public Float getPayCharge() {
        return payCharge;
    }

    public void setPayCharge(Float payCharge) {
        this.payCharge = payCharge;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        if(payStatus == 1){
            this.payStatus = "已补缴";
        }else {
            this.payStatus = "未补缴";
        }

    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {

        if(Objects.isNull(payTime)){
            return;
        }
        this.payTime = Date.from(payTime.atZone(ZoneId.systemDefault()).toInstant());
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
}
