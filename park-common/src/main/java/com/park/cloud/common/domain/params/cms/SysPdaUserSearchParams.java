package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 巡检员管理查询参数
 */
@Data
@ApiModel
public class SysPdaUserSearchParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "巡检员名称")
    private String pdaUserName;

    @ApiModelProperty(value = "手机号码")
    private String pdaUserMobileNumber;

    @ApiModelProperty(value = "用户正式姓名")
    private String pdaUserTrueName;

    @ApiModelProperty(value = "用户所属中队id")
    private Integer pdaUserTeamId;
}
