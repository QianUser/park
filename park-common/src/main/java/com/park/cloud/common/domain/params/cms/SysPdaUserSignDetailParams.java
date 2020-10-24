package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 巡检员管理详情参数
 */
@Data
@ApiModel
public class SysPdaUserSignDetailParams extends CmsBaseParams{
    @ApiModelProperty(value = "巡检员主键id")
    private String teamNameId;

}
