package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepPdaUserPeccancyParams
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/2/25 15:42
 **/
@Data
@ApiModel
public class RepPdaUserPeccancyParams  extends CmsPageHelperParams {
    @ApiModelProperty("巡检员名称")
    private String   pdaUserName;
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
