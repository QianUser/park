package com.park.cloud.common.domain.vo.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author kris_ni
 * @date 2020/2/1
 */
@Data
@ApiModel
public class OrderFeeInfoVO {

    @ApiModelProperty(value = "路段名或者停车场名")
    private String parkName;

    @ApiModelProperty(value = "订单状态：0计时中；1停车结束")
    private Integer orderStatus;

    @ApiModelProperty(value = "停车小时数")
    private Long parkHours;

    @ApiModelProperty(value = "停车分钟数")
    private Long parkMins;

    @ApiModelProperty(value = "停车秒数")
    private Long parkSeconds;

    @ApiModelProperty(value = "车牌号")
    private String plateNum;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;

    @ApiModelProperty(value = "泊位编号")
    private String berthCode;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "费用（分）")
    private Float payCharge;

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    @ApiModelProperty(value = "订单类型（0路外订单；1路内订单")
    private Integer bargainOrderType;

    @ApiModelProperty(value = "路外停车场编号")
    private String parkCode;

}
