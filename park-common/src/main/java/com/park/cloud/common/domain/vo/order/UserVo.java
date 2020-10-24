package com.park.cloud.common.domain.vo.order;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuhainan
 */
@Data
public class UserVo {

    @ApiModelProperty("用户id")
    private Integer mebUserId;

    @ApiModelProperty("停车号")
    private String parkUserId;

    @ApiModelProperty("手机号")
    private String  mobileNumber;

    @ApiModelProperty("车牌号")
    private String plateNumber;

    @ApiModelProperty("车牌类型（1蓝牌、2绿牌、3黄牌、4其他）")
    private Integer plateType;

    @ApiModelProperty("优惠券数量")
    private Integer couponNum;
}
