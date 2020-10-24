package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class DictSectionVO implements Serializable {

    @ApiModelProperty(value = "路段ID")
    private Integer sectionId;

    @ApiModelProperty(value = "路段名")
    private String sectionName;

    @ApiModelProperty(value = "城市ID")
    private Integer cityId;

    @ApiModelProperty(value = "城市名")
    private String cityName;

    @ApiModelProperty(value = "行政区ID")
    private Integer cantonId;

    @ApiModelProperty(value = "行政区名")
    private String cantonName;

    @ApiModelProperty(value = "片区")
    private Integer areaId;

    @ApiModelProperty(value = "片区名")
    private String areaName;

    @ApiModelProperty(value = "月租名额")
    private Integer monthlyTicketLimit;

    @ApiModelProperty(value = "收费策略id")
    private Integer pricingStrategyId;

    @ApiModelProperty(value = "收费策略名")
    private String pricingStrategyName;

    @ApiModelProperty(value = "包月策略id")
    private Integer monthlyStrategyId;

    @ApiModelProperty(value = "包月策略名")
    private String monthlyStrategyName;

    @ApiModelProperty(value = "路段类型（1：一类2：二类，3：三类）")
    private Integer sectionMold;

    @ApiModelProperty(value = "经度")
    private String sectionLongitude;

    @ApiModelProperty(value = "纬度")
    private String sectionLatitude;

    @ApiModelProperty(value = "备注")
    private String sectionRemark;

    @ApiModelProperty(value = "路段朝向：底部方向（东、南、西、北）")
    private String bottomDirection;

    @ApiModelProperty(value = "地址")
    private String seationAddress;

    @ApiModelProperty(value = "泊位形式(1平行式、2垂直式、3斜列式)")
    private Integer berthForm;

    @ApiModelProperty(value = "总泊位数")
    private Integer totalBerthNo;

    @ApiModelProperty(value = "日间名额已用")
    private Integer workNum;

    @ApiModelProperty(value = "夜间名额已用")
    private Integer nonWorkNum;

    @ApiModelProperty(value = "全时段名额已用")
    private Integer allNum;

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

    @ApiModelProperty(value = "创建人姓名")
    private String addUserName;
}