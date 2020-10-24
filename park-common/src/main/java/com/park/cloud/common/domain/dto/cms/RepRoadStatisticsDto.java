package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepRoadStatisticsDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/10 10:56
 **/
@Data
public class RepRoadStatisticsDto extends CmsBaseDto{
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
    @ApiModelProperty("统计结束时间")
    private Integer   sectionId;
}
