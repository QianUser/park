package com.park.cloud.common.domain.vo.merchant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class WXPayVO {

    @ApiModelProperty(value = "时间")
    private String timeStamp;

    @ApiModelProperty(value = "package")
    private String prepay;

    @ApiModelProperty(value = "支付标志")
    private String paySign;

    @ApiModelProperty(value = "appid")
    private String appid;

    @ApiModelProperty(value = "随机数")
    private String nonceStr;
}
