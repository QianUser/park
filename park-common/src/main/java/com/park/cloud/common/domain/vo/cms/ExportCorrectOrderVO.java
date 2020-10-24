package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.Objects;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/04/23 15:37
 */
public class ExportCorrectOrderVO {

    @ColumnWidth(27)
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty(value = "申请时间")
    private Date addTime;

    @ExcelProperty(value = "泊位号")
    private String berthCode;

    @ColumnWidth(17)
    @ExcelProperty(value = "泊位状态")
    private String parkStatus;

    @ExcelProperty(value = "申请人")
    private String xjName;

    @ExcelProperty(value = "审核人")
    private String auditUserName;


    @ColumnWidth(16)
    @ExcelProperty(value = "审核状态")
    private String auditState;

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(Integer auditState) {
        if(auditState==1){
            this.auditState = "已审核";
        }else {
            this.auditState = "未审核";
        }
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getBerthCode() {
        return berthCode;
    }

    public void setBerthCode(String berthCode) {
        this.berthCode = berthCode;
    }

    public String getParkStatus() {
        return parkStatus;
    }

    public void setParkStatus(Integer parkStatus) {
        if(parkStatus==0){
            this.parkStatus = "无车，实际有车";
        }else if(parkStatus==1){
            this.parkStatus = "有车，实际无车";
        }else {
            return;
        }

    }

    public String getXjName() {
        return xjName;
    }

    public void setXjName(String xjName) {
        this.xjName = xjName;
    }

    public String getAuditUserName() {
        return auditUserName;
    }

    public void setAuditUserName(String auditUserName) {
        this.auditUserName = auditUserName;
    }

}
