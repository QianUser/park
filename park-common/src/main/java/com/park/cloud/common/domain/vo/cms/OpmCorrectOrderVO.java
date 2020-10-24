package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author liuhainan
 */
@Data
@ApiModel
public class OpmCorrectOrderVO {

    @ApiModelProperty(value = "主键" )
    private Integer correctId;

    @ApiModelProperty(value = "纠错编号（JC+18位自增数）"  )
    private String correctCode;

    @ApiModelProperty(value = "泊位编号"  )
    private String berthCode;

    @ApiModelProperty(value = "停车场编号"  )
    private String areaCode;

    @ApiModelProperty(value = "巡检员id" )
    private Integer xjId;

    @ApiModelProperty(value = "提交时间" )
    private Date addTime;

    @ApiModelProperty(value = "提交泊位错误状态\n" +
            "0：无车，实际有车；\n" +
            "1：有车，实际无车；"  )
    private Integer parkStatus;

    @ApiModelProperty(value = "审核后纠正泊位正确状态\n" +
            "0：无车；\n" +
            "1：有车；"  )
    private Integer correctState;

    @ApiModelProperty(value = "审核时间" )
    private Date auditTime;

    @ApiModelProperty(value = "审核员id" )
    private Integer auditUserId;

    @ApiModelProperty(value = "信息审核状态\n" +
            "0：未审核；\n" +
            "1：已审核；" )
    private Integer auditState;

    @ApiModelProperty(value = "下发地磁状态\n" +
            "0：未下发；\n" +
            "1：已下发；"  )
    private Integer downState;

    @ApiModelProperty(value = "地磁结果状态\n" +
            "0：下发失败；\n" +
            "1：下发成功；" )
    private Integer resultState;

    @ApiModelProperty(value = "巡检员名称")
    private String xjName;
    
    @ApiModelProperty(value = "审核员名称")
    private String auditUserName;

    @ApiModelProperty(value = "审核状态")
    private String state;

    @ApiModelProperty(value = "图片地址")
    private String imgPath;
}
