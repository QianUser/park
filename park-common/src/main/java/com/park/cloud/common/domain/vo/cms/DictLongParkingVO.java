package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 今日泊位占用
 */
@Data
@ApiModel
public class DictLongParkingVO implements Serializable {
    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "入场时间")
    private Date startParkingTime;

    @ApiModelProperty(value = "停车时长")
    private BigDecimal parkTime;

    @ApiModelProperty(value = "停车场名称")
    private String parkingName;

    @ApiModelProperty(value = "停车场类型")
    private Integer parkingType;

    @ApiModelProperty(value = "泊位号")
    private String berthCode;

    @ApiModelProperty(value = "车牌类型")
    private Integer plateType;
}
