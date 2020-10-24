package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * <h3>park</h3>
 * <p></p>
 *
 * @author : zhangqinxiaowei
 * @date : 2020-09-15 15:59
 **/
@Data
public class QSMonthCardExportVO {

    @ColumnWidth(25)
    @ExcelProperty(value = "停车场名称")
    private String parkName;

    @ColumnWidth(18)
    @ExcelProperty(value = "车牌")
    private String plateNumber;

/*    @ColumnWidth(15)
    @ExcelProperty(value = "金额")
    private Float unitPrice;*/

    @ColumnWidth(15)
    @ExcelProperty(value = "用户名")
    private String nickname;

    @ColumnWidth(18)
    @ExcelProperty(value = "用户手机号码")
    private String mobileNumber;

    @ColumnWidth(18)
    @ExcelProperty(value = "月卡类型")
    private String cardType;

    @ExcelProperty(value = "单日有效时间段")
    @ColumnWidth(27)
    private String dailyValidTime;

    @ExcelProperty(value = "使用有效起始时间")
    @ColumnWidth(27)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date validStartTime;

    @ExcelProperty(value = "使用有效结束时间")
    @ColumnWidth(27)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date validEndTime;

    @ColumnWidth(18)
    @ExcelProperty(value = "支付状态")
    private String payStatus;

    @ColumnWidth(18)
    @ExcelProperty(value = "月卡状态")
    private String status;

    @ExcelProperty(value = "月卡支付时间")
    @ColumnWidth(27)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date payTime;

    @ColumnWidth(18)
    @ExcelProperty(value = "订单金额")
    private Float orderPrice;

    @ColumnWidth(20)
    @ExcelProperty(value = "月卡账单编号")
    private String orderCode;


    public void setPayStatus(Integer payStatus) {
        if (payStatus == 0) {
            this.payStatus = "未支付";
        } else if (payStatus == 1) {
            this.payStatus = "已支付";
        }
    }

    public void setCardType(Integer cardType){
        switch (cardType) {
            case 1:
                this.cardType = "普通卡";
                break;
            case 2:
                this.cardType = "专享卡";
                break;
        }
    }

    public void setStatus(Integer status){
        switch (status) {
            case 0:
                this.status = "未激活";
                break;
            case 1:
                this.status = "生效";
                break;
            case 2:
                this.status = "过期";
                break;
        }
    }

}
