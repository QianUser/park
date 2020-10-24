package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 班次管理查询参数
 */
@Data
@ApiModel
public class SysPdaScheduleSearchParams extends CmsPageHelperParams {
    @ApiModelProperty(value = "班次名称")
    private String pdaScheduleName;

}
