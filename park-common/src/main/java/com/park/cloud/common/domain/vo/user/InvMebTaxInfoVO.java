package com.park.cloud.common.domain.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @author liuhainan
 */
@Data
@ApiModel("用户抬头信息管理")
public class InvMebTaxInfoVO {

    @ApiModelProperty("主键")
    private Integer mebTaxId;

    @ApiModelProperty("关联会员信息表ID")
    private String parkUserId;

    @ApiModelProperty("企业类型 01：企业 02：机关事业单位 03：个人 04：其他")
    private String companyType;

    @ApiModelProperty("公司名称")
    private String companyName;

    @ApiModelProperty("抬头  当类型01时必填")
    private String taxPayerNumber;

    @ApiModelProperty("电话")
    private String mobileNumber;

    @ApiModelProperty("地址")
    private String address;

    @ApiModelProperty("开户账号")
    private String bankAccount;

    @ApiModelProperty("开户银行")
    private String bankName;

    @ApiModelProperty("memo")
    private String memo;

}
