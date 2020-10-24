package com.park.cloud.common.domain.params.merchant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/05/11 15:23
 */
@Data
@ApiModel
public class IssueParams extends MerchantBaseParams{

    @NotNull(message = "优惠券id不能为空！")
    @ApiModelProperty(value = "优惠券id",required = true)
    private Integer wxjlCpId;

    @NotBlank(message = "用户手机号不能为空！")
    @ApiModelProperty(value = "用户手机号",required = true)
    private String mobileNumber;

    @NotNull(message = "商户优惠券id不能为空！")
    @ApiModelProperty(value = "商户优惠券id")
    private Integer copId;
}
