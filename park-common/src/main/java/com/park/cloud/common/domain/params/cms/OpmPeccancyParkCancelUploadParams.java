package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 违停车辆添加实体
 *
 * @author qianxiang
 * @date 2020/12/2
 * @since 1.0.0
 */
@Data
@ApiModel("违停现场照片删除实体")
public class OpmPeccancyParkCancelUploadParams extends CmsBaseParams {

    @ApiModelProperty(value = "违停现场照片url")
    private String peccPhotoUrl;

}
