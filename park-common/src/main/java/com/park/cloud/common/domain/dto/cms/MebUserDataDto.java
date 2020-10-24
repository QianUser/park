package com.park.cloud.common.domain.dto.cms;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Date;

/**
 * 用户数查询参数
 */
@Data
@ApiModel
public class MebUserDataDto extends PageHelperParams {
    private Date month;
}
