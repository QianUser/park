package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel
public class DictParkingCityAddParams extends CmsBaseParams {

    @NotEmpty(message = "停车场名称不能为空")
    @ApiModelProperty(value = "停车场名称", required = true)
    private String parkingName;

    @NotNull(message = "城市不能为空")
    @ApiModelProperty(value = "城市", required = true)
    private Integer cityId;

    @NotNull(message = "行政区不能为空")
    @ApiModelProperty(value = "行政区", required = true)
    private Integer cantonId;

    @NotNull(message = "片区不能为空")
    @ApiModelProperty(value = "片区", required = true)
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

    @NotNull(message = "停车场类型不能为空")
    @ApiModelProperty(value = "路段类型（1：一类2：二类，3：三类）", required = true)
    private Integer parkingMold;

    @ApiModelProperty(value = "地址")
    private String seationAddress;

    @NotNull(message = "总车位数不能为空")
    @ApiModelProperty(value = "总车位数")
    private Integer totalParkingNo;

    @ApiModelProperty(value = "经度")
    private String longitude;

    @ApiModelProperty(value = "纬度")
    private String latitude;

    @NotNull(message = "业务类型不能为空")
    @ApiModelProperty(value = "停车场业务类型1、公共 2、小区 3、商业 4、机关单位", required = true)
    private Integer businessType;

    @ApiModelProperty(value = "停车场备注")
    private String parkingRemark;

}