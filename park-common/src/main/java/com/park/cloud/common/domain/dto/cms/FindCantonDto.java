package com.park.cloud.common.domain.dto.cms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassNameFIND
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/11 15:44
 **/
@Data
public class FindCantonDto extends CmsBaseDto{
    @ApiModelProperty(value = "CMS登录用户ID", hidden = true)
    private Integer loginSysUserId;
}
