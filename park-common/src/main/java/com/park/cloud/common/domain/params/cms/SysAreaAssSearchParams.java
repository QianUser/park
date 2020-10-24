package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class SysAreaAssSearchParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "登录账号")
    private String userName;

    @ApiModelProperty(value = "用户真实姓名")
    private String userTrueName;

}