package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 违停车辆删除实体
 *
 * @author qianxiang
 * @date 2020/10/31
 * @since 1.0.0
 */
@Data
@ApiModel("违停车辆删除实体")
public class OpmPeccancyParkDeleteParams extends CmsBaseParams {

    @NotNull(message = "违停ID不能为空")
    @ApiModelProperty(value = "违停ID", required = true)
    private Integer peccParkId;

}
