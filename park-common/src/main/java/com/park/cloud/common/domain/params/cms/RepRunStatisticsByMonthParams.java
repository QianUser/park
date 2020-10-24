package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepRunStatisticsByMonthParams
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/10 16:09
 **/
@Data
@ApiModel
public class RepRunStatisticsByMonthParams  extends CmsPageHelperParams{
    @ApiModelProperty("停车场/路段名称")
    private String   sectionName;
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
