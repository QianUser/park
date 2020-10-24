package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class TraRefundOrderPoParams extends CmsBaseParams {

    @ApiModelProperty(value = "退费订单Id",allowEmptyValue = true)
    private Long refundOrderId;

    @NotBlank(message = "订单编号不能为空")
    @ApiModelProperty(value = "订单编号",allowEmptyValue = false)
    private String bargainOrderCode;

    @NotNull(message = "支付单号不能为空！")
    @ApiModelProperty(value = "支付单号",allowEmptyValue = false)
    private Long orderPaymentId;

    @ApiModelProperty(value = "停车号",allowEmptyValue = true)
    private String parkUserId;

    @ApiModelProperty(value = "退费订单编号",allowEmptyValue = true)
    private String refundOrderCode;

    @ApiModelProperty(value = "泊位编号",allowEmptyValue = true)
    private String berthCode;

    @NotNull(message = "退费金额不能为空" )
    @ApiModelProperty(value = "退费金额（分）", allowEmptyValue = false)
    private Integer refundPrice;

    @ApiModelProperty(value = "添加时间",allowEmptyValue = true)
    private Date addTime;

    @ApiModelProperty(value = "退费时间",allowEmptyValue = true)
    private Date refundTime;

    @ApiModelProperty(value = "状态（1：未退费 2：已退费）",allowEmptyValue = true)
    private Integer refundStatus;

    @ApiModelProperty(value = "状态（1：未清分 2：已清分）",allowEmptyValue = true)
    private Integer payStatus;

    @NotNull(message = "退费类型不能为空" )
    @ApiModelProperty(value = "类型（0，未知 1，正常退费 2，异常改单退费）",allowEmptyValue = false)
    private Integer refundType;

    @ApiModelProperty(value = "订单类型（0路外订单；1路内订单）",allowEmptyValue = true)
    private Integer bargainOrderType;

    @ApiModelProperty(value = "平台管理员id",allowEmptyValue = true)
    private String sysUserId;

    @ApiModelProperty(value = "备注",allowEmptyValue = true)
    private String remark;


}
