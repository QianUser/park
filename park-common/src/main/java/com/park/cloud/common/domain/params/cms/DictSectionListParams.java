package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class DictSectionListParams extends CmsBaseParams {

    @ApiModelProperty(value = "片区ID")
    private Integer areaId;

    @ApiModelProperty(value = "路段名")
    private String sectionName;
}