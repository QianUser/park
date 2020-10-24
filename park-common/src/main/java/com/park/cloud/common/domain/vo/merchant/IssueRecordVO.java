package com.park.cloud.common.domain.vo.merchant;

import com.park.cloud.common.domain.params.merchant.MerchantPageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/05/11 15:46
 */
@Data
@ApiModel
public class IssueRecordVO {

    @ApiModelProperty("添加时间")
    private Date addTime;

    @ApiModelProperty(value = "优惠券类型：0现金优惠券 1折扣优惠券 2时间优惠券 3全免")
    private Integer relationType;

    @ApiModelProperty(value = "优惠券名")
    private String wxjlCpName;

    @ApiModelProperty(value = "发放用户")
    private String mobileNumber;

    @ApiModelProperty(value = "用户优惠券id")
    private Integer ucId;


}
