package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class SysCompanyAddParams extends CmsBaseParams {

    @NotEmpty(message = "公司名称不能为空")
    @ApiModelProperty(value = "公司名称", required = true)
    private String companyName;

    @NotEmpty(message = "企业标准编号不能为空")
    @ApiModelProperty(value = "企业标准编号", required = true)
    private String companyCode;

    @NotNull(message = "公司性质不能为空")
    @ApiModelProperty(value = "公司性质（1事业单位、2企业）", required = true)
    private Integer companyType;

    @NotEmpty(message = "地址不能为空")
    @ApiModelProperty(value = "地址", required = true)
    private String companyAddress;

    @NotEmpty(message = "电话不能为空")
    @ApiModelProperty(value = "电话", required = true)
    private String companyTel;

    @ApiModelProperty(value = "传真")
    private String companyFax;

    @NotEmpty(message = "电子邮件不能为空")
    @ApiModelProperty(value = "电子邮件", required = true)
    private String companyEmail;

    @NotEmpty(message = "负责人不能为空")
    @ApiModelProperty(value = "负责人", required = true)
    private String companyHead;

    @ApiModelProperty(value = "官网")
    private String companyWebsite;

    @ApiModelProperty(value = "经度")
    private String companyLat;

    @ApiModelProperty(value = "纬度")
    private String companyLng;

}