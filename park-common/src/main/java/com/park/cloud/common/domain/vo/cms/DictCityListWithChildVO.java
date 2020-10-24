package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel
public class DictCityListWithChildVO extends DictCityListVO {

    @ApiModelProperty(value = "行政区列表")
    private List<DictCantonListWithChildVO> cantonList;
}