package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.ParkClearingService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.params.cms.ParkClearingCountParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.ParkClearingPageVO;
import com.park.cloud.common.domain.vo.cms.ParkClearingVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @ClassNameParkClearingController
 * @Description 清分结算页面
 * @Author liangshuang
 * @Date 2020/3/6 10:03
 **/
@Api(value = "ParkClearingController", tags = {"清分结算接口"})
@RestController
@RequestMapping(value = "parkClearing")
@Validated
public class ParkClearingController {
    @Autowired
    private ParkClearingService parkClearingService;


    @PostMapping("topModule")
    @ApiOperation(value = "统计接口", notes = "仅上方模块数据")
    @ResponseBody
    public CommonResult<ParkClearingVO> topModule(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid CmsBaseParams param, BindingResult result) {
        return parkClearingService.topModule(param);
    }
    @PostMapping("list")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    @ResponseBody
    public CommonResult<PageHelperVO<ParkClearingPageVO>> getParkClearing(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid ParkClearingCountParams params, BindingResult result) {
        return parkClearingService.getParkClearing(params);
    }


}
