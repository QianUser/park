package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 中队管理详情参数
 */
@Data
@ApiModel
public class SysPdaUserTeamDetailParams extends CmsBaseParams{
    @ApiModelProperty(value = "中队主键id")
    private Integer pdaUserTeamId;

}
