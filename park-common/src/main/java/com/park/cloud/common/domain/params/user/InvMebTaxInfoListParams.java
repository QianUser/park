package com.park.cloud.common.domain.params.user;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class InvMebTaxInfoListParams {

    @NotBlank(message = "请输入发票类型")
    private String companyType;

    @NotBlank(message = "用户id不能为空")
    private String userId;
}
