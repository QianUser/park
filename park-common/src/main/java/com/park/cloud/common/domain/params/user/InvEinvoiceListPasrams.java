package com.park.cloud.common.domain.params.user;


import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuhainan
 */
@Data
public class InvEinvoiceListPasrams extends CmsPageHelperParams{

    @ApiModelProperty("订单号")
    private String bargainOrderCode;

    @ApiModelProperty("停车场类型")
    private Integer bargainOrderType;

    @ApiModelProperty("开票状态 0：已申请 1：下发成功 9999：下发失败")
    private Integer orderStatus;

    @ApiModelProperty("联系电话")
    private String mobileNumber;

    @ApiModelProperty("购买方公司名称")
    private String companyName;

    @ApiModelProperty("开始入库时间")
    private String startTime;

    @ApiModelProperty("结束入库时间")
    private String endTime;

    @ApiModelProperty("支付开始时间")
    private String startPayTime;

    @ApiModelProperty("支付结束时间")
    private String endPayTime;
}
