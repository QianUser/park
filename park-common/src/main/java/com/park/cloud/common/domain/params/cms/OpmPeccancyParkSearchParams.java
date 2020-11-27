package com.park.cloud.common.domain.params.cms;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 违停车辆搜索实体
 *
 * @author qianxiang
 * @date 2020/10/31
 * @since 1.0.0
 */
@Data
@ApiModel("违停车辆搜索实体")
public class OpmPeccancyParkSearchParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "停车厂名称")
    private String parkingName;

    @ApiModelProperty(value = "违停车牌")
    private String peccPlateNumber;

    @ApiModelProperty(value = "开始时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startDate;

    @ApiModelProperty(value = "结束时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endDate;

}
