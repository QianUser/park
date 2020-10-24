package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.SysUserService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysUserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 人员管理接口
 *
 * @author liyj
 * @create 2020/1/21
 * @since 1.0.0
 */
@Api(value = "SysUserController", tags = {"人员管理接口"})
@RestController
@RequestMapping(value = "sysUser")
@Validated
public class SysUserController {
    @Autowired
    SysUserService userService;

    @ApiOperation(value = "添加人员", notes = "添加人员接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysUserAddParams param, BindingResult result) {
        return userService.add(param);
        // return CommonResult.failed();
    }

    @ApiOperation(value = "更新人员", notes = "更新人员接口,不需要更新的参数可以不传")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysUserUpdateParams param, BindingResult result) {
        return userService.update(param);
    }

    @ApiOperation(value = "人员详情", notes = "人员详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<SysUserVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysUserDetailParams param, BindingResult result) {
        return userService.detail(param);
    }

    @ApiOperation(value = "人员删除", notes = "人员删除接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysUserDeleteParams param, BindingResult result) {
        return userService.delete(param);
    }

    @ApiOperation(value = "搜索人员", notes = "搜索人员接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<SysUserVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysUserSearchParams param, BindingResult result) {
        return userService.search(param);
    }

}
