package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class SysUserSearchParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "登录账号")
    private String userName;

    @ApiModelProperty(value = "用户真实姓名")
    private String userTrueName;

    @ApiModelProperty(value = "所属单位id")
    private Integer companyId;

    @ApiModelProperty(value = "用户手机号码")
    private String userMobileNumber;

    @ApiModelProperty(value = "用户状态（0：已锁定  1：启用中）")
    private Integer userStatus;
}