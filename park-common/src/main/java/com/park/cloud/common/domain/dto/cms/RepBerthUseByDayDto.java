package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepBerthUseByDayDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/2/24 17:28
 **/
@Data
public class RepBerthUseByDayDto extends CmsBaseDto {

    @ApiModelProperty("停车路段")
    private String sectionName;

    @ApiModelProperty("停车方式")
    private Integer bargainOrderCode;
    @ApiModelProperty("泊位号")
    private String berthCode;
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
