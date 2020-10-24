package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 班次管理列表参数
 */
@Data
@ApiModel
public class SysPdaScheduleListParams extends CmsBaseParams {
    @ApiModelProperty(value = "班次名称")
    private String pdaScheduleName;
}
