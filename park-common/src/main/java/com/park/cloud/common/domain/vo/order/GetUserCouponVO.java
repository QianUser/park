package com.park.cloud.common.domain.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel("获取用户优惠券")
public class GetUserCouponVO {

    @ApiModelProperty("主键")
    private Integer ucId;

    @ApiModelProperty(value = "优惠券名称")
    private String cpName;

    @ApiModelProperty("用户手机号")
    private String mobileNumber;

    @ApiModelProperty("优惠券编号")
    private String ucouponCode;

    @ApiModelProperty(value = "生效时间")
    private Date effTime;

    @ApiModelProperty(value = "失效时间")
    private Date failureTime;

    @ApiModelProperty(value = "优惠类型：0现金优惠券 1折扣优惠券 2时间优惠券 3全免")
    private Integer relationType;

    @ApiModelProperty(value = "适用停车场id集合")
    private String parkingIdList;

    @ApiModelProperty(value = "适用路段id集合(0通用)")
    private String sectionIdList;

    @ApiModelProperty(value = "使用状态")
    private Integer usageState;
}
