package com.park.cloud.common.domain.po.sys;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 导出记录
 */
@Data
@ApiModel
public class SysExportPO {
    @ApiModelProperty(value = "主键，自动增长")
    private Integer exportId;

    @ApiModelProperty(value = "导出文件名称")
    private String exportContent;

    @ApiModelProperty(value = "导出进度")
    private BigDecimal exportProgress;

    @ApiModelProperty(value = "导出服务")
    private String exportService;

    @ApiModelProperty(value = "文件下载链接")
    private String fileUrl;

    @ApiModelProperty(value = "导出时间")
    private Date addTime;

    @ApiModelProperty(value = "导出人员")
    private Integer addUser;
}
