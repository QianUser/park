package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 排班管理查询参数
 */
@Data
@ApiModel
public class SysPdaUserScheduleSearchParams extends CmsPageHelperParams {
    @ApiModelProperty(value = "中队名称")
    private String pdaUserTeamName;

    @ApiModelProperty(value = "城市")
    private Integer cityId;

    @ApiModelProperty(value = "行政区")
    private Integer cantonId;

    @ApiModelProperty(value = "片区")
    private Integer areaId;

    @ApiModelProperty(value = "路段")
    private Integer sectionId;

    @ApiModelProperty(value = "排班年份")
    private Integer year;

    @ApiModelProperty(value = "排班月份")
    private Integer month;

    @ApiModelProperty(value = "排班日")
    private Integer day;
}
