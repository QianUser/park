package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 排班删除参数
 */
@Data
@ApiModel
public class SysPdaUserScheduleUpdateParams extends CmsBaseParams {
    @ApiModelProperty(value = "排班删除参数")
    private List<SysPdaUserScheduleDeleteParams> deleteParams;

    @ApiModelProperty(value = "排班新增参数")
    private List<SysPdaUserScheduleAddParams> addParams;
}
