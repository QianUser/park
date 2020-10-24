package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class SysDepartmentUpdateParams extends CmsBaseParams {

    @NotNull(message = "部门ID不能为空")
    @ApiModelProperty(value = "部门ID", required = true)
    private Integer deptId;

    @ApiModelProperty(value = "公司ID")
    private Integer companyId;

    @ApiModelProperty(value = "部门名称")
    private String deptName;

    @ApiModelProperty(value = "上级部门ID(0表示没有上级部门)")
    private Integer parentDeptId;

    @ApiModelProperty(value = "备注")
    private String deptRemark;

    @ApiModelProperty(value = "状态（0：已锁定  1：启用中）")
    private Integer deptStatus;
}