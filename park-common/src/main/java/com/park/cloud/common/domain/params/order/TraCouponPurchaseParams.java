package com.park.cloud.common.domain.params.order;


import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuhainan
 */
@Data
@ApiModel(value = "CouponPurchase 列表请求参数")
public class TraCouponPurchaseParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "优惠券名称")
    private String cpName;

    @ApiModelProperty(value = "停车服务号")
    private String cmuId;

    @ApiModelProperty(value = "手机号")
    private String mobileNumber;

    @ApiModelProperty(value = "开始时间")
    private String startTime;

    @ApiModelProperty(value = "结束时间")
    private String endTime;

    @ApiModelProperty(value = "支付状态\n" +
            "0支付中\n" +
            "1成功\n" +
            "2失败\n" +
            "3异常")
    private Integer payStatus;
}
