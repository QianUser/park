package com.park.cloud.common.domain.dto.cms;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 中队管理查询参数
 */
@Data
@ApiModel
public class SysPdaUserTeamDto extends PageHelperParams {
    @ApiModelProperty(value = "主键，自动增长")
    private Integer pdaUserTeamId;

    @ApiModelProperty(value = "中队名称")
    private String teamName;

    @ApiModelProperty(value = "城市")
    private Integer cityId;

    @ApiModelProperty(value = "行政区")
    private Integer cantonId;

    @ApiModelProperty(value = "片区")
    private Integer areaId;

    @ApiModelProperty(value = "路段")
    private Integer sectionId;

}
