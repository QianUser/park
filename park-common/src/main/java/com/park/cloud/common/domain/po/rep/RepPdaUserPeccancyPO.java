package com.park.cloud.common.domain.po.rep;

import java.math.BigDecimal;
import java.util.Date;

public class RepPdaUserPeccancyPO {
    private Integer id;

    private String statisticsDay;

    private Integer cityId;

    private Integer cantonId;

    private Integer areaId;

    private Integer sectionId;

    private String sectionName;

    private Integer pdaUserId;

    private String pdaUserName;

    private Integer peccancyNum;

    private Integer finishNum;

    private BigDecimal finishRatio;

    private Integer averageFinishTime;

    private Integer orderPrice;

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

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

    public Integer getPdaUserId() {
        return pdaUserId;
    }

    public void setPdaUserId(Integer pdaUserId) {
        this.pdaUserId = pdaUserId;
    }

    public String getPdaUserName() {
        return pdaUserName;
    }

    public void setPdaUserName(String pdaUserName) {
        this.pdaUserName = pdaUserName == null ? null : pdaUserName.trim();
    }

    public Integer getPeccancyNum() {
        return peccancyNum;
    }

    public void setPeccancyNum(Integer peccancyNum) {
        this.peccancyNum = peccancyNum;
    }

    public Integer getFinishNum() {
        return finishNum;
    }

    public void setFinishNum(Integer finishNum) {
        this.finishNum = finishNum;
    }

    public BigDecimal getFinishRatio() {
        return finishRatio;
    }

    public void setFinishRatio(BigDecimal finishRatio) {
        this.finishRatio = finishRatio;
    }

    public Integer getAverageFinishTime() {
        return averageFinishTime;
    }

    public void setAverageFinishTime(Integer averageFinishTime) {
        this.averageFinishTime = averageFinishTime;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}