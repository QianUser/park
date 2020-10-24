package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 巡检员
 */
@Data
@ApiModel
public class SysPdaUserSignExportVO implements Serializable {
    @ColumnWidth(14)
    @ExcelProperty(value = "班次名称")
    private String pdaScheduleName;

    @ColumnWidth(14)
    @ExcelProperty(value = "签到类型")
    private String signType;

    @ColumnWidth(18)
    @ExcelProperty(value = "签到/签出时间")
    private Date signTime;

    @ColumnWidth(14)
    @ExcelProperty(value = "签到结果")
    private String signResult;

    @ColumnWidth(18)
    @ExcelProperty(value = "用户真实姓名")
    private String pdaUserTrueName;

    @ColumnWidth(14)
    @ExcelProperty(value = "中队名称")
    private String teamName;

    @ColumnWidth(16)
    @ExcelProperty(value = "行政区名称")
    private String cantonName;

    @ColumnWidth(14)
    @ExcelProperty(value = "签到图片")
    private String signImg;

    public void setSignTypeStr(Byte type) {
        switch(type) {
            case 1:
                this.signType = "签到";
                break;
            case 2:
                this.signType = "签出";
            default:
                break;
        }
    }

    public void setSignResultStr(Byte type) {
        switch(type) {
            case 1:
                this.signResult = "正常签到";
                break;
            case 2:
                this.signResult = "迟到";
                break;
            case 3:
                this.signResult = "正常签出";
                break;
            case 4:
                this.signResult = "早退";
                break;
            default:
                break;
        }
    }
}
