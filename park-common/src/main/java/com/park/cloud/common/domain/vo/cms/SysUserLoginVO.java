package com.park.cloud.common.domain.vo.cms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 用户登录返回
 */
@Data
@ApiModel
public class SysUserLoginVO implements Serializable {

    @ApiModelProperty(value = "用户登录态token")
    private String userToken;

    @ApiModelProperty(value = "用户ID")
    private Integer userId;

    @ApiModelProperty(value = "登录账号")
    private String userName;

    @ApiModelProperty(value = "真实姓名")
    private String userTrueName;

    @ApiModelProperty(value = "性别 1男,0女")
    private Integer userSex;

    @ApiModelProperty(value = "手机号码")
    private String userMobileNumber;

    @ApiModelProperty(value = "电子邮箱")
    private String userEmail;

    @ApiModelProperty(value = "用户头像(不返回使用默认头像)")
    private String headImg;

    @ApiModelProperty(value = "角色id。0表示所有权限（默认系统管理员使用，页面不显示）")
    private Integer roleId;

    @ApiModelProperty(value = "该用户可使用的页面列表.角色id为0时为全部权限（废弃）")
    private List<SysPageVO> pages;

    @ApiModelProperty(value = "菜单内容。（角色id为0时为全部权限，此字段为空）")
    private String menuContent;

}
