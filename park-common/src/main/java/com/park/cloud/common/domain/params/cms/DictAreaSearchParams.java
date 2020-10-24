package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class DictAreaSearchParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "片区名称")
    private String areaName;

    @ApiModelProperty(value = "行政区ID")
    private Integer cantonId;

}