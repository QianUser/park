package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameparkClearingDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/6 13:41
 **/
@Data
public class parkClearingDto extends CmsBaseDto {
    @ApiModelProperty("停车场名称")
    private String parkingName;
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
