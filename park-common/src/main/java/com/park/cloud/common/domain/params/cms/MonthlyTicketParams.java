package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 包月卷呈现时分页搜索参数
 */
@Data
@ApiModel
public class MonthlyTicketParams extends CmsBaseParams{

    @ApiModelProperty(value = "页码，当前页（导出时忽略）")
    private int pageNum;

    @ApiModelProperty(value = "每页条数（导出时忽略）")
    private int pageSize;

    @ApiModelProperty("停车场Id")
    private Integer parkingSectionId;

    @ApiModelProperty("车牌号")
    private String plateNumber;

    @ApiModelProperty("日期类型（包月类型：1工作日日间2工作日夜间和非工作日全天，3 全天）")
    private Integer rateDateType;
}
