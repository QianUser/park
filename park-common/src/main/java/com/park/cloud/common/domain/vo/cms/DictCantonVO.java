package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class DictCantonVO implements Serializable {

    @ApiModelProperty(value = "行政区ID")
    private Integer cantonId;

    @ApiModelProperty(value = "行政区名称")
    private String cantonName;

    @ApiModelProperty(value = "行政区编码")
    private String cantonCode;

    @ApiModelProperty(value = "城市ID")
    private Integer cityId;

    @ApiModelProperty(value = "城市名")
    private String cityName;

    @ApiModelProperty(value = "备注")
    private String cantonRemark;

    @ApiModelProperty(value = "经度")
    private String cantonLat;

    @ApiModelProperty(value = "纬度")
    private String cantonLng;

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

    @ApiModelProperty(value = "创建人姓名")
    private String addUserName;

    @ApiModelProperty(value = "片区个数")
    private Integer areaNum;
}