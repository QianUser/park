package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * CMS平台接口参数基类
 */
@Data
@ApiModel
public class CmsBaseParams implements Serializable{

    @ApiModelProperty(value = "CMS登录用户ID", hidden = true)
    private Integer loginSysUserId;

}
