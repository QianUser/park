package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.SysPdaScheduleService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaScheduleListVO;
import com.park.cloud.common.domain.vo.cms.SysPdaScheduleVO;
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
 * 班次管理相关接口
 *
 * @author zyj
 * @date 2020/2/25
 */
@Api(value = "SysPdaScheduleController", tags = {"班次管理相关接口"})
@RestController
@RequestMapping(value = "sysPdaSchedule")
@Validated
public class SysPdaScheduleController {

    @Autowired
    SysPdaScheduleService sysPdaScheduleService;

    @ApiOperation(value = "班次列表", notes = "班次列表接口,用于下拉框")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<SysPdaScheduleListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaScheduleListParams param) {
        return sysPdaScheduleService.list(param);
    }

    @ApiOperation(value = "班次查询", notes = "班次查询接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<SysPdaScheduleVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaScheduleSearchParams param) {
        return sysPdaScheduleService.search(param);
    }

    @ApiOperation(value = "添加班次", notes = "添加班次接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaScheduleAddParams param) {
        return sysPdaScheduleService.add(param);
    }

    @ApiOperation(value = "更新班次", notes = "更新班次接口")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaScheduleUpdateParams param) {
        return sysPdaScheduleService.update(param);
    }

    @ApiOperation(value = "班次详情", notes = "班次详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<SysPdaScheduleVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaScheduleDetailParams param) {
        return sysPdaScheduleService.detail(param);
    }

    @ApiOperation(value = "删除班次", notes = "删除班次接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaScheduleDeleteParams param) {
        return sysPdaScheduleService.delete(param);
    }
}
