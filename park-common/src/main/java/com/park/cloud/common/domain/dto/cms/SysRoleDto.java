package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class SysRoleDto implements Serializable {

    @ApiModelProperty(value = "角色名")
    private String roleName;

}