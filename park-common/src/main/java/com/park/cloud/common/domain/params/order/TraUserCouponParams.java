package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuhainan
 */
@Data
@ApiModel(value = "UserCoupon 列表请求参数")
public class TraUserCouponParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "优惠券名称")
    private String cpName;

    @ApiModelProperty(value = "手机号")
    private String mobileNumber;

    @ApiModelProperty(value = "购买者类型：1用户2商户")
    private Integer buyerType;

    @ApiModelProperty(value = "优惠券来源类型\n" +
            "0平台(发放记录用)\n" +
            "1用户\n" +
            "2商户")
    private Integer couponType;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

}
