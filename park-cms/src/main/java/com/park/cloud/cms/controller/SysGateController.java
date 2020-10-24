package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.SysGateService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysGateVO;
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

/**
 * 闸机管理接口
 */
@Api(value = "SysGateController", tags = {"闸机管理接口"})
@RestController
@RequestMapping(value = "sysGate")
@Validated
public class SysGateController {
    @Autowired
    SysGateService sysGateService;

    @ApiOperation(value = "添加闸机", notes = "添加闸机接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysGateAddParams param) {
        return sysGateService.add(param);
    }

    @ApiOperation(value = "更新闸机", notes = "更新闸机接口")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysGateUpdateParams param) {
        return sysGateService.update(param);
    }

    @ApiOperation(value = "闸机详情", notes = "闸机详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<SysGateVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysGateDetailParams param) {
        return sysGateService.detail(param);
    }

    @ApiOperation(value = "闸机删除", notes = "闸机删除接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysGateDeleteParams param) {
        return sysGateService.delete(param);
    }

    @ApiOperation(value = "搜索闸机", notes = "搜索闸机接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<SysGateVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysGateSearchParams param) {
        return sysGateService.search(param);
    }

}
