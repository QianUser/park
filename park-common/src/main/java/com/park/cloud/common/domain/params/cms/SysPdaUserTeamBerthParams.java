package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 中队管理获取泊位参数
 */
@Data
@ApiModel
public class SysPdaUserTeamBerthParams extends CmsBaseParams{
    @ApiModelProperty(value = "中队主键id")
    private Integer pdaUserTeamId;

    @ApiModelProperty(value = "泊位id")
    private List<Integer> berthIds;
}
