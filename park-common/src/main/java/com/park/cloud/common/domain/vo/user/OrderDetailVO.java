package com.park.cloud.common.domain.vo.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author kris_ni
 * @date 2020/2/2
 */
@Data
@ApiModel
public class OrderDetailVO {

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    @ApiModelProperty(value = "泊位编号")
    private String berthCode;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "计费开始时间")
    private LocalDateTime startParkingTime;

    @ApiModelProperty(value = "停车时长")
    private Integer actualDuration;

    @ApiModelProperty(value = "实际所需金额（单位：分）")
    private Integer actualPrice;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "路内：停车开始车检器变成有车的时间\n" +
            "路外：入场时间")
    private LocalDateTime berthStartParkingTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "路内：停车开始车检器变成有车的时间\n" +
            "路外：入场时间")
    private LocalDateTime berthEndParkingTime;

    @ApiModelProperty(value = "应收金额 \n" +
            "单位：元")
    private Float payCharge;

    @ApiModelProperty(value = "退费金额（分）")
    private Integer refundPrice;

}
