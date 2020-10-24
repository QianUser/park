package com.park.cloud.common.domain.vo.cms;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassNameRepPdaUserPeccancyExporVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/4/26 16:27
 **/
@Data
public class RepPdaUserPeccancyExporVO {
    @ExcelProperty(value = "路段名",index = 0)
    private String sectionName;
    @ExcelProperty(value = "巡检员",index = 1)
    private String pdaUserUame;
    @ExcelProperty(value = "派单总数",index = 2)
    private Integer peccancyNum;

    @ExcelProperty(value = "订单总金额",index = 3)
    private Integer orderPrice;
    @ExcelProperty(value = "完成派单数",index = 4)
    private Integer finishNum;
    @ExcelProperty(value = "派单完成率（%）",index = 5)
    private BigDecimal finishRatio;

    @ExcelProperty(value = "平均完成时间（分）",index = 6)
    private Integer averageFinishTime;
}
