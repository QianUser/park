package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 用户数
 */
@Data
@ApiModel
public class MebUserDataMonthVO implements Serializable {
    @ApiModelProperty(value = "新增用户")
    private List<MebUserDataDayVO> newUserData;

    @ApiModelProperty(value = "交易用户")
    private List<MebUserDataDayVO> tradeUserData;

    @ApiModelProperty(value = "活跃用户")
    private List<MebUserDataDayVO> activeUserData;

}
