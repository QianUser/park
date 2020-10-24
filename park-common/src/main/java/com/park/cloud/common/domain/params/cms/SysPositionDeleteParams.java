package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class SysPositionDeleteParams extends CmsBaseParams {

    @NotNull(message = "职位ID不能为空")
    @ApiModelProperty(value = "职位ID", required = true)
    private Integer positionId;

}