package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkOperateByMonthDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/5 10:22
 **/
@Data
public class RepParkOperateByMonthDto extends CmsBaseDto {
    @ApiModelProperty("统计时间")
    private String   statisticsDay;
}
