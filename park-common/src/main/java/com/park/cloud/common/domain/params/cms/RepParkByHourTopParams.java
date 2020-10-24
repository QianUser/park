package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkByHourTopParams
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/11 14:06
 **/
@Data
@ApiModel
public class RepParkByHourTopParams extends CmsBaseParams {
    @ApiModelProperty("统计时间")
    private String   statisticsDay;
}
