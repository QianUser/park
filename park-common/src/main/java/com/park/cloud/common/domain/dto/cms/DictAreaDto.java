package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class DictAreaDto extends CmsBaseDto {

    @ApiModelProperty(value = "片区名称")
    private String areaName;

    @ApiModelProperty(value = "行政区ID")
    private Integer cantonId;

}