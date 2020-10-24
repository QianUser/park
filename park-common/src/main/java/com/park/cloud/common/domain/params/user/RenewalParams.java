package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/04/12 13:57
 */
@Data
@ApiModel
public class RenewalParams extends ClientBaseParams{

    @NotNull(message = "用户包月券id不能为空")
    @ApiModelProperty(value = "用户包月券id",allowEmptyValue = false)
    private Integer monthlyTicketUserId;

    @NotNull(message = "续费月数不能为空")
    @ApiModelProperty(value = "续费月数",allowEmptyValue = false)
    private Integer monthNum;

    @NotNull(message = "支付方式不能为空")
    @ApiModelProperty(value = "支付方式0 PDA扫码支付 1余额支付 2微信支付 3支付宝支付 4 招行一卡通支付 5 线下支付（招行聚合二维码）",allowEmptyValue = false)
    private Integer payTpe;
}
