package com.park.cloud.common.domain.params.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author kris_ni
 * @date 2020/3/10
 */
@Data
@ApiModel
public class OrderConfirmChangeParams {

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",  timezone="GMT+8")
    @ApiModelProperty(value = "路内：停车开始车检器变成有车的时间\n" +
            "路外：入场时间")
    private LocalDateTime berthStartParkingTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",  timezone="GMT+8")
    @ApiModelProperty(value = "路内：停车开始车检器变成无车的时间\n" +
            "路外：出场时间")
    private LocalDateTime berthEndParkingTime;

    @ApiModelProperty(value = "停车计费时长")
    private Integer parkTime;

    @ApiModelProperty(value = "应收金额 \n" +
            "单位：元")
    private Float payCharge;
}
