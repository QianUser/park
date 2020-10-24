package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkRefundByDayEXporVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/4/26 16:58
 **/
@Data
public class RepParkRefundByDayEXporVO {
    @ExcelProperty(value = "停车场名称")
    private String sectionName;
    @ExcelProperty(value = "停车场id")
    private Integer sectionId;
    @ExcelProperty(value = "停车场类型")
    private String parkingType;

    @ExcelProperty(value = "退费次数")
    private Integer refundNum;

    @ExcelProperty(value = "退费金额")
    private Integer refundPrice;

    public void setparkingTypeStr(Integer type) {
        switch (type) {
            case 0:
                this.parkingType = "路内";
                break;
            case 1:
                this.parkingType = "路外";
            default:
                break;
        }
    }
}