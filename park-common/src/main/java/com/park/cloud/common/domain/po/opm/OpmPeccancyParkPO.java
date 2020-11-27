package com.park.cloud.common.domain.po.opm;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * 违停车辆表
 *
 * @author qianxiang
 * @date 2020/10/31
 * @since 1.0.0
 */
@Data
@ApiModel("违停车辆表")
public class OpmPeccancyParkPO {

    @ApiModelProperty(value = "主键")
    private Integer peccParkId;

    @ApiModelProperty(value = "停车场名称")
    private String parkingName;

    @ApiModelProperty(value = "违停车牌")
    private String peccPlateNumber;

    @ApiModelProperty(value = "违停时间")
    private Date peccDate;

    @ApiModelProperty(value = "违停现场照片")
    private String peccPhotoUrl;

    @ApiModelProperty(value = "违停描述")
    private String peccDesc;

}