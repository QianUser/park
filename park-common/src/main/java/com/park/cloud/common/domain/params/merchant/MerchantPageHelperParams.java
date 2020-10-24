package com.park.cloud.common.domain.params.merchant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/05/08 10:46
 */
@Data
@ApiModel
public class MerchantPageHelperParams extends MerchantBaseParams{
    @ApiModelProperty(value = "页码，当前页（导出时忽略）")
    private int pageNum;

    @ApiModelProperty(value = "每页条数（导出时忽略）")
    private int pageSize;
}
