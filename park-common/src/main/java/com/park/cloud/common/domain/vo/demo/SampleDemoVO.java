package com.park.cloud.common.domain.vo.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author kris_ni
 * @date 2020/1/13
 */
@Data
@ApiModel
public class SampleDemoVO {

    @ApiModelProperty(value = "id")
    private Integer sampleDemoId;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "状态（0：无效 1：有效）")
    private Integer status;

    @ApiModelProperty(value = "添加时间")
    private Date addTime;

    @ApiModelProperty(value = "百分比")
    private BigDecimal rate;
}
