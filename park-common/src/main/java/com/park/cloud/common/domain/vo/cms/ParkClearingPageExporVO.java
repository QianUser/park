package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameParkClearingPageExporVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/4/26 17:08
 **/
@Data
public class ParkClearingPageExporVO {
    @ExcelProperty(value = "停车场名称")
    private String  sectionName;

    @ExcelProperty(value = "日期")
    private String statisticsDay;
    @ExcelProperty(value = "停车次数")
    private Integer parkNum;
    @ExcelProperty(value = "交易笔数")
    private Integer tradeNum;

    @ExcelProperty(value = "支付次数")
    private Integer payNum;

    @ExcelProperty(value = "停车收入")
    private Integer receivablePrice;
    @ExcelProperty(value = "支付率")
    private Integer payRatio;
}
