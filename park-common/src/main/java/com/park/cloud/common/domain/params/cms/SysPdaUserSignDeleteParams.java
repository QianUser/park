package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 巡检员管理删除参数
 */
@Data
@ApiModel
public class SysPdaUserSignDeleteParams extends CmsBaseParams {
    @ApiModelProperty(value = "巡检员主键id")
    private String teamNameId;
}
