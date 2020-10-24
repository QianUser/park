package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 中队
 */
@Data
@ApiModel
public class SysPdaUserTeamListVO implements Serializable {
    @ApiModelProperty(value = "主键，自动增长")
    private Integer pdaUserTeamId;

    @ApiModelProperty(value = "中队名称")
    private String teamName;
}
