package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class SysDepartmentDto implements Serializable {

    @ApiModelProperty(value = "公司ID")
    private Integer companyId;

    @ApiModelProperty(value = "部门名称")
    private String deptName;

    @ApiModelProperty(value = "状态（0：已锁定  1：启用中）")
    private Integer deptStatus;

    @ApiModelProperty(value = "部门等级0：全部，1：一级，2:二级")
    private Integer deptLevel;
}