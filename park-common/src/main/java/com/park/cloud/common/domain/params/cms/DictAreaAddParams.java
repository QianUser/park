package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictAreaAddParams extends CmsBaseParams {

    @NotEmpty(message = "片区编号不能为空")
    @ApiModelProperty(value = "片区编号", required = true)
    private String areaCode;

    @NotEmpty(message = "片区名称不能为空")
    @ApiModelProperty(value = "片区名称", required = true)
    private String areaName;

    @NotNull(message = "行政区ID不能为空")
    @ApiModelProperty(value = "行政区ID", required = true)
    private Integer cantonId;

    @ApiModelProperty(value = "备注")
    private String areaRemark;
}