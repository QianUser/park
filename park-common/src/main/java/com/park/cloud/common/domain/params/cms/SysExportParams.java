package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 导出记录下载/删除参数
 */
@Data
@ApiModel
public class SysExportParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "单个下载/删除")
    private Integer exportId;

    @ApiModelProperty(value = "批量下载/批量删除")
    private List<Integer> exportIds;
}
