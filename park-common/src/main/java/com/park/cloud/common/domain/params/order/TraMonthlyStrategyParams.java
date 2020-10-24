package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

/**
 * @author liuhainan
 */
@Data
@ApiModel("包月券策略")
public class TraMonthlyStrategyParams extends CmsBaseParams {

    @ApiModelProperty("主键")
    private Integer monthlyStrategyId;

    @NotBlank(message = "策略名称不能为空")
    @ApiModelProperty("策略名称")
    private String monthlyStrategyName;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("创建时间")
    private Date addTime;

    @ApiModelProperty("创建人")
    private Integer addUser;

    @NotEmpty
    @ApiModelProperty("包月收费策略费率")
    private List<TraMonthlyPricingRateParams> pricingRates;
}
