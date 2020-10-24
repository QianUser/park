package com.park.cloud.common.domain.vo.order;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class CouponPurchaseVO {

    @ExcelIgnore
    @ApiModelProperty(value = "主键")
    private Integer copId;

    @ExcelProperty(value = "优惠券名称",index = 1)
    @ApiModelProperty(value = "优惠券名称")
    private String cpName;

    @ExcelProperty(value = "购买者手机号",index = 0)
    @ApiModelProperty(value = "手机号")
    private String mobileNumber;

    @ExcelIgnore
    @ApiModelProperty(value = "停车服务号")
    private String cmuId;

    @ExcelProperty(value = "购买者类型",index = 2)
    @ApiModelProperty(value = "购买者类型：1用户2商户")
    private Integer buyerType;

    @ExcelProperty(value = "购买张数",index = 3)
    @ApiModelProperty(value = "购买张数")
    private Integer pNumber;

    @ExcelProperty(value = "买入金额",index = 4)
    @ApiModelProperty(value = "买入金额")
    private String buAmount;

    @ExcelProperty(value = "发放剩余张数",index = 5)
    @ApiModelProperty(value = "发放剩余张数")
    private Integer rTension;

    @ExcelProperty(value = "购买渠道",index = 6)
    @ApiModelProperty(value = "购买渠道：1官网 2APP 3公众号 4平台发放")
    private Integer buyingChannel;

    @ExcelProperty(value = "购买时间",index = 7)
    @ApiModelProperty(value = "购买时间")
    private Date addTime;

}
