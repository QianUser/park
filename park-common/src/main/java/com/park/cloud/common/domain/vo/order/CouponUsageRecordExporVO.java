package com.park.cloud.common.domain.vo.order;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
public class CouponUsageRecordExporVO {

    @ColumnWidth(18)
    @ExcelProperty(value = "订单编号",index = 0)
    private String bargainOrderCode;

    @ColumnWidth(18)
    @ExcelProperty(value = "优惠券编号",index = 1)
    private String ucouponCode;

    @ColumnWidth(16)
    @ExcelProperty(value = "用户手机号",index = 2)
    private String mobileNumber;

    @ColumnWidth(15)
    @ExcelProperty(value = "停车场",index = 3)
    private String parkingName;

    @ColumnWidth(27)
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty(value = "入场时间",index = 4)
    private Date berthStartParkingTime;

    @ColumnWidth(27)
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty(value = "出场时间",index = 5)
    private Date berthEndParkingTime;

    @ExcelProperty(value = "优惠金额",index = 6)
    private Float freeCharge;
}
