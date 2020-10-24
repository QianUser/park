package com.park.cloud.common.domain.dto.cms;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 僵尸车查询参数
 */
@Data
@ApiModel
public class DictBerthCityDayDto extends PageHelperParams {

    @ApiModelProperty(value = "泊位号")
    private String berthCode;

    @ApiModelProperty(value = "路段")
    private Integer sectionId;

}
