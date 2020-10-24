package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;


/**
 * @author kris_ni
 * @date 2020/2/21
 */
public class BerthCityVO {

    @ApiModelProperty("主键")
    private Integer berthId;

    @NotBlank(message = "泊位号不能为空！")
    @ApiModelProperty("泊位号")
    private String berthCode;

}
