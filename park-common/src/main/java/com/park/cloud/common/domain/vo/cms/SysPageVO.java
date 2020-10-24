package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class SysPageVO implements Serializable {

    @ApiModelProperty(value = "页面id")
    private Integer pageId;

    @ApiModelProperty(value = "页面名称")
    private String pageName;

    @ApiModelProperty(value = "菜单等级(1,2,3..)")
    private Integer pageLevel;

    @ApiModelProperty(value = "菜单类型（0是文件夹 1是页面）")
    private Integer pageType;

    @ApiModelProperty(value = "页面控制器名称")
    private String pageUrl;

    @ApiModelProperty(value = "上级菜单id，顶层为0")
    private Integer parentId;
}