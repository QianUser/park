package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel
public class SysPageListVO implements Serializable {

    @ApiModelProperty(value = "页面id")
    private Integer pageId;

    @ApiModelProperty(value = "页面名称")
    private String pageName;

    @ApiModelProperty(value = "菜单等级(1,2,3..)")
    private Integer pageLevel;

    @ApiModelProperty(value = "菜单类型（0是文件夹 1是页面）")
    private Integer pageType;

    @ApiModelProperty(value = "子页面列表，数据结构和父类相同")
    private List<SysPageListVO> subPages;
}