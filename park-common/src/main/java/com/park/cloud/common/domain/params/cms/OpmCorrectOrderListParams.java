package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class OpmCorrectOrderListParams  extends  CmsPageHelperParams{

    @ApiModelProperty(value = "泊位编号",allowEmptyValue = true)
    private String berthCode;

    @ApiModelProperty(value = "信息审核状态\n" +
            "0：未审核；\n" +
            "1：通过； 2：未通过",allowEmptyValue = true)
    private Integer auditState;

    @ApiModelProperty(value = "开始申请时间",allowEmptyValue = true)
    private Date startTime;

    @ApiModelProperty(value = "结束申请时间",allowEmptyValue = true)
    private Date endTime;
}
