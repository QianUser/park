package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel
public class DictAreaListWithChildVO extends DictAreaListVO {

    @ApiModelProperty(value = "停车场列表")
    private List<DictParkingCityListVO> parkingList;

    @ApiModelProperty(value = "路段列表")
    private List<DictSectionListVO> sectionList;

}