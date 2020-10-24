package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class DictSpecialListSearchParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型")
    private Integer plateType;

    @ApiModelProperty(value = "类型(1黑名单,2白名单)")
    private Integer specialListType;

    @ApiModelProperty(value = "行政区ID")
    private Integer cantonId;

    @ApiModelProperty(value = "片区")
    private Integer areaId;
}