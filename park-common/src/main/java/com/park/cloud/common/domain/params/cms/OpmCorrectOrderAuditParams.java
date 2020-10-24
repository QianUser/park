package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author liuhainan
 */
@Data
public class OpmCorrectOrderAuditParams  extends CmsBaseParams{

    @NotNull(message = "主键不能为空")
    @ApiModelProperty(value = "主键",allowEmptyValue = true)
    private Integer correctId;

    @NotNull(message = "审核后纠正泊位正确状态不能为空")
    @ApiModelProperty(value = "0：未通过，1通过",allowEmptyValue = false)
    private Integer correctState;
}
