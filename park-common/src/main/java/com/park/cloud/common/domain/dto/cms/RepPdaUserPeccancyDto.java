package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepPdaUserPeccancyDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/2/25 16:18
 **/
@Data
public class RepPdaUserPeccancyDto extends CmsBaseDto  {
    @ApiModelProperty("巡检员名称")
    private String   pdaUserName;
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
