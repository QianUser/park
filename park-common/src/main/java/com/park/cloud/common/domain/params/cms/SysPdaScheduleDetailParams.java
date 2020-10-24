package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 班次管理详情参数
 */
@Data
@ApiModel
public class SysPdaScheduleDetailParams extends CmsBaseParams{
    @ApiModelProperty(value = "班次主键id")
    private Integer pdaScheduleId;

}
