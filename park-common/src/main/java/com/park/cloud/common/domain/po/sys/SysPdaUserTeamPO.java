package com.park.cloud.common.domain.po.sys;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 中队管理查询参数
 */
@Data
@ApiModel
public class SysPdaUserTeamPO extends PageHelperParams {
    @ApiModelProperty(value = "主键，自动增长")
    private Integer pdaUserTeamId;

    @ApiModelProperty(value = "中队名称")
    private String teamName;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "行政区")
    private String canton;

    @ApiModelProperty(value = "片区")
    private String area;

    @ApiModelProperty(value = "路段")
    private String section;

    @ApiModelProperty(value = "巡检成员")
    private List<String> pdaUserName;

    @ApiModelProperty(value = "城市")
    private Integer cityId;

    @ApiModelProperty(value = "行政区")
    private Integer cantonId;

    @ApiModelProperty(value = "片区")
    private Integer areaId;

    @ApiModelProperty(value = "路段")
    private Integer sectionId;

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

    @ApiModelProperty(value = "创建人")
    private Integer addUser;

    @ApiModelProperty(value = "是否分配泊位：0、否，1、是")
    private Integer hasBerth;
}
