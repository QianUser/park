package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.po.tra.TraPricingRatePO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @author liuhainan
 */
@Data
@ApiModel("收费策略实体类")
public class TraPricingStrategyParams extends CmsBaseParams {


    @ApiModelProperty(value = "主键")
    private Integer pricingStrategyId;

    @NotBlank(message = "策略名称不能为空！")
    @ApiModelProperty(value = "策略名称")
    private String pricingStrategyName;

    @NotNull(message = "免费时长不能为空")
    @ApiModelProperty(value = "免费时长(分钟)")
    private Integer freeDuration;

    @ApiModelProperty(value = "备注")
    private String pricingStrategyRemark;

    @ApiModelProperty(value = "工作日免费开始时间(HH:mm)")
    private String freeStartTime;

    @ApiModelProperty(value = "工作日免费结束时间(HH:mm)小于开始时间为次日")
    private String freeEndTime;

    @ApiModelProperty(value = "非工作日免费开始时间(HH:mm)")
    private String holidayFreeStartTime;

    @ApiModelProperty(value = "非工作日免费结束时间(HH:mm) 小于开始时间为次日")
    private String holidayFreeEndTime;

    @ApiModelProperty(value = "上限数额：0不设置上限；大于0有上限")
    private Integer upperLimit;

    @ApiModelProperty(value = "1：限制时间（分钟）；2限制金额（分）")
    private Integer limitType;

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

    @ApiModelProperty(value = "创建人")
    private Integer addUser;

    @ApiModelProperty(value = "收费策略费率")
    private List<TraPricingRatePO> pricingRates;
}
