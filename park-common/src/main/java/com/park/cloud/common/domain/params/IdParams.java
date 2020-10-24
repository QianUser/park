package com.park.cloud.common.domain.params;

import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author liuhainan
 */
@Data
public class IdParams extends CmsBaseParams {

    @NotNull(message = "主键不能为空！")
    private String id;
}
