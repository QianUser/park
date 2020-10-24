package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.SysPdaUserScheduleService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserScheduleDetailVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserScheduleVO;
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
 * 排班管理相关接口
 *
 * @author zyj
 * @date 2020/2/25
 */
@Api(value = "SysPdaUserScheduleController", tags = {"排班管理相关接口"})
@RestController
@RequestMapping(value = "sysPdaUserSchedule")
@Validated
public class SysPdaUserScheduleController {

    @Autowired
    SysPdaUserScheduleService sysPdaUserScheduleService;

    @ApiOperation(value = "排班查询", notes = "排班查询接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<SysPdaUserScheduleVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserScheduleSearchParams param) {
        return sysPdaUserScheduleService.search(param);
    }

    @ApiOperation(value = "月排班详情", notes = "月排班详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<SysPdaUserScheduleDetailVO>> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserScheduleDetailParams param) {
        return sysPdaUserScheduleService.detail(param);
    }

    @ApiOperation(value = "添加排班", notes = "月份添加排班接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserScheduleAddParams param) {
        return sysPdaUserScheduleService.add(param);
    }

    @ApiOperation(value = "删除排班", notes = "删除排班接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserScheduleDeleteParams param) {
        return sysPdaUserScheduleService.delete(param);
    }

    @ApiOperation(value = "更新排班", notes = "新增删除排班接口，type=1、传pdaScheduleId，pdaUserScheduleId，year，month，day，" +
            "type=2、传pdaUserScheduleId")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserScheduleUpdateParams param) {
        return sysPdaUserScheduleService.update(param);
    }
}
