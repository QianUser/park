package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * CMS接口PageHelper分页搜索参数
 *
 * @author liyj1
 */
@Data
@ApiModel
public class CmsPageHelperParams extends CmsBaseParams {

    @ApiModelProperty(value = "页码，当前页（导出时忽略）")
    private int pageNum;

    @ApiModelProperty(value = "每页条数（导出时忽略）")
    private int pageSize;
}
