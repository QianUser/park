package com.park.cloud.common.domain.params.merchant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/05/08 10:45
 */
@Data
@ApiModel(value = "CouponPolicy 列表请求参数")
public class CouponPolicyListParams extends MerchantPageHelperParams{

    @ApiModelProperty(value = "优惠券类型")
    private Integer relationType;

    @ApiModelProperty(value = "优惠券名称")
    private String wxjlCpName;

}
