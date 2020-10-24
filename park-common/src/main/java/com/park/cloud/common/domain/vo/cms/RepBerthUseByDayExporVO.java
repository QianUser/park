package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNameRepBerthUseByDayExporVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/4/26 16:22
 **/
@Data
public class RepBerthUseByDayExporVO {

    @ExcelProperty(value = "泊位号",index = 0)
    private String berthCode;

    @ExcelProperty(value = "路段名",index = 1)
    private String sectionName;

    @ExcelProperty(value = "已缴笔数",index = 2)
    private Integer payNum;

    @ExcelProperty(value = "总笔数",index = 3)
    private Integer tradeNum;

    @ExcelProperty(value = "已缴占比",index = 4)
    private BigDecimal payNumRate;

    @ExcelProperty(value = "已缴金额",index = 5)
    private Integer payPrice;

    @ExcelProperty(value = "欠费金额",index = 6)
    private Integer arrearsPrice;

    @ExcelProperty(value = "总收入金额",index = 7)
    private Integer receivablePrice;

    @ExcelProperty(value = "已缴金额占比",index = 8)
    private BigDecimal payPriceRate;
}
