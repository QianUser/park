package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class TraUserCouponAddParams  extends CmsBaseParams {

    @ApiModelProperty(value = "优惠券编号(c+时间戳)",allowEmptyValue = true)
    private String uCouponCode;

    @ApiModelProperty(value = "购买记录表Id",allowEmptyValue = true)
    private Integer copId;

    @NotNull(message = "优惠券策略表ID不能为空")
    @ApiModelProperty(value = "关联优惠券策略表ID",allowEmptyValue = false)
    private Integer wxjlCpId;

    @NotBlank(message = "停车号不能为空")
    @ApiModelProperty(value = "用户ID",allowEmptyValue = false)
    private String parkUserId;

    @ApiModelProperty(value = "剩余次数\n" +
            "【使用时回填订单编号，新增一条优惠券使用记录，剩余次数-1，包月包年默认0】",allowEmptyValue = true)
    private Integer tsurplusNum;

    @ApiModelProperty(value = "车牌号",allowEmptyValue = true)
    private String plateNumber;

    @ApiModelProperty(value = "车牌类型（1蓝牌、2绿牌、3黄牌、4其他）",allowEmptyValue = true)
    private Integer plateType;

    @ApiModelProperty(value = "优惠券来源类型\n" +
            "0平台\n" +
            "1用户\n" +
            "2商户",allowEmptyValue = true)
    private Integer couponType;

    @ApiModelProperty(value = "商户编号/用户停车服务号(平台来源默认为0)",allowEmptyValue = false)
    private String cmUid;

    @ApiModelProperty(value = "推送状态\n" +
            "0已推送\n" +
            "1未推送\n" +
            "2推送失败",allowEmptyValue = true)
    private Integer pushStatus;

    @ApiModelProperty(value = "生效时间",allowEmptyValue = false)
    private Date effTime;

    @ApiModelProperty(value = "失效时间（注意包月和包年按自然月和自然年算）",allowEmptyValue = false)
    private Date failureTime;

    @ApiModelProperty(value = "停车场下发状态\n" +
            "0未下发\n" +
            "1失败\n" +
            "2成功\n" +
            "3异常",allowEmptyValue = true)
    private Integer uparkingDownState;

    @ApiModelProperty(value = "使用状态\n" +
            "0生效\n" +
            "1失效\n" +
            "2已使用",allowEmptyValue = true)
    private Integer usageState;

    @ApiModelProperty(value = "备注",allowEmptyValue = true)
    private String remark;

    @ApiModelProperty(value = "添加时间",allowEmptyValue = true)
    private Date addTime;

}
