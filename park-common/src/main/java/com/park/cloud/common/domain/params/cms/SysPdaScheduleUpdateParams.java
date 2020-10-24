package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 班次管理编辑参数
 */
@Data
@ApiModel
public class SysPdaScheduleUpdateParams extends CmsBaseParams{
    @ApiModelProperty(value = "班次主键id")
    private Integer pdaScheduleId;

    @ApiModelProperty(value = "班次名称")
    private String pdaScheduleName;

    @ApiModelProperty(value = "开始时间(hh:mm:ss)")
    private String startTime;

    @ApiModelProperty(value = "结束时间(hh:mm:ss)")
    private String endTime;

    @ApiModelProperty(value = "备注")
    private String remark;
}
