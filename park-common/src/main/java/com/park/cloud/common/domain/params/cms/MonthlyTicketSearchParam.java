package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
public class MonthlyTicketSearchParam {

    @ApiModelProperty(value = "页码，当前页（导出时忽略）")
    private int pageNum;

    @ApiModelProperty(value = "每页条数（导出时忽略）")
    private int pageSize;

    @ApiModelProperty("停车场Id")
    private Integer parkingSectionId;

    @ApiModelProperty("车牌号")
    private String plateNumber;

    @ApiModelProperty("包月策略")
    private String monthlyRateId;
}
