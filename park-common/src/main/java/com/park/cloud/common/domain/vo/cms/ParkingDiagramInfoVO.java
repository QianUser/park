package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 停车热力图
 */
@Data
@ApiModel
public class ParkingDiagramInfoVO implements Serializable {
    @ApiModelProperty("停车场数据")
    private List<ParkingDiagramVO> parkingList;

    @ApiModelProperty("管辖区经度")
    private String lat;

    @ApiModelProperty("管辖区纬度")
    private String lng;

}
