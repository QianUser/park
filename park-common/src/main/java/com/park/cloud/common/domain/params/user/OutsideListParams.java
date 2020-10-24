package com.park.cloud.common.domain.params.user;

import com.park.cloud.common.domain.params.PageHelperParams;
import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class OutsideListParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "停车场编号",required = false)
    private String parkCode;

    @ApiModelProperty(value = "车牌号",required = false)
    private String plateNumber;

    @ApiModelProperty(value = "车辆类型,1:临时车 2: 月租车",required = false)
    private String chargeType;
}
