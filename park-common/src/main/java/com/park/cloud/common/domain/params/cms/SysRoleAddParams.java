package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@ApiModel
public class SysRoleAddParams extends CmsBaseParams {

    @NotEmpty(message = "角色名不能为空")
    @ApiModelProperty(value = "角色名", required = true)
    private String roleName;

    @ApiModelProperty(value = "备注")
    private String roleRemark;

    @ApiModelProperty(value = "页面id.多个以逗号隔开.(废弃)")
    private String pageIds;

    @ApiModelProperty(value = "菜单内容")
    private String menuContent;

}