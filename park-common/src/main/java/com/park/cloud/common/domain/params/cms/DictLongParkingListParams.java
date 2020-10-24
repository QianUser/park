package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 巡检员管理列表参数
 */
@Data
@ApiModel
public class DictLongParkingListParams extends CmsBaseParams {
    @ApiModelProperty(value = "巡检员名称")
    private String teamName;

    @ApiModelProperty(value = "城市")
    private Integer cityId;

    @ApiModelProperty(value = "行政区")
    private Integer cantonId;

    @ApiModelProperty(value = "片区")
    private Integer areaId;

    @ApiModelProperty(value = "路段")
    private Integer sectionId;

}
