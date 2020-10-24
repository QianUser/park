package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author kris_ni
 * @date 2020/2/6
 */
@Data
@ApiModel
public class ImportRecordVO {

    @ApiModelProperty(value = "停车场名称")
    private String parkingName;

    @ApiModelProperty(value = "入口名称")
    private String entranceName;

    @ApiModelProperty(value = "进场时间")
    private Date entranceTime;

    @ApiModelProperty(value = "出场状态，0未出场；1出场")
    private Integer exitStatus;

    @ApiModelProperty(value = "出口名称")
    private String exitName;

    @ApiModelProperty(value = "出场时间")
    private Date exitTime;

    @ApiModelProperty(value = "车牌号")
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;
}
