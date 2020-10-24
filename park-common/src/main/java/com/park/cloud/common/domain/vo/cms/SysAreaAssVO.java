package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class SysAreaAssVO implements Serializable {

    @ApiModelProperty(value = "用户辖区ID")
    private Integer areaassId;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "登录账号")
    private String userName;

    @ApiModelProperty(value = "用户真实姓名")
    private String userTrueName;

    @ApiModelProperty(value = "辖区类型（1城市、2行政区、3片区）（0全部辖区，系统内置管理员用，页面不显示）")
    private Integer areaAssType;

    @ApiModelProperty(value = "管理的城市id（多个逗号分隔）")
    private String cityIds;

    @ApiModelProperty(value = "管理行政区id（多个逗号分隔）")
    private String cantonIds;

    @ApiModelProperty(value = "管理片区id（多个逗号分隔）")
    private String areaIds;

    @ApiModelProperty(value = "管理的城市（多个逗号分隔）")
    private String cityNames;

    @ApiModelProperty(value = "管理行政区（多个逗号分隔）")
    private String cantonNames;

    @ApiModelProperty(value = "管理片区（多个逗号分隔）")
    private String areaNames;

    @ApiModelProperty(value = "备注")
    private String remarks;

}