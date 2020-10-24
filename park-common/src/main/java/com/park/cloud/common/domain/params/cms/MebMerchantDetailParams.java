package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class MebMerchantDetailParams extends CmsBaseParams {

    @NotNull(message = "商户ID不能为空")
    @ApiModelProperty(value = "商户ID", required = true)
    private Integer mid;
}