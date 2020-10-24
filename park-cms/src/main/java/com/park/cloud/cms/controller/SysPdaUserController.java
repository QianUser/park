package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.SysPdaUserService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserListVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


/**
 * 巡检员管理相关接口
 *
 * @author zyj
 * @date 2020/2/25
 */
@Api(value = "SysPdaUserController", tags = {"巡检员管理相关接口"})
@RestController
@RequestMapping(value = "sysPdaUser")
@Validated
public class SysPdaUserController {

    @Autowired
    SysPdaUserService sysPdaUserService;

    @ApiOperation(value = "巡检员列表", notes = "巡检员列表接口,用于下拉框")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<SysPdaUserListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserListParams param) {
        return sysPdaUserService.list(param);
    }

    @ApiOperation(value = "巡检员查询", notes = "巡检员查询接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<SysPdaUserVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserSearchParams param) {
        return sysPdaUserService.search(param);
    }

    @ApiOperation(value = "添加巡检员", notes = "添加巡检员接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserAddParams param) {
        return sysPdaUserService.add(param);
    }

    @ApiOperation(value = "更新巡检员", notes = "更新巡检员接口")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserUpdateParams param) {
        return sysPdaUserService.update(param);
    }

    @ApiOperation(value = "巡检员详情", notes = "巡检员详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<SysPdaUserVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserDetailParams param) {
        return sysPdaUserService.detail(param);
    }

    @ApiOperation(value = "删除巡检员", notes = "删除巡检员接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserDeleteParams param) {
        return sysPdaUserService.delete(param);
    }
}
