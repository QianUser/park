package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassNameFindSectionAndParkVO
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/11 17:44
 **/
@Data
@ApiModel
public class FindSectionAndParkVO {
    @ApiModelProperty(value = "(停车)路段类型")
    private Integer  parkingType;

    @ApiModelProperty(value = "(停车场)路段名")
    private String parkingSectionName;
    @ApiModelProperty(value = "(停车场)路段数据")
    private Integer parkingSectionId;
}
