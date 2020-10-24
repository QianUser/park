package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictAreaUpdateParams extends CmsBaseParams {

    @NotNull(message = "片区ID不能为空")
    @ApiModelProperty(value = "片区ID", required = true)
    private Integer areaId;

    @ApiModelProperty(value = "片区编号")
    private String areaCode;

    @ApiModelProperty(value = "片区名称")
    private String areaName;

    @ApiModelProperty(value = "行政区ID")
    private Integer cantonId;

    @ApiModelProperty(value = "备注")
    private String areaRemark;
}