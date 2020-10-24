package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameReoFindEarningS
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/14 14:45
 **/
@Data
public class ReoFindEarningsCaseDto extends CmsBaseDto {
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
