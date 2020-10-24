package com.park.cloud.common.domain.dto.cms;

import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * 导出记录查询参数
 */
@Data
@ApiModel
public class SysExportDto extends CmsPageHelperParams {

    /**
     * 单个下载/删除
     */
    private Integer exportId;

    /**
     * 批量下载/批量删除
     */
    private List<Integer> exportIds;
}
