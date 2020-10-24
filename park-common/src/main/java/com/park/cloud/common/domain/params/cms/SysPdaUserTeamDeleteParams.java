package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 中队管理删除参数
 */
@Data
@ApiModel
public class SysPdaUserTeamDeleteParams extends CmsBaseParams {
    @ApiModelProperty(value = "主键，自动增长")
    private Integer pdaUserTeamId;
}
