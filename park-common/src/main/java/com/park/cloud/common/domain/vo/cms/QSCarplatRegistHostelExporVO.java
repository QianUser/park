package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * <h3>park</h3>
 * <p></p>
 *
 * @author : zhangqinxiaowei
 * @date : 2020-09-25 16:43
 **/
@Data
@ApiModel
public class QSCarplatRegistHostelExporVO {
    //酒店名称
    //停车场名称
    @ColumnWidth(25)
    @ExcelProperty(value = "酒店名")
    private String hotelName;
    @ColumnWidth(25)
    @ExcelProperty(value = "停车场")
    private String parkName;
    @ColumnWidth(18)
    @ExcelProperty(value = "车牌号")
    private String carNumber;
    @ColumnWidth(25)
    @ExcelProperty(value = "住店时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date inTime;
    @ColumnWidth(25)
    @ExcelProperty(value = "离店时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date outTime;
    @ColumnWidth(25)
    @ExcelProperty(value = "登记用户名")
    private String reigstUserName;
    @ColumnWidth(25)
    @ExcelProperty(value = "登记号码")
    private String registUserPhone;
    @ColumnWidth(25)
    @ExcelProperty(value = "账单金额")
    private Integer totalFee;
    @ColumnWidth(25)
    @ExcelProperty(value = "酒店支付金额")
    private Integer hotelFee;
    @ColumnWidth(25)
    @ExcelProperty(value = "客户自付金额")
    private Integer custormerFee;
    @ColumnWidth(25)
    @ExcelProperty(value = "停车时长")
    private Integer parkTime;
    // 0代表自付，1代表酒店代付
    @ColumnWidth(25)
    @ExcelProperty(value = "支付方式")
    private String isHotelPay;
    @ColumnWidth(25)
    @ExcelProperty(value = "停车开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date parkStartTime;
    @ColumnWidth(25)
    @ExcelProperty(value = "停车结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date parkEndTime;
    @ColumnWidth(25)
    @ExcelProperty(value = "酒店订单编码")
    private String hotelOrderCode;
    @ColumnWidth(25)
    @ExcelProperty(value = "酒店登记时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public void setIsHotelPay(Integer isHotelPay) {
        if (isHotelPay == 0) {
            this.isHotelPay = "客户自付";
        } else if (isHotelPay == 1) {
            this.isHotelPay = "酒店代付";
        }
    }

}
