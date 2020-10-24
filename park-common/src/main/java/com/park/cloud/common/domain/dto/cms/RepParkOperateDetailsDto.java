package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameRepParkOperateDetailsDto
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/5 13:45
 **/
@Data
public class RepParkOperateDetailsDto  extends CmsBaseDto{
    @ApiModelProperty("停车场id")
    private String   parkingId;
    @ApiModelProperty("停车场类型(0为路外停车场,1为路内(路段))")
    private Integer   parkingType;
    @ApiModelProperty("统计时间")
    private String   statisticsDay;
}
