package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @ClassNameRepPerkOperateDetailsParams
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/5 13:39
 **/
@Data
@ApiModel
public class RepPerkOperateDetailsParams extends CmsPageHelperParams {
    @ApiModelProperty("停车场id")
    private String   parkingId;
    @ApiModelProperty("停车场类型(0为路外停车场,1为路内(路段))")
    private Integer   parkingType;
    @ApiModelProperty("统计时间")
    private String   statisticsDay;
}
