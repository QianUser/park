package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class SysDepartmentDetailParams extends CmsBaseParams {

    @NotNull(message = "部门ID不能为空")
    @ApiModelProperty(value = "部门ID", required = true)
    private Integer deptId;
}