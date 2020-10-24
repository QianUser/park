package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 僵尸车导出
 */
@Data
@ApiModel
public class DictLongParkingExportVO implements Serializable {
    @ColumnWidth(14)
    @ExcelProperty(value = "车牌号")
    private String plateNumber;

    @ColumnWidth(14)
    @ExcelProperty(value = "入场时间")
    private Date startParkingTime;

    @ColumnWidth(14)
    @ExcelProperty(value = "停车时长")
    private BigDecimal parkTime;

    @ColumnWidth(16)
    @ExcelProperty(value = "停车场名称")
    private String parkingName;

    @ColumnWidth(16)
    @ExcelProperty(value = "停车场类型")
    private String parkingType;

    @ColumnWidth(14)
    @ExcelProperty(value = "泊位号")
    private String berthCode;

    @ColumnWidth(14)
    @ExcelProperty(value = "车牌类型")
    private String plateType;

    public void setParkingTypeStr(Integer type) {
        switch(type) {
            case 0:
                this.parkingType = "路外停车场";
                break;
            case 1:
                this.parkingType = "路内停车场";
                break;
            default:
                break;
        }
    }

    public void setPlateTypeStr(Integer type) {
        switch(type) {
            case 1:
                this.plateType = "蓝牌";
                break;
            case 2:
                this.plateType = "绿牌";
                break;
            case 3:
                this.plateType = "黄牌";
                break;
            case 4:
                this.plateType = "其他";
                break;
            default:
                break;
        }
    }
}
