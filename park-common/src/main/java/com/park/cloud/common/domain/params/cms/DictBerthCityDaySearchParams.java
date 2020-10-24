package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 今日泊位占用查询参数
 */
@Data
@ApiModel
public class DictBerthCityDaySearchParams extends CmsPageHelperParams {
    @ApiModelProperty(value = "泊位号")
    private String berthCode;

    @ApiModelProperty(value = "路段")
    private Integer sectionId;

}
