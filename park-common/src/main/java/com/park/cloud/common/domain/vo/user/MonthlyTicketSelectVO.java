package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
public class MonthlyTicketSelectVO {

    @ApiModelProperty("停车场Id")
    private Integer parkingSectionId;

    @ApiModelProperty("车牌号")
    private String plateNumber;

    @ApiModelProperty("1蓝2绿3黄4其他")
    private Integer plateType;
}
