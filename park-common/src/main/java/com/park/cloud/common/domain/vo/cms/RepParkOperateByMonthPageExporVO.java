package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkOperateByMonthPageExporVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/4/26 16:41
 **/
@Data
public class RepParkOperateByMonthPageExporVO {
    @ExcelProperty(value = "停车场名称")
    private String sectionName;
    @ExcelProperty(value = "停车次数")
    private Integer parkNum;

    @ExcelProperty(value = "交易次数")
    private Integer tradEnum;

    @ExcelProperty(value = "欠费笔数")
    private Integer arrearsNum;
    @ExcelProperty(value = "应收金额")
    private Integer receivablePrice;
    @ExcelProperty(value = "实收金额")
    private Integer receiptPrice;
}
