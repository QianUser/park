package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictParkingCityUpdateParams extends CmsBaseParams {

    @NotNull(message = "停车场ID不能为空")
    @ApiModelProperty(value = "停车场ID", required = true)
    private Integer parkingId;

    @ApiModelProperty(value = "停车场名称")
    private String parkingName;

    @ApiModelProperty(value = "城市")
    private Integer cityId;

    @ApiModelProperty(value = "行政区")
    private Integer cantonId;

    @ApiModelProperty(value = "片区")
    private Integer areaId;

    @ApiModelProperty(value = "月租名额")
    private Integer monthlyTicketLimit;

    @ApiModelProperty(value = "收费策略id")
    private Integer pricingStrategyId;

    @ApiModelProperty(value = "包月策略id")
    private Integer monthlyStrategyId;

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

}