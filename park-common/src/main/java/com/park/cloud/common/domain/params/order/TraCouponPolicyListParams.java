package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuhainan
 */
@Data
@ApiModel(value = "CouponPolicy 列表请求参数")
public class TraCouponPolicyListParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "优惠券类型")
    private Integer relationType;

    @ApiModelProperty(value = "优惠券名称")
    private String wxjlCpName;

    @ApiModelProperty(value = "发放规则")
    private Integer rulesType;
}
