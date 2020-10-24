package com.park.cloud.common.domain.params.merchant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Merchant平台接口参数基类
 *
 * @author liuhainan
 * @createDate 2020/05/07 16:59
 */
@Data
@ApiModel
public class MerchantBaseParams implements Serializable  {

    @NotNull(message = "Merchant登录用户ID不能为空")
    @ApiModelProperty(value = "Merchant登录用户ID")
    private Integer loginMerchantId;
}
