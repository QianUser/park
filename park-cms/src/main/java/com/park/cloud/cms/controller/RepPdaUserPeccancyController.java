package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.RepPdaUserPeccancyService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.RepBerthUseByDayParams;
import com.park.cloud.common.domain.params.cms.RepParkCountRefundParams;
import com.park.cloud.common.domain.params.cms.RepPdaUserPeccancyParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.RepBerthUseByDayVO;
import com.park.cloud.common.domain.vo.cms.RepParkCountRefundVO;
import com.park.cloud.common.domain.vo.cms.RepPdaUserCountVO;
import com.park.cloud.common.domain.vo.cms.RepPdaUserPeccancyVO;
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
 * @ClassNameRepPdaUserPeccancyController
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/2/25 15:25
 **/
@Api(value = "RepPdaUserPeccancyController", tags = {"巡检员派单报表接口"})
@RestController
@RequestMapping(value = "repPdaUserPeccancy")
@Validated
public class RepPdaUserPeccancyController {
    @Autowired
    private RepPdaUserPeccancyService repPdaUserPeccancyService;


    @PostMapping("dealStatistics")
    @ApiOperation(value = "统计接口", notes = "仅上方模块数据")
    @ResponseBody
    public CommonResult<RepPdaUserCountVO> dealStatistics(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepPdaUserPeccancyParams params, BindingResult result) {
        return repPdaUserPeccancyService.dealStatistics(params);
    }

    @PostMapping("list")
    @ApiOperation(value = "查询接口", notes = "分页列表查询")
    @ResponseBody
    public CommonResult<PageHelperVO<RepPdaUserPeccancyVO>> getRepPdaUserPeccancy(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid RepPdaUserPeccancyParams params, BindingResult result) {
        return repPdaUserPeccancyService.getRepPdaUserPeccancy(params);
    }




}
