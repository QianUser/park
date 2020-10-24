package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel("退费订单参数")
public class TraRefundOrderParams extends CmsPageHelperParams {

    @ApiModelProperty("订单编号")
    private String bargainOrderCode;

    @ApiModelProperty("退费订单编号")
    private String refundOrderCode;

    @ApiModelProperty("泊位编号")
    private String berthCode;

    @ApiModelProperty("开始时间")
    private Date startTime;

    @ApiModelProperty("结束时间")
    private Date endTime;

    @ApiModelProperty("状态（1：未退费 2：已退费")
    private Integer refundStatus;

    @ApiModelProperty("类型（0，未知 1，正常退费 2，异常改单退费）")
    private Integer refundType;

    @ApiModelProperty("订单类型（0路外订单；1路内订单）")
    private Integer bargainOrderType;

}
