package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class SysRoleDeleteParams extends CmsBaseParams {

    @NotNull(message = "角色id不能为空")
    @ApiModelProperty(value = "角色id", required = true)
    private Integer roleId;

}