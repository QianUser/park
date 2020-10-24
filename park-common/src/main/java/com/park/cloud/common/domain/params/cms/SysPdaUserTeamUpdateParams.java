package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 中队管理编辑参数
 */
@Data
@ApiModel
public class SysPdaUserTeamUpdateParams extends CmsBaseParams{
    @ApiModelProperty(value = "主键，自动增长")
    private Integer pdaUserTeamId;

    @ApiModelProperty(value = "中队名称")
    private String teamName;

}
