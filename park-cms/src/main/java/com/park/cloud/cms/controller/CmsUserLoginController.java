package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.SysUserService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.params.cms.SysUserLoginParams;
import com.park.cloud.common.domain.params.cms.SysUserUpdatePersonalInfoParams;
import com.park.cloud.common.domain.params.cms.SysUserUpdatePwdParams;
import com.park.cloud.common.domain.vo.cms.SysUserLoginVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 用户登录认证相关接口
 *
 * @author liyj
 * @create 2020/1/15
 * @since 1.0.0
 */
@Api(value = "CmsUserLoginController", tags = {"用户登录认证相关接口"})
@RestController
@RequestMapping(value = "cmsUser")
@Validated
public class CmsUserLoginController {

    @Autowired
    SysUserService userService;

    @LoginAuthIgnore
    @ApiOperation(value = "后台登录", notes = "后台用户登录，返回D用户相关信息数据。-1001:账号错误或不存在，-1002:密码错误")
    @RequestMapping(value = "login", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<SysUserLoginVO> login(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysUserLoginParams param, BindingResult result) {
        return userService.login(param);
    }

    @ApiOperation(value = "修改密码", notes = "登录用户修改本账号的登录密码")
    @RequestMapping(value = "updatePwd", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult updatePwd(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysUserUpdatePwdParams param, BindingResult result) {
        return userService.updatePwd(param);
    }

    @ApiOperation(value = "修改个人信息", notes = "登录用户修改本账号的个人信息")
    @RequestMapping(value = "updatePersonalInfo", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult updatePwd(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysUserUpdatePersonalInfoParams param, BindingResult result) {
        return userService.updatePersonalInfo(param);
    }

    @ApiOperation(value = "退出登录", notes = "登录用户退出当前账号")
    @RequestMapping(value = "logout", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult logout(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid CmsBaseParams param, BindingResult result) {
        return userService.logout(param);
    }

}
