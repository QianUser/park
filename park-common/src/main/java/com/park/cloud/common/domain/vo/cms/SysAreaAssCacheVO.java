package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class SysAreaAssCacheVO implements Serializable {

    @ApiModelProperty(value = "用户辖区ID")
    private Integer areaassId;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "辖区类型（1城市、2行政区、3片区）（0全部辖区，系统内置管理员用，页面不显示）")
    private Integer areaAssType;

    @ApiModelProperty(value = "管理的城市id（多个逗号分隔）")
    private String cityIds;

    @ApiModelProperty(value = "管理行政区id（多个逗号分隔）")
    private String cantonIds;

    @ApiModelProperty(value = "管理片区id（多个逗号分隔）")
    private String areaIds;

}