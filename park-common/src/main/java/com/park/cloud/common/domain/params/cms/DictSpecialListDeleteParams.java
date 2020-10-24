package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictSpecialListDeleteParams extends CmsBaseParams {

    @NotNull(message = "ID不能为空")
    @ApiModelProperty(value = "ID", required = true)
    private Integer specialListId;

}