package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkByHourTopDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/11 14:12
 **/
@Data
public class RepParkByHourTopDto extends CmsBaseDto {
    @ApiModelProperty("统计时间")
    private String   statisticsDay;
}
