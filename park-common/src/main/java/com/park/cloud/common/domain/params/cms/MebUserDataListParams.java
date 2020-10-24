package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户报表查询参数
 */
@Data
@ApiModel
public class MebUserDataListParams extends CmsPageHelperParams {
    @ApiModelProperty(value = "月份，yyyy-MM")
    private String month;

}
