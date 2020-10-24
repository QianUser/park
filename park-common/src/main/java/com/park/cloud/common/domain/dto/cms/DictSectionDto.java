package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class DictSectionDto extends CmsBaseDto {

    @ApiModelProperty(value = "路段名")
    private String sectionName;

    @ApiModelProperty(value = "行政区")
    private Integer cantonId;

    @ApiModelProperty(value = "片区")
    private Integer areaId;

    @ApiModelProperty(value = "路段类型（1：一类2：二类，3：三类）")
    private Integer sectionMold;
}