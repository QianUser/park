package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkRefundByDayDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/6 15:21
 **/
@Data
public class RepParkRefundByDayDto extends CmsBaseDto{
    @ApiModelProperty("停车路段/停车场")
    private String sectionName;
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
