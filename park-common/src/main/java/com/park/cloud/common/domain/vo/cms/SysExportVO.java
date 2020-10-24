package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 导出记录
 */
@Data
@ApiModel
public class SysExportVO implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Integer exportId;

    @ApiModelProperty(value = "导出内容")
    private String exportContent;

    @ApiModelProperty(value = "导出状态")
    private BigDecimal exportProgress;

    @ApiModelProperty(value = "导出时间")
    private Date addTime;

}
