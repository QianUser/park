package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkOperateByMonthParams
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/5 10:17
 **/
@Data
@ApiModel
public class RepParkOperateByMonthCountParams extends CmsBaseParams{
    @ApiModelProperty("统计时间")
    private String   statisticsDay;
}
