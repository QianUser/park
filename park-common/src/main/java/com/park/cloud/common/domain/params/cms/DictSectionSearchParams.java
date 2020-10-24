package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class DictSectionSearchParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "路段名")
    private String sectionName;

    @ApiModelProperty(value = "行政区")
    private Integer cantonId;

    @ApiModelProperty(value = "片区")
    private Integer areaId;

    @ApiModelProperty(value = "路段类型（1：一类2：二类，3：三类）")
    private Integer sectionMold;
}