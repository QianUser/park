package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNameRepRunStatisticsByMonthExporVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/4/26 16:56
 **/
@Data
public class RepRunStatisticsByMonthExporVO {
    @ExcelProperty(value = "停车场名称")
    private String sectionName;
    @ExcelProperty(value = "日期")
    private String  statisticsDay;
    @ExcelProperty(value = "停车次数")
    private Integer parkNum;
    @ExcelProperty(value = "支付次数")
    private Integer payNum;
    @ExcelProperty(value = "欠费次数")
    private Integer arrearsNum;
    @ExcelProperty(value = "支付率")
    private BigDecimal payRatio;
    @ExcelProperty(value = "应收金额")
    private Integer receivablePrice;
    @ExcelProperty(value = "实收金额")
    private Integer receiptPrice;
}
