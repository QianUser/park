package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.SysRoleService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPageListVO;
import com.park.cloud.common.domain.vo.cms.SysRoleListVO;
import com.park.cloud.common.domain.vo.cms.SysRoleVO;
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
import java.util.List;

/**
 * 角色管理接口
 *
 * @author liyj1
 * @create 2020/2/1
 * @since 1.0.0
 */
@Api(value = "SysRoleController", tags = {"角色管理接口"})
@RestController
@RequestMapping(value = "sysRole")
@Validated
public class SysRoleController {

    @Autowired
    SysRoleService sysRoleService;

    @ApiOperation(value = "添加角色", notes = "添加角色接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysRoleAddParams param, BindingResult result) {
        return sysRoleService.add(param);
    }

    @ApiOperation(value = "更新角色", notes = "更新角色接口,不需要更新的参数可以不传")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysRoleUpdateParams param, BindingResult result) {
        return sysRoleService.update(param);
    }

    @ApiOperation(value = "角色删除", notes = "角色删除接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysRoleDeleteParams param, BindingResult result) {
        return sysRoleService.delete(param);
    }

    @ApiOperation(value = "搜索角色", notes = "搜索角色接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<SysRoleVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysRoleSearchParams param, BindingResult result) {
        return sysRoleService.search(param);
    }

    @ApiOperation(value = "角色列表", notes = "角色列表接口,用于下拉框")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<SysRoleListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysRoleListParams param, BindingResult result) {
        return sysRoleService.list(param);
    }

    @ApiOperation(value = "菜单页面列表", notes = "菜单页面列表接口,返回所有可设置权限的菜单页面")
    @RequestMapping(value = "allPages", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<SysPageListVO>> allPages(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid CmsBaseParams param, BindingResult result) {
        return sysRoleService.allPages();
    }

}
