package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class SysCompanyDto implements Serializable {

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "电话")
    private String companyTel;
}
