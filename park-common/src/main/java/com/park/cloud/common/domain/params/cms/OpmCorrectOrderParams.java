package com.park.cloud.common.domain.params.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class OpmCorrectOrderParams extends CmsPageHelperParams{

    @NotNull(message = "主键不能为空")
    @ApiModelProperty(value = "主键",allowEmptyValue = true)
    private Integer correctId;

    @ApiModelProperty(value = "纠错编号（JC+18位自增数）",allowEmptyValue = false)
    private String correctCode;

    @ApiModelProperty(value = "泊位编号",allowEmptyValue = false)
    private String berthCode;

    @ApiModelProperty(value = "停车场编号",allowEmptyValue = false)
    private String areaCode;

    @ApiModelProperty(value = "巡检员id",allowEmptyValue = true)
    private Integer xjId;

    @ApiModelProperty(value = "提交时间",allowEmptyValue = true)
    private Date addTime;

    @ApiModelProperty(value = "提交泊位错误状态\n" +
            "0：无车，实际有车；\n" +
            "1：有车，实际无车；",allowEmptyValue = false)
    private Integer parkStatus;

    @ApiModelProperty(value = "审核后纠正泊位正确状态\n" +
            "0：无车；\n" +
            "1：有车；",allowEmptyValue = false)
    private Integer correctState;

    @ApiModelProperty(value = "审核时间",allowEmptyValue = true)
    private Date auditTime;

    @ApiModelProperty(value = "审核员id",allowEmptyValue = true)
    private Integer auditUserId;

    @ApiModelProperty(value = "信息审核状态\n" +
            "0：未审核；\n" +
            "1：已审核；",allowEmptyValue = true)
    private Integer auditState;

    @ApiModelProperty(value = "下发地磁状态\n" +
            "0：未下发；\n" +
            "1：已下发；",allowEmptyValue = false)
    private Integer downState;

    @ApiModelProperty(value = "地磁结果状态\n" +
            "0：下发失败；\n" +
            "1：下发成功；",allowEmptyValue = true)
    private Integer resultState;

}
