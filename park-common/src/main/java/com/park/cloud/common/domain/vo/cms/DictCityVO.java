package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class DictCityVO implements Serializable {

    @ApiModelProperty(value = "城市ID")
    private Integer cityId;

    @ApiModelProperty(value = "城市名称")
    private String cityName;

    @ApiModelProperty(value = "省份名称")
    private String provinceName;

    @ApiModelProperty(value = "省份编码")
    private String numberCode;

    @ApiModelProperty(value = "城市编码")
    private String cityCode;

    @ApiModelProperty(value = "备注")
    private String cityRemark;

    @ApiModelProperty(value = "经度")
    private String cityLat;

    @ApiModelProperty(value = "纬度")
    private String cityLng;

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

    @ApiModelProperty(value = "创建人姓名")
    private String addUserName;

    @ApiModelProperty(value = "行政区个数")
    private Integer cantonNum;
}