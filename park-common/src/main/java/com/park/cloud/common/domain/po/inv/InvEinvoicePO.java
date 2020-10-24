package com.park.cloud.common.domain.po.inv;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel("用户申请电子发票")
public class InvEinvoicePO {

    @ApiModelProperty("主键")
    private Integer eInvoiceId;

    @ApiModelProperty("电子发票编号")
    private String eInvoiceCode;

    @ApiModelProperty("关联用户信息表ID")
    private String parkUserId;

    @NotBlank(message = "企业类型不能为空")
    @ApiModelProperty("企业类型 01：企业 02：机关事业单位 03：个人 04：其他")
    private String companyType;

    @NotBlank(message = "购买方公司名称不能为空")
    @ApiModelProperty("购买方公司名称")
    private String companyName;

    @ApiModelProperty("纳税人识别号")
    private String taxPayerNumber;

    @ApiModelProperty("地址")
    private String address;

    @ApiModelProperty("联系电话")
    private String mobileNumber;

    @ApiModelProperty("开户银行")
    private String bankName;

    @ApiModelProperty("开户账号")
    private String bankAccount;

    @ApiModelProperty("开票金额（不含税）")
    private BigDecimal einvoicePrice;

    @ApiModelProperty("税额")
    private BigDecimal taxPrice;

    @ApiModelProperty("税率（转为小数）")
    private BigDecimal taxRate;

    @ApiModelProperty("开票总额（含税）")
    private BigDecimal totalPrice;

    @ApiModelProperty("发票接收邮件地址")
    private String email;

    @ApiModelProperty("开票状态 0：已申请 1：下发成功 9999：下发失败")
    private Integer orderStatus;

    @ApiModelProperty("邮件发送状态 0：未发送 1：已发送")
    private Integer emailStatus;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("入库时间")
    private Date addTime;

    @ApiModelProperty("0:停车订单 1：包月/包年")
    private Integer eInvoiceType;

    @ApiModelProperty("0:未推送 1:已推送")
    private Integer wechatStatus;

    @ApiModelProperty("0:未推送 1:已推送")
    private Integer zfbStatus;

}