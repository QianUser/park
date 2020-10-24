package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class SysRoleListParams extends CmsBaseParams {

    @ApiModelProperty(value = "角色名")
    private String roleName;

}