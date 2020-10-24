package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class SysDepartmentVO implements Serializable {
    @ApiModelProperty(value = "部门ID")
    private Integer deptId;

    @ApiModelProperty(value = "公司ID")
    private Integer companyId;

    @ApiModelProperty(value = "公司名")
    private String companyName;

    @ApiModelProperty(value = "部门名称")
    private String deptName;

    @ApiModelProperty(value = "上级部门ID(0表示没有上级部门)")
    private Integer parentDeptId;

    @ApiModelProperty(value = "备注")
    private String deptRemark;

    @ApiModelProperty(value = "状态（0：已锁定  1：启用中）")
    private Integer deptStatus;

    @ApiModelProperty(value = "创建时间")
    private Date addTime;

    @ApiModelProperty(value = "创建人姓名")
    private String addUserName;
}