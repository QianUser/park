package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class TraCouponUsageRecordParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "适用停车场id")
    private String parkingId;

    @ApiModelProperty(value = "适用路段id")
    private String sectionId;

    @ApiModelProperty("订单编号")
    private String bargainOrderCode;

}
