package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepFindEarningsCase
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/14 14:38
 **/
@Data
@ApiModel
public class RepFindEarningsCaseParams extends CmsBaseParams {
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
