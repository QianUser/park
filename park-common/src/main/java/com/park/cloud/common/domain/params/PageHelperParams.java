package com.park.cloud.common.domain.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * PageHelper分页搜索参数
 * @author liyj1
 */
@Data
@ApiModel
public class PageHelperParams implements Serializable{

    @ApiModelProperty(value = "页码，当前页（导出时忽略）")
    private int pageNum;

    @ApiModelProperty(value = "每页条数（导出时忽略）")
    private int pageSize;
}
