package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class SysCompanyVO implements Serializable {

    @ApiModelProperty(value = "公司ID")
    private Integer companyId;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "企业标准编号")
    private String companyCode;

    @ApiModelProperty(value = "公司性质（1事业单位、2企业）")
    private Integer companyType;

    @ApiModelProperty(value = "地址")
    private String companyAddress;

    @ApiModelProperty(value = "电话")
    private String companyTel;

    @ApiModelProperty(value = "传真")
    private String companyFax;

    @ApiModelProperty(value = "电子邮件")
    private String companyEmail;

    @ApiModelProperty(value = "负责人")
    private String companyHead;

    @ApiModelProperty(value = "官网")
    private String companyWebsite;

    @ApiModelProperty(value = "经度")
    private String companyLat;

    @ApiModelProperty(value = "纬度")
    private String companyLng;

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

    @ApiModelProperty(value = "创建人姓名")
    private String addUserName;

}