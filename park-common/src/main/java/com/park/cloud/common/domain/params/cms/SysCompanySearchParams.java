package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class SysCompanySearchParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "电话")
    private String companyTel;
}