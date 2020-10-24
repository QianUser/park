package com.park.cloud.common.domain.po.rep;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class RepParkOperatePO {
    private Integer id;

    private String statisticsDay;

    private Integer cityId;

    private Integer cantonId;

    private Integer areaId;

    private Integer parkingSectionId;

    private String parkingSectionName;

    private Integer parkingType;

    private Integer parkNum;

    private Integer tradeNum;

    private Integer payNum;

    private Integer arrearsNum;

    private Integer receivablePrice;

    private Integer receiptPrice;

    private BigDecimal payRatio;

    private Date addTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatisticsDay() {
        return statisticsDay;
    }

    public void setStatisticsDay(String statisticsDay) {
        this.statisticsDay = statisticsDay == null ? null : statisticsDay.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCantonId() {
        return cantonId;
    }

    public void setCantonId(Integer cantonId) {
        this.cantonId = cantonId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getParkingSectionId() {
        return parkingSectionId;
    }

    public void setParkingSectionId(Integer parkingSectionId) {
        this.parkingSectionId = parkingSectionId;
    }

    public String getParkingSectionName() {
        return parkingSectionName;
    }

    public void setParkingSectionName(String parkingSectionName) {
        this.parkingSectionName = parkingSectionName == null ? null : parkingSectionName.trim();
    }

    public Integer getParkingType() {
        return parkingType;
    }

    public void setParkingType(Integer parkingType) {
        this.parkingType = parkingType;
    }

    public Integer getParkNum() {
        return parkNum;
    }

    public void setParkNum(Integer parkNum) {
        this.parkNum = parkNum;
    }

    public Integer getTradeNum() {
        return tradeNum;
    }

    public void setTradeNum(Integer tradeNum) {
        this.tradeNum = tradeNum;
    }

    public Integer getPayNum() {
        return payNum;
    }

    public void setPayNum(Integer payNum) {
        this.payNum = payNum;
    }

    public Integer getArrearsNum() {
        return arrearsNum;
    }

    public void setArrearsNum(Integer arrearsNum) {
        this.arrearsNum = arrearsNum;
    }

    public Integer getReceivablePrice() {
        return receivablePrice;
    }

    public void setReceivablePrice(Integer receivablePrice) {
        this.receivablePrice = receivablePrice;
    }

    public Integer getReceiptPrice() {
        return receiptPrice;
    }

    public void setReceiptPrice(Integer receiptPrice) {
        this.receiptPrice = receiptPrice;
    }

    public BigDecimal getPayRatio() {
        return payRatio;
    }

    public void setPayRatio(BigDecimal payRatio) {
        this.payRatio = payRatio;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}