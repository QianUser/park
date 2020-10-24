package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class TraUserCouponAddListParams extends CmsBaseParams {

    @Valid
    @NotEmpty(message = "用户优惠券列表不能为空")
    @ApiModelProperty(value = "用户优惠券列表",allowEmptyValue = false)
    private List<TraUserCouponAddParams> userCoupons;
}
