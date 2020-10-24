package com.park.cloud.common.domain.params.cms;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * <h3>park</h3>
 * <p></p>
 *
 * @author : zhangqinxiaowei
 * @date : 2020-09-25 10:45
 **/
@Data
@ApiModel
public class QSCarplatRegistHostelParams extends CmsPageHelperParams{

    @ApiModelProperty(value = "酒店id")
    private Integer hotelId;
    @ApiModelProperty(value = "车牌号")
    private String carNumber;
    @ApiModelProperty(value = "住店时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date inTime;
    @ApiModelProperty(value = "离店时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date outTime;
    @ApiModelProperty(value = "登记用户名")
    private String reigstUserName;
    @ApiModelProperty(value = "登记号码")
    private String registUserPhone;
    @ApiModelProperty(value = "账单金额")
    private Integer totalFee;
    @ApiModelProperty(value = "酒店支付金额")
    private Integer hotelFee;
    @ApiModelProperty(value = "客户自付金额")
    private Integer custormerFee;
    @ApiModelProperty(value = "停车时长")
    private Integer parkTime;
    // 0代表自付，1代表酒店代付
    @ApiModelProperty(value = "支付方式")
    private Integer isHotelPay;
    @ApiModelProperty(value = "停车开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date parkStartTime;
    @ApiModelProperty(value = "停车结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date parkEndTime;
    @ApiModelProperty(value = "支付状态")
    private int payStatus;
    @ApiModelProperty(value = "停车场ID")
    private String parkCode;
    @ApiModelProperty(value = "酒店订单编码")
    private String hotelOrderCode;
    @ApiModelProperty(value = "酒店登记时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    @ApiModelProperty(value = "查询开始时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date payStartTime;
    @ApiModelProperty(value = "查询结束时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date payEndTime;
    @ApiModelProperty(value = "酒店名")
    private String hotelName;
    @ApiModelProperty(value = "停车场")
    private String parkName;

}
