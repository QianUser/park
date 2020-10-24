package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepRunStatisicsByMonthDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/10 16:13
 **/
@Data
public class RepRunStatisicsByMonthDto extends CmsBaseDto {
    @ApiModelProperty("停车场/路段名称")
    private String   sectionName;
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
