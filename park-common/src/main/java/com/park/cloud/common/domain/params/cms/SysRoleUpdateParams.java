package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@ApiModel
public class SysRoleUpdateParams extends CmsBaseParams {

    @NotNull(message = "角色id不能为空")
    @ApiModelProperty(value = "角色id", required = true)
    private Integer roleId;

    @ApiModelProperty(value = "角色名")
    private String roleName;

    @ApiModelProperty(value = "备注")
    private String roleRemark;

    @ApiModelProperty(value = "角色状态")
    private Integer roleStatus;

    @ApiModelProperty(value = "页面id.多个以逗号隔开.(废弃)")
    private String pageIds;

    @ApiModelProperty(value = "菜单内容")
    private String menuContent;

}