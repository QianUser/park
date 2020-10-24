package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictCantonSearchParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "行政区名称")
    private String cantonName;

}