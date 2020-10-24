package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.MonthlyTicketService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.MonthlyTicketListVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 包月卷的使用情况以及增删改查的接口
 */
@Api(value = "MonthlyTicketController" , tags = "包月卷使用情况接口")
@RestController
@Validated
@RequestMapping(value = "MonthlyTicket")
public class MonthlyTicketController {

    @Autowired
    private MonthlyTicketService monthlyTicketService;

    @LoginAuthIgnore
    @ApiOperation(value = "包月卷情况", notes = "包月卷情况接口")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<MonthlyTicketListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)@Valid MonthlyTicketParams param){
        return monthlyTicketService.list(param);
    }

    @LoginAuthIgnore
    @ApiOperation(value = "包月卷新增", notes = "包月卷新增接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)@Valid MonthlyTicketAddParams param) {

        return monthlyTicketService.add(param);

    }

    @LoginAuthIgnore
    @ApiOperation(value = "包月卷修改", notes = "包月卷修改接口")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)@Valid MonthlyTicketAddParams param) {

        return monthlyTicketService.update(param);

    }

    @LoginAuthIgnore
    @ApiOperation(value = "包月卷删除", notes = "包月卷删除接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List> delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)@Valid MonthlyTicketDeleteParams param){

        return monthlyTicketService.delete(param.getId());
    }

    @LoginAuthIgnore
    @ApiOperation(value = "包月策略的情况回显", notes = "包月策略回显接口")
    @RequestMapping(value = "strategy", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<MonthlyTrategyBackParams>> strategy(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)@Valid MonthlyStrategyParam param){

        return monthlyTicketService.strategy(param.getParkingSectionId());
    }


}
