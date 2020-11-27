package com.park.cloud.common.domain.vo.cms;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * 违停车辆记录
 *
 * @author qianxiang
 * @date 2020/10/31
 * @since 1.0.0
 */
@Data
@ApiModel("违停车辆记录")
@ResponseBody
public class OpmPeccancyParkVO {

    @ApiModelProperty(value = "主键")
    private Integer peccParkId;

    @ApiModelProperty(value = "停车场名称")
    private String parkingName;

    @ApiModelProperty(value = "违停车牌")
    private String peccPlateNumber;

    @ApiModelProperty(value = "违停时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date peccDate;

    @ApiModelProperty(value = "违停现场照片")
    private String peccPhotoUrl;

    @ApiModelProperty(value = "违停描述")
    private String peccDesc;

}
