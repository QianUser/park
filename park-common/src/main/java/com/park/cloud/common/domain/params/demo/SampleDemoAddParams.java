package com.park.cloud.common.domain.params.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

/**
 * @author kris_ni
 * @date 2020/1/13
 */
@Data
@ApiModel
public class SampleDemoAddParams {

    @NotBlank(message = "名称不能为空")
    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "百分比")
    private BigDecimal rate;
}
