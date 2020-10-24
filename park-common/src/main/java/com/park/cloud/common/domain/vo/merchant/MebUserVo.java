package com.park.cloud.common.domain.vo.merchant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/05/12 11:48
 */
@Data
@ApiModel
public class MebUserVo {

    @ApiModelProperty("主键")
    private Integer mebUserId;

    @ApiModelProperty("停车服务号")
    private String parkUserId;

    @ApiModelProperty("注册途径（1表示app，2官网, 3公众号）")
    private Integer userType;

    @ApiModelProperty("用户手机号码")
    private String mobileNumber;

    @ApiModelProperty("手机编号")
    private String mobileCode;

    @ApiModelProperty("用户昵称")
    private String userNickname;

    @ApiModelProperty("用户openid")
    private String userOpenId;

    @ApiModelProperty("用户登陆密码，进行md5加密")
    private String loginPwd;

    @ApiModelProperty("用户交易支付密码，进行md5加密")
    private String payPwd;

    @ApiModelProperty("车牌号（废弃，从绑定车牌中查询）")
    private String plateNumber;

    @ApiModelProperty("用户真实姓名")
    private String userTrueName;

    @ApiModelProperty("用户身份证号码")
    private String userIdcardNumber;

    @ApiModelProperty("1男,0女")
    private Integer userSex;

    @ApiModelProperty("创建时间")
    private Date addTime;

    @ApiModelProperty("用户状态（\\n已锁定 = 0,\\n启用中 = 1,\\n注销申请处理中 = 2,\\n已注销 = 3）")
    private Integer userStatus;

    @ApiModelProperty("银行卡类型  \\r\\n01 建行\\r\\n02工行\\r\\n03中行\\r\\n04农行\\r\\n05 交行")
    private String bankType;

    @ApiModelProperty("银行卡卡号")
    private String bankCard;

    @ApiModelProperty("预留银行手机号")
    private String bankPhone;

    @ApiModelProperty("账户状态")
    private String acctStatus;

    @ApiModelProperty("注销时间")
    private Date cancelTime;

    @ApiModelProperty("备注")
    private String memo;

    @ApiModelProperty("1,正常2，黑名单 3，白名单")
    private Integer isSpecial;


}

