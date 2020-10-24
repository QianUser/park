package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassNameRepPdaUserCountVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/19 13:40
 **/
@ApiModel
@Data
public class RepPdaUserCountVO {
    @ApiModelProperty(value = "派单总数")
    private Integer peccancyNum;
    @ApiModelProperty(value = "派单总金额")
    private Integer orderPrice;
    @ApiModelProperty(value = "派单完成率")
    private BigDecimal finishRatio;
    @ApiModelProperty(value = "平均完成时间")
    private Integer averageFinishTime;
}
