package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author liuhainan
 */
@Data
@ApiModel("查询用户优惠券")
public class GetUserCouponParams extends CmsBaseParams {

    @ApiModelProperty("用户id")
    private String userId;

    @NotNull(message = "状态不能为空")
    @ApiModelProperty("优惠券状态：0、生效，1、失效，2、已使用")
    private Integer state;
}
