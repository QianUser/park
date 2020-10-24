package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkCountRefundParams
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/6 15:55
 **/
@Data
@ApiModel
public class RepParkCountRefundParams extends CmsBaseParams {
    @ApiModelProperty("停车路段/停车场")
    private String sectionName;
    @ApiModelProperty("停车场类型(0是场外,1是场内,2是全部)")
    private Integer parkingType;
    @ApiModelProperty("统计开始时间")
    private String   statisticsStartDay;
    @ApiModelProperty("统计结束时间")
    private String   statisticsEndDay;
}
