package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameParkClearingCountParams
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/6 10:14
 **/
@Data
@ApiModel
public class ParkClearingCountParams extends CmsPageHelperParams {
    @ApiModelProperty("停车场名称")
    private String parkingName;
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
