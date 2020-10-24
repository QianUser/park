package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkRefundByDayParams
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/6 15:18
 **/
@Data
@ApiModel
public class RepParkRefundByDayParams extends CmsPageHelperParams {
    @ApiModelProperty("停车路段/停车场")
    private String sectionName;
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
