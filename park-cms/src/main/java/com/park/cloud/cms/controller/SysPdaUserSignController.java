package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.SysPdaUserSignService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.SysPdaUserSignListParams;
import com.park.cloud.common.domain.params.cms.SysPdaUserSignSearchParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserSignListVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserSignVO;
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
 * 签到信息相关接口
 *
 * @author zyj
 * @date 2020/2/25
 */
@Api(value = "SysPdaUserSignController", tags = {"签到信息相关接口"})
@RestController
@RequestMapping(value = "sysPdaUserSign")
@Validated
public class SysPdaUserSignController {

    @Autowired
    SysPdaUserSignService sysPdaUserSignService;

    @ApiOperation(value = "签到列表", notes = "签到列表接口,用于下拉框")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<SysPdaUserSignListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserSignListParams param) {
        return sysPdaUserSignService.list(param);
    }

    @ApiOperation(value = "签到查询", notes = "签到查询接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<SysPdaUserSignVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysPdaUserSignSearchParams param) {
        return sysPdaUserSignService.search(param);
    }

}
