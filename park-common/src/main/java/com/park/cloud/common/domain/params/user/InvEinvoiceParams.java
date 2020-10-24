package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class InvEinvoiceParams extends ClientBaseParams{

    @ApiModelProperty(value = "主键",allowEmptyValue = true)
    private Integer eInvoiceId;

    @ApiModelProperty(value = "电子发票编号",allowEmptyValue = true)
    private String eInvoiceCode;

    @NotBlank(message = "关联用户信息表ID不能为空")
    @ApiModelProperty(value = "关联用户信息表ID",allowEmptyValue = false)
    private String parkUserId;

    @NotBlank(message = "企业类型不能为空")
    @ApiModelProperty(value = "企业类型 01：企业 02：机关事业单位 03：个人 04：其他",allowEmptyValue = false)
    private String companyType;

    @ApiModelProperty(value = "购买方公司名称",allowEmptyValue = false)
    private String companyName;

    @ApiModelProperty(value = "纳税人识别号(企业必填)",allowEmptyValue = true)
    private String taxPayerNumber;

    @ApiModelProperty(value = "地址(企业必填)",allowEmptyValue = true)
    private String address;

    @ApiModelProperty(value = "联系电话",allowEmptyValue = false)
    private String mobileNumber;

    @ApiModelProperty(value = "开户银行(企业必填)",allowEmptyValue = true)
    private String bankName;

    @ApiModelProperty(value = "开户账号(企业必填)",allowEmptyValue = true)
    private String bankAccount;

    @ApiModelProperty(value = "开票金额（不含税）",allowEmptyValue = true)
    private BigDecimal einvoicePrice;

    @ApiModelProperty(value = "税额",allowEmptyValue = true)
    private BigDecimal taxPrice;

    @ApiModelProperty(value = "税率（转为小数）",allowEmptyValue = true)
    private BigDecimal taxRate;

    @ApiModelProperty(value = "开票总额（含税）",allowEmptyValue = true)
    private BigDecimal totalPrice;

    @Email(message = "邮箱格式不正确")
    @NotBlank(message = "发票接收邮件地址不能为空！")
    @ApiModelProperty(value = "发票接收邮件地址",allowEmptyValue = true)
    private String email;

    @ApiModelProperty(value = "开票状态 0：已申请 1：下发成功 9999：下发失败",allowEmptyValue = true)
    private Integer orderStatus;

    @ApiModelProperty(value = "邮件发送状态 0：未发送 1：已发送",allowEmptyValue = true)
    private Integer emailStatus;

    @ApiModelProperty(value = "备注",allowEmptyValue = true)
    private String remark;

    @ApiModelProperty(value = "入库时间",allowEmptyValue = true)
    private Date addTime;

    @NotNull(message = "订单类型不能为空！")
    @ApiModelProperty(value = "0:停车订单 1：包月/包年",allowEmptyValue = false)
    private Integer invoiceType;

    @ApiModelProperty(value = "0:未推送 1:已推送",allowEmptyValue = true)
    private Integer wechatStatus;

    @ApiModelProperty(value = "0:未推送 1:已推送",allowEmptyValue = true)
    private Integer zfbStatus;

    @NotEmpty(message = "订单编号集合不能为空")
    @ApiModelProperty(value = "订单编号集合",allowEmptyValue = false)
    private List<String> orders;

}
