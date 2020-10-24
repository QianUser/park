package com.park.cloud.common.domain.po.sys;

import com.park.cloud.common.domain.params.PageHelperParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 签到信息查询参数
 */
@Data
@ApiModel
public class SysPdaUserSignPO extends PageHelperParams {
    @ApiModelProperty(value = "主键，自动增长")
    private Integer id;

    @ApiModelProperty(value = "巡检员id")
    private Integer pdaUserId;

    @ApiModelProperty(value = "班次名称")
    private String pdaScheduleName;

    @ApiModelProperty(value = "签到类型: 1签到 2签出")
    private Byte signType;

    @ApiModelProperty(value = "签到/签出时间")
    private Date signTime;

    @ApiModelProperty(value = "签到结果（1正常签到、2迟到、3正常签出、4早退）")
    private Byte signResult;

    @ApiModelProperty(value = "用户真实姓名")
    private String pdaUserTrueName;

    @ApiModelProperty(value = "中队名称")
    private String teamName;

    @ApiModelProperty(value = "行政区名称")
    private String cantonName;

    @ApiModelProperty(value = "签到图片")
    private String signImg;
}
