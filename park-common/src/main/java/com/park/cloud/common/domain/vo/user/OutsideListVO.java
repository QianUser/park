package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class OutsideListVO {

    private Long id;

    @ApiModelProperty(value = "停车场名称")
    private String parkingName;

    @ApiModelProperty(value = "入口名称/区域编号")
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

    @ApiModelProperty("车辆类型,1:临时车 2: 月租车")
    private Integer chargeType;

    @ApiModelProperty("进场图片地址(http地址)")
    private String inImgPath;

    @ApiModelProperty("出场图片地址(http地址)")
    private String outImgPath;

    @ApiModelProperty("当前空车位数目")
    private Integer spaceNo;

    @ApiModelProperty("订单编号")
    private String bargainOrderCode;

    @ApiModelProperty("停车场编号")
    private String parkCode;

    @ApiModelProperty("城市代号")
    private String cityCode;

    @ApiModelProperty("车辆类型：1、大车2、小车3、新能源")
    private Integer carType;

    @ApiModelProperty("进场地感检测是否有车0：无车1：有车")
    private Integer inReactionType;

    @ApiModelProperty("进场闸机是否起闸0：未起1：起闸")
    private Integer inMachineUpType;

    @ApiModelProperty("出场地感检测是否有车0：无车1：有车")
    private Integer outReactionType;

    @ApiModelProperty("出场闸机是否起闸0：未起1：起闸")
    private Integer outMachineUpType;

    @ApiModelProperty("创建时间")
    private Date addTime;

    @ApiModelProperty("创建人")
    private String addUser;

    @ApiModelProperty("调用者ID")
    private String appKey;

    @ApiModelProperty("IP地址")
    private String ipAddress;

    @ApiModelProperty("停车场停车编号（进场时写入）")
    private String parkStopCode;


}
