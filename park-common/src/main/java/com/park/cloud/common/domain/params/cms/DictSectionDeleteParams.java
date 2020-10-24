package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictSectionDeleteParams extends CmsBaseParams {

    @NotNull(message = "路段ID不能为空")
    @ApiModelProperty(value = "路段ID", required = true)
    private Integer sectionId;

}