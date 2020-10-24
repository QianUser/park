package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.MebUserDataService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.params.cms.MebUserDataListParams;
import com.park.cloud.common.domain.params.cms.MebUserDataMonthParams;
import com.park.cloud.common.domain.vo.cms.MebUserDataMonthVO;
import com.park.cloud.common.domain.vo.cms.MebUserDataVO;
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
 * 用户报表相关接口
 *
 * @author zyj
 * @date 2020/3/17
 */
@Api(value = "MebUserDataController", tags = {"用户报表相关接口"})
@RestController
@RequestMapping(value = "mebUserData")
@Validated
public class MebUserDataController {

    @Autowired
    MebUserDataService mebUserDataService;

    @ApiOperation(value = "用户数接口", notes = "总用户数，今日新增用户数，今日交易用户数，今日活跃用户数")
    @RequestMapping(value = "count", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<MebUserDataVO> count(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid CmsBaseParams param) {
        return mebUserDataService.count(param);
    }

    @ApiOperation(value = "月用户数", notes = "月用户数接口")
    @RequestMapping(value = "month", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<MebUserDataMonthVO> month(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) MebUserDataMonthParams param) {
        return mebUserDataService.selectUserDataMonth(param);
    }

    @ApiOperation(value = "用户数列表", notes = "用户数列表接口")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) MebUserDataListParams param) {
        return mebUserDataService.list(param);
    }

}
