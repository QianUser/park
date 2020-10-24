package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 中队
 */
@Data
@ApiModel
public class SysPdaUserTeamVO implements Serializable {
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

    @ApiModelProperty(value = "是否分配泊位：0、否，1、是")
    private Integer hasBerth;
}
