package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 排班删除参数
 */
@Data
@ApiModel
public class SysPdaUserScheduleDeleteParams extends CmsBaseParams {
    @ApiModelProperty(value = "排班主键id")
    private Integer pdaUserScheduleId;
}
