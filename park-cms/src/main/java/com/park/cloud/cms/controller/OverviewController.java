package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.OverviewService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.params.cms.ParkingSaturationParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 概况相关接口
 *
 * @author zyj
 * @create 2020/2/6
 * @since 1.0.0
 */
@Api(value = "OverviewController", tags = {"概况相关接口"})
@RestController
@RequestMapping(value = "overview")
@Validated
public class OverviewController {
    @Autowired
    OverviewService overviewService;

    @ApiOperation(value = "停车热力图", notes = "停车场名称，位置，停车数，空位数")
    @RequestMapping(value = "parkingDiagram", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<ParkingDiagramInfoVO> parkingDiagram (CmsBaseParams param) {
        return overviewService.parkingDiagram(param);
    }

    @ApiOperation(value = "停车饱和度", notes = "停车场饱和度：<50%，>50%，>80%")
    @RequestMapping(value = "saturation", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<ParkingSaturationVO>> saturation (ParkingSaturationParams param) {
        return overviewService.saturation(param);
    }

    @ApiOperation(value = "当日停车金额", notes = "今日停车金额，今日停车次数，实时空位/周转率。分为路内、路外")
    @RequestMapping(value = "parkingAmount", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<ParkingAmountVO> parkingAmount (CmsBaseParams param) {
        return overviewService.parkingAmount(param);
    }

    @ApiOperation(value = "本月和上月停车金额", notes = "本月和上月停车金额")
    @RequestMapping(value = "parkingAmountMonth", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<ParkingAmountMonthVO> parkingAmountMonth (CmsBaseParams param) {
        return overviewService.parkingAmountMonth(param);
    }

    @ApiOperation(value = "今日营收指数", notes = "当日24小时路内、路外收益额")
    @RequestMapping(value = "parkingAmountDay", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<ParkingAmountHourVO> parkingAmountDay (CmsBaseParams param) {
        return overviewService.parkingAmountDay(param);
    }

    @ApiOperation(value = "今日停车指数", notes = "当日24小时路内、路外停车指数")
    @RequestMapping(value = "parkingCountDay", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<ParkingCountHourVO> parkingCountDay (CmsBaseParams param) {
        return overviewService.parkingCountDay(param);
    }

    @ApiOperation(value = "停车场类型分布", notes = "停车场类型分布")
    @RequestMapping(value = "parkingType", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<ParkingTypeVO> parkingType(CmsBaseParams param) {
        return overviewService.parkingType(param);
    }

    @ApiOperation(value = "停车场服务分布", notes = "停车场服务分布")
    @RequestMapping(value = "parkingService", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<ParkingServiceVO> parkingService(CmsBaseParams param) {
        return overviewService.parkingService(param);
    }

    @ApiOperation(value = "停车场时长分布", notes = "停车场时长分布")
    @RequestMapping(value = "parkingTime", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<ParkingTimeVO> parkingTime(CmsBaseParams param) {
        return overviewService.parkingTime(param);
    }

    @ApiOperation(value = "停车场营收能力分析", notes = "停车场营收能力分析")
    @RequestMapping(value = "parkingAmountAll", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<ParkingAmountAllVO>> parkingAmountAll(CmsBaseParams param) {
        return overviewService.parkingAmountAll(param);
    }
}
