package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class DictAreaListVO implements Serializable {

    @ApiModelProperty(value = "片区ID")
    private Integer areaId;

    @ApiModelProperty(value = "片区名称")
    private String areaName;

}