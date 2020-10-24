package com.park.cloud.common.domain.vo.merchant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/05/11 10:32
 */
@Data
@ApiModel
public class IssueListVO {

    @ApiModelProperty(value = "优惠券id")
    private Integer wxjlCpId;

    @ApiModelProperty(value = "优惠券名")
    private String wxjlCpName;

    @ApiModelProperty(value = "优惠券类型：0现金优惠券 1折扣优惠券 2时间优惠券 3全免")
    private Integer relationType;

    @ApiModelProperty(value = "优惠券面额(减免金额、折扣比例、小时数、全免金额)")
    private String couponMoney;

    @ApiModelProperty(value = "适用停车场id集合(0通用)")
    private String parkingIdList;

    @ApiModelProperty(value = "适用路段id集合(0通用)")
    private String sectionIdList;

    @ApiModelProperty(value = "优惠券有限期开始时间")
    private Date startTime;

    @ApiModelProperty(value = "优惠券有限期结束时间")
    private Date endTime;

    @ApiModelProperty(value = "发券使用有效期(天数)")
    private Integer termOfValidity;

    @ApiModelProperty(value = "停车场名称集合")
    private List<String> parkNames;

    @ApiModelProperty(value = "路段名称集合")
    private List<String> sectionNames;

    @ApiModelProperty(value = "商户优惠券id")
    private Integer copId;

    @ApiModelProperty(value = "商户优惠券总张数")
    private Integer pNumber;

    @ApiModelProperty(value = "发放剩余张数")
    private Integer rTension;
}
