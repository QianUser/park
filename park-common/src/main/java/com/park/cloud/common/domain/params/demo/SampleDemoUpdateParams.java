package com.park.cloud.common.domain.params.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author kris_ni
 * @date 2020/1/13
 */
@Data
@ApiModel
public class SampleDemoUpdateParams {

    @ApiModelProperty(value = "id")
    private Integer sampleDemoId;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "百分比")
    private BigDecimal rate;

    @ApiModelProperty(value = "状态（0：无效 1：有效）")
    private Integer status;
}
