package com.park.cloud.common.domain.dto.cms;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 今日泊位占用查询参数
 */
@Data
@ApiModel
public class DictLongParkingDto extends PageHelperParams {
    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "入场时间查询开始时间")
    private Date startParkingTime;

    @ApiModelProperty(value = "入场时间")
    private Date endParkingTime;

    @ApiModelProperty(value = "停车时长")
    private Integer parkStartTime;

    @ApiModelProperty(value = "停车时长")
    private Integer parkEndTime;

    @ApiModelProperty(value = "停车场名称")
    private String parkingName;
}
