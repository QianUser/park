package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class DictSectionAddParams extends CmsBaseParams {

    @NotEmpty(message = "路段名不能为空")
    @ApiModelProperty(value = "路段名", required = true)
    private String sectionName;

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

    @NotNull(message = "路段类型不能为空")
    @ApiModelProperty(value = "路段类型（1：一类2：二类，3：三类）", required = true)
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

}