package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 一个月中一天用户数
 */
@Data
@ApiModel
public class MebUserDataDayVO implements Serializable {
    @ApiModelProperty(value = "日期")
    private String date;

    @ApiModelProperty(value = "一天的用户数")
    private Integer count;
}
