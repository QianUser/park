package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class MebMerchantSearchParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "商户名")
    private String mInfoName;
}