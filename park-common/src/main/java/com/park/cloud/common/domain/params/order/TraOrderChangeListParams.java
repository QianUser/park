package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class TraOrderChangeListParams extends CmsPageHelperParams {

    @ApiModelProperty("订单编号")
    private String bargainOrderCode;

}
