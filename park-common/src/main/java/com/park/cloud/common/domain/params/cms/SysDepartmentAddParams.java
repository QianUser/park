package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class SysDepartmentAddParams extends CmsBaseParams {

    @NotNull(message = "公司ID不能为空")
    @ApiModelProperty(value = "公司ID", required = true)
    private Integer companyId;

    @NotEmpty(message = "部门名称不能为空")
    @ApiModelProperty(value = "部门名称", required = true)
    private String deptName;

    @NotNull(message = "上级部门ID不能为空")
    @ApiModelProperty(value = "上级部门ID(0表示没有上级部门)", required = true)
    private Integer parentDeptId;

    @ApiModelProperty(value = "备注")
    private String deptRemark;

    @NotNull(message = "状态不能为空")
    @ApiModelProperty(value = "状态（0：已锁定  1：启用中）", required = true)
    private Integer deptStatus;
}