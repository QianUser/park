package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuhainan
 */
@Data
public class GetUserListParams extends CmsPageHelperParams {

    @ApiModelProperty("用户手机号")
    private String mobileNumber;

    @ApiModelProperty("优惠券id")
    private Integer wxjlCpId;
}
