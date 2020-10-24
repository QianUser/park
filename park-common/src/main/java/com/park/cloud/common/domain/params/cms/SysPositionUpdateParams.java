package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class SysPositionUpdateParams extends CmsBaseParams {

    @NotNull(message = "职位ID不能为空")
    @ApiModelProperty(value = "职位ID", required = true)
    private Integer positionId;

    @ApiModelProperty(value = "公司ID")
    private Integer companyId;

    @ApiModelProperty(value = "职位名称")
    private String positionName;

}