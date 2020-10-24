package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;

import java.util.Date;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/04/24 11:51
 */
public class ExportRefundListVO {

    @ColumnWidth(18)
    @ExcelProperty(value = "订单号")
    private String bargainOrderCode;

    @ColumnWidth(18)
    @ExcelProperty(value = "退费订单号")
    private String refundOrderCode;

    @ColumnWidth(16)
    @ExcelProperty(value = "泊位号")
    private String berthCode;

    @ColumnWidth(17)
    @ExcelProperty(value = "停车场")
    private String parkName;

    @ExcelProperty(value = "退费金额")
    private Double refundPrice;

    @ExcelProperty(value = "退费状态")
    private String refundStatus;

    @ExcelProperty(value = "退费类型")
    private String refundType;

    @ExcelProperty(value = "停车场类型")
    private String bargainOrderType;

    @ColumnWidth(27)
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty(value = "退费时间")
    private Date refundTime;

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getBerthCode() {
        return berthCode;
    }

    public void setBerthCode(String berthCode) {
        this.berthCode = berthCode;
    }

    public String getBargainOrderCode() {
        return bargainOrderCode;
    }

    public void setBargainOrderCode(String bargainOrderCode) {
        this.bargainOrderCode = bargainOrderCode;
    }

    public String getRefundOrderCode() {
        return refundOrderCode;
    }

    public void setRefundOrderCode(String refundOrderCode) {
        this.refundOrderCode = refundOrderCode;
    }

    public Double getRefundPrice() {
        return refundPrice;
    }

    public void setRefundPrice(Double refundPrice) {
        this.refundPrice = refundPrice;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        if(refundStatus==2){
            this.refundStatus = "已退费";
        }else {
            this.refundStatus = "未退费";
        }
    }

    public String getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        if(refundType == 1){
            this.refundType = "正常退费";
        }else if(refundType ==2){
            this.refundType = "异常改单退费";
        }else {
            this.refundType = "未知";
        }
    }

    public String getBargainOrderType() {
        return bargainOrderType;
    }

    public void setBargainOrderType(Integer bargainOrderType) {
        if(bargainOrderType == 0){
            this.bargainOrderType = "路外";
        }else if(bargainOrderType == 1){
            this.bargainOrderType = "路内";
        }
        return;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }
}
