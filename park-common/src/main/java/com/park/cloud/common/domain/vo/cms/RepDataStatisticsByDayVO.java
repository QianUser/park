package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassNameRepDataStatisticsByDayVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/13 14:37
 **/
@Data
@ApiModel
public class RepDataStatisticsByDayVO {
    @ApiModelProperty(value = "时间")
    private String time;
    @ApiModelProperty(value = "行政区名称")
    private String cantonName;
    @ApiModelProperty(value = "行政区ID")
    private Integer cantonId;
    @ApiModelProperty(value = "停车指数")
    private BigDecimal stallOccupancy;
    @ApiModelProperty(value = "停车数")
    private Integer parkNum;
    @ApiModelProperty(value = "车位周转率")
    private BigDecimal turnoverRate;
}
