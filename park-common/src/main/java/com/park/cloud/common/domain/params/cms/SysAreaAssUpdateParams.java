package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class SysAreaAssUpdateParams extends CmsBaseParams {

    @NotNull(message = "用户ID不能为空")
    @ApiModelProperty(value = "用户ID", required = true)
    private Integer userId;

    @NotNull(message = "辖区类型不能为空")
    @ApiModelProperty(value = "辖区类型（1城市、2行政区、3片区）（0全部辖区，系统内置管理员用，页面不显示）", required = true)
    private Integer areaAssType;

    @ApiModelProperty(value = "管理的城市id（多个逗号分隔）")
    private String cityIds;

    @ApiModelProperty(value = "管理行政区id（多个逗号分隔）")
    private String cantonIds;

    @ApiModelProperty(value = "管理片区id（多个逗号分隔）")
    private String areaIds;

    @ApiModelProperty(value = "备注")
    private String remarks;

}