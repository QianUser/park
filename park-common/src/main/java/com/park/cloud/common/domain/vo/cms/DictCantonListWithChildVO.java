package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel
public class DictCantonListWithChildVO extends DictCantonListVO {

    @ApiModelProperty(value = "片区列表")
    private List<DictAreaListWithChildVO> areaList;

}