package com.park.cloud.common.domain.dto.cms;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.Date;

/**
 * @author qianxiang
 * @date 2020/11/12
 * @since 1.0.0
 */
@Data
@ApiModel
public class OpmPeccancyParkDto extends CmsBaseDto {

    @ApiModelProperty(value = "违停ID")
    private Integer peccParkId;

    @ApiModelProperty(value = "停车厂名称")
    private String parkingName;

    @ApiModelProperty(value = "违停车牌")
    private String peccPlateNumber;

    @ApiModelProperty(value = "开始时间")
    private Date startDate;

    @ApiModelProperty(value = "结束时间")
    private Date endDate;

}
