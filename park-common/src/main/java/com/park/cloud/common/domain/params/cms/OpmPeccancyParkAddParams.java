package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * 违停车辆添加实体
 *
 * @author qianxiang
 * @date 2020/10/31
 * @since 1.0.0
 */
@Data
@ApiModel("违停车辆添加实体")
public class OpmPeccancyParkAddParams extends CmsBaseParams {

    @NotBlank(message = "停车厂名称不能为空")
    @ApiModelProperty(value = "停车厂名称", required = true)
    private String parkingName;

    @NotBlank(message = "违停车牌不能为空")
    @ApiModelProperty(value = "违停车牌", required = true)
    private String peccPlateNumber;

    @NotBlank(message = "违停现场照片url不能为空")
    @ApiModelProperty(value = "违停现场照片", required = true)
    private String peccPhotoUrl;

    @Length(max = 50, message = "最多输入50字符")
    @ApiModelProperty(value = "违停描述")
    private String peccDesc;

}
