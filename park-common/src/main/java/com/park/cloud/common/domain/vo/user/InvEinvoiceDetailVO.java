package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author liuhainan
 */
@Data
@ApiModel("电子发票历史详情")
public class InvEinvoiceDetailVO {

    @ApiModelProperty("主键")
    private Integer eInvoiceId;

    @ApiModelProperty("电子发票编号")
    private String eInvoiceCode;

    @ApiModelProperty("企业类型 01：企业 02：机关事业单位 03：个人 04：其他")
    private String companyType;

    @ApiModelProperty("购买方公司名称")
    private String companyName;

    @ApiModelProperty("纳税人识别号")
    private String taxPayerNumber;

    @ApiModelProperty("开票总额（含税）")
    private BigDecimal totalPrice;

    @ApiModelProperty("开票状态 0：已申请 1：下发成功 9999：下发失败")
    private Integer orderStatus;

    @ApiModelProperty("入库时间")
    private Date addTime;

    @ApiModelProperty("数量")
    private Integer number;

    @ApiModelProperty("0:停车订单 1：包月/包年")
    private Integer eInvoiceType;

    @ApiModelProperty("开票订单")
    private List<InvEinvoiceOrderVO> orderList;

}
