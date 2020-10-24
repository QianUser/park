package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class SysCompanyDetailParams extends CmsBaseParams {

    @NotNull(message = "公司ID不能为空")
    @ApiModelProperty(value = "公司ID", required = true)
    private Integer companyId;

}