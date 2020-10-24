package com.park.cloud.common.domain.params.cms;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


/**
 * <h3>park</h3>
 * <p></p>
 *
 * @author : zhangqinxiaowei
 * @date : 2020-09-07 14:57
 **/
@Data
@ApiModel
public class QSMonthCardParams extends CmsPageHelperParams {

    @ApiModelProperty(value = "停车场id")
    private String parkId;
    @ApiModelProperty(value = "停车场名称")
    private String parkCode;
    @ApiModelProperty(value = "车牌")
    private String plateNumber;
    @ApiModelProperty(value = "月卡状态")
    private Integer status;
    @ApiModelProperty(value = "用户名")
    private String nickname;
    @ApiModelProperty(value = "用户手机号码")
    private String mobileNumber;
    @ApiModelProperty(value = "月卡类型")
    private Integer cardType;
    @ApiModelProperty(value = "月卡支付开始时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date payStartTime;
    @ApiModelProperty(value = "月卡支付结束时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date payEndTime;

}
