package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassNameRepPdaUserPeccancyVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/2/25 15:45
 **/
@Data
@ApiModel
public class RepPdaUserPeccancyVO implements Serializable {

    @ApiModelProperty(value = "路段名")
    private String sectionName;
    @ApiModelProperty(value = "巡检员")
    private String pdaUserUame;
    @ApiModelProperty(value = "派单总数")
    private Integer peccancyNum;

    @ApiModelProperty(value = "订单总金额")
    private Integer orderPrice;
    @ApiModelProperty(value = "完成派单数")
    private Integer finishNum;
    @ApiModelProperty(value = "派单完成率（%）")
    private BigDecimal finishRatio;

    @ApiModelProperty(value = "平均完成时间（分）")
    private Integer averageFinishTime;

}
