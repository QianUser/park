package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuhainan
 */
@Data
@ApiModel(value = "PricingStrategy 列表请求参数")
public class TraPricingStrategyListParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "策略名称")
    private String pricingStrategyName;
}
