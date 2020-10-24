package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author kris_ni
 * @date 2020/2/7
 */
@Data
@ApiModel
public class TraBargainOrderChangeParams extends CmsBaseParams {

    @ApiModelProperty(value = "订单编号")
    private String bargainOrderCode;

//    @ApiModelProperty(value = "计费开始时间")
//    private LocalDateTime startParkingTime;
//
//    @ApiModelProperty(value = "计费结束时间")
//    private LocalDateTime endParkingTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "路内：停车开始车检器变成有车的时间\n" +
            "路外：入场时间")
    private LocalDateTime berthStartParkingTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "路内：停车开始车检器变成无车的时间\n" +
            "路外：出场时间")
    private LocalDateTime berthEndParkingTime;
}
