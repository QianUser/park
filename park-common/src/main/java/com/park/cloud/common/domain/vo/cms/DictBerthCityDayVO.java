package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 今日泊位占用
 */
@Data
@ApiModel
public class DictBerthCityDayVO implements Serializable {
    @ApiModelProperty(value = "泊位号")
    private String berthCode;

    @ApiModelProperty(value = "路段")
    private Integer sectionId;

    @ApiModelProperty(value = "路段名称")
    private String sectionName;

    @ApiModelProperty(value = "占用时间")
    private Integer parkTime;

    @ApiModelProperty(value = "占用率")
    private Integer occupyRate;
}
