package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepRoadStatisticsParams
 * @Description 路内运营报表入参
 * @Author liangshuang
 * @Date 2020/3/10 10:50
 **/

@Data
@ApiModel
public class RepRoadStatisticsParams extends CmsBaseParams {
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
