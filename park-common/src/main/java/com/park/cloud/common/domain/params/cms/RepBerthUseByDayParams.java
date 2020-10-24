package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepBerthUseByDayParams
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/2/24 14:33
 **/
@Data
@ApiModel
public class RepBerthUseByDayParams   extends CmsPageHelperParams {


    @ApiModelProperty("停车路段")
    private String sectionName;

    @ApiModelProperty("停车方式")
    private String bargainOrderCode;
    @ApiModelProperty("泊位号")
    private String berthCode;
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
