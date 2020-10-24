package com.park.cloud.common.domain.params.user;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author kris_ni
 * @date 2020/2/6
 */
@Data
@ApiModel
public class ParkRecordParams extends PageHelperParams{

    @ApiModelProperty(value = "停车服务号")
    private String parkUserId;

}
