package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/03/17 14:14
 */
@Data
public class EinvoiceDetailVO {


    @ApiModelProperty("主键")
    private Integer eInvoiceId;

    @ApiModelProperty("订单号")
    private String bargainOrderCode;

    @ApiModelProperty("联系电话")
    private String mobileNumber;

    @ApiModelProperty("车牌号")
    private String plateNumber;

    @ApiModelProperty("车牌号类型")
    private Integer plateType;

    @ApiModelProperty("订单金额")
    private Integer payCharge;

    @ApiModelProperty("支付时间")
    private Date payTime;

    @ApiModelProperty("企业类型 01：企业 02：机关事业单位 03：个人 04：其他")
    private String companyType;

    @ApiModelProperty("申请时间")
    private Date addTime;

    @ApiModelProperty("开票状态 0：已申请 1：下发成功 9999：下发失败")
    private Integer orderStatus;

    @ApiModelProperty("邮件发送状态 0：未发送 1：已发送")
    private Integer emailStatus;

    @ApiModelProperty("发票详情")
    private InvMebTaxInfoVO invMebTaxInfoVO;

    @ApiModelProperty("用户停车号")
    private String parkUserId;

}
