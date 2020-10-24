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
 * @createDate 2020/04/22 16:05
 */
public class PDAParkingExportVO {

    @ColumnWidth(19)
    @ExcelProperty(value = "订单号")
    private String bargainOrderCode;

    @ColumnWidth(19)
    @ExcelProperty(value = "违章工单")
    private String inPeccancyCode;

    @ColumnWidth(16)
    @ExcelProperty(value = "泊位号")
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
    @ExcelProperty(value = "是否缴清")
    private String payStatus;

    @ColumnWidth(27)
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty(value = "违章时间")
    private Date berthEndParkingTime;

    @ColumnWidth(27)
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty(value = "补缴时间")
    private Date payTime;

    public String getBargainOrderCode() {
        return bargainOrderCode;
    }

    public void setBargainOrderCode(String bargainOrderCode) {
        this.bargainOrderCode = bargainOrderCode;
    }

    public String getInPeccancyCode() {
        return inPeccancyCode;
    }

    public void setInPeccancyCode(String inPeccancyCode) {
        this.inPeccancyCode = inPeccancyCode;
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
            this.payStatus = "缴清";
        }else {
            this.payStatus = "未缴清";
        }
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

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {

        if(Objects.isNull(payTime)){
            return;
        }
        this.payTime = Date.from(payTime.atZone(ZoneId.systemDefault()).toInstant());
    }
}
