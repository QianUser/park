package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;

import java.util.Date;
import java.util.Objects;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/04/26 10:13
 */
public class ExportCmsMebUserVO {

    @ExcelProperty(value = "昵称")
    private String userNickname;

    @ExcelProperty(value = "微信ID")
    private String userOpenId;

    @ColumnWidth(15)
    @ExcelProperty(value = "手机号")
    private String mobileNumber;

    @ColumnWidth(18)
    @ExcelProperty(value = "车牌号")
    private String plateNumber;

    @ExcelIgnore
    private Integer plateType;

    @ExcelProperty(value = "余额")
    private Double overagePrice;

    @ExcelProperty(value = "注册途径")
    private String userType;

    @ColumnWidth(27)
    @ExcelProperty(value = "添加时间")
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    private Date addTime;

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

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserOpenId() {
        return userOpenId;
    }

    public void setUserOpenId(String userOpenId) {
        this.userOpenId = userOpenId;
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

    public Double getOveragePrice() {
        return overagePrice;
    }

    public void setOveragePrice(Integer overagePrice) {
        if(Objects.isNull(overagePrice)){
            this.overagePrice = (double) 0;
            return;
        }
        this.overagePrice = Double.valueOf(overagePrice)/100;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        switch (userType){
            case 1:
                this.userType = "app";
                break;
            case 2:
                this.userType = "官网";
                break;
            case 3:
                this.userType = "公众号";
                break;
            default:
                break;
        }
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
