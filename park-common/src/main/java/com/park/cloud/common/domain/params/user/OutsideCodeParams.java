package com.park.cloud.common.domain.params.user;

import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/03/16 16:35
 */
@Data
@ApiModel
public class OutsideCodeParams extends CmsBaseParams {

    @NotBlank(message = "订单编号不能为空！")
    @ApiModelProperty(value = "订单编号",allowEmptyValue = false)
    private String bargainOrderCode;
}
