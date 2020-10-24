package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 今日泊位占用查询参数
 */
@Data
@ApiModel
public class DictLongParkingSearchParams extends CmsPageHelperParams {
    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "入场时间")
    private List<String> startParkingTime;

    @ApiModelProperty(value = "停车时长")
    private String parkTime;

    @ApiModelProperty(value = "停车场名称")
    private String parkingName;
}
