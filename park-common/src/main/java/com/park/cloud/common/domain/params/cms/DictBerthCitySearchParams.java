package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class DictBerthCitySearchParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "路段id")
    private Integer sectionId;

    @ApiModelProperty(value = "状态（1规划中、2建设中、3使用中、4维修中、5已停用）")
    private Integer berthStatus;

    @ApiModelProperty(value = "泊位号")
    private String berthCode;

    @ApiModelProperty(value = "片区id")
    private Integer areaId;

    @ApiModelProperty(value = "行政区id")
    private Integer cantonId;

    @ApiModelProperty(value = "泊位设备SN号")
    private String snCode;

}