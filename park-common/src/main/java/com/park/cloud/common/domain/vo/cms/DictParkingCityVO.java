package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class DictParkingCityVO implements Serializable {

    @ApiModelProperty(value = "停车场ID")
    private Integer parkingId;

    @ApiModelProperty(value = "停车场名称")
    private String parkingName;

    @ApiModelProperty(value = "停车场编号")
    private String parkCode;

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

    @ApiModelProperty(value = "停车场用户名")
    private String parkingUser;

    @ApiModelProperty(value = "停车场密码")
    private String parkingPwd;

    @ApiModelProperty(value = "停车场类型（1：一类2：二类，3：三类）")
    private Integer parkingMold;

    @ApiModelProperty(value = "地址")
    private String seationAddress;

    @ApiModelProperty(value = "总车位数")
    private Integer totalParkingNo;

    @ApiModelProperty(value = "经度")
    private String longitude;

    @ApiModelProperty(value = "纬度")
    private String latitude;

    @ApiModelProperty(value = "停车场业务类型1、公共 2、小区 3、商业 4、机关单位")
    private Integer businessType;

    @ApiModelProperty(value = "停车场备注")
    private String parkingRemark;

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