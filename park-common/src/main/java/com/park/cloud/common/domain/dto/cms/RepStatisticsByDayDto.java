package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepStatisticsByDayDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/13 15:24
 **/
@Data
public class RepStatisticsByDayDto {
    @ApiModelProperty(value = "统计日期")
    private String statisticsDay;
    @ApiModelProperty(value = "时间")
    private String time;
    @ApiModelProperty(value = "行政区ID")
    private Integer cantonId;
}
