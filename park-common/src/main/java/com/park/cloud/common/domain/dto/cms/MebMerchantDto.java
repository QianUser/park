package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class MebMerchantDto implements Serializable {

    @ApiModelProperty(value = "商户名")
    private String mInfoName;
}