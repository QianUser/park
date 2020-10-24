package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 本月和上月停车金额
 */
@Data
@ApiModel
public class ParkingAmountMonthVO implements Serializable {
    @ApiModelProperty(value = "本月停车金额，按日期升序")
    private List<ParkingAmountDayVO> thisMonthAmount;

    @ApiModelProperty(value = "上月停车金额，按日期升序")
    private List<ParkingAmountDayVO> lastMonthAmount;
}
