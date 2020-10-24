package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class DictAreaVO implements Serializable {

    @ApiModelProperty(value = "片区ID")
    private Integer areaId;

    @ApiModelProperty(value = "片区编号")
    private String areaCode;

    @ApiModelProperty(value = "片区名称")
    private String areaName;

    @ApiModelProperty(value = "行政区ID")
    private Integer cantonId;

    @ApiModelProperty(value = "行政区名称")
    private String cantonName;

    @ApiModelProperty(value = "城市ID")
    private Integer cityId;

    @ApiModelProperty(value = "备注")
    private String areaRemark;

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

    @ApiModelProperty(value = "创建人姓名")
    private String addUserName;

    @ApiModelProperty(value = "路段个数")
    private Integer sectionNum;

    @ApiModelProperty(value = "停车场个数")
    private Integer parkingNum;
}