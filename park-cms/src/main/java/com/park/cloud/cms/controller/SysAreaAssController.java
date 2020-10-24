package com.park.cloud.cms.controller;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.params.cms.SysAreaAssSearchParams;
import com.park.cloud.common.domain.params.cms.SysAreaAssUpdateParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysAreaAssVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 用户辖区分配接口
 *
 * @author liyj1
 * @create 2020/2/1
 * @since 1.0.0
 */
@Api(value = "SysAreaAssController", tags = {"用户辖区分配接口"})
@RestController
@RequestMapping(value = "sysAreaAss")
@Validated
public class SysAreaAssController {

    @Autowired
    SysAreaAssService sysAreaAssService;

    @ApiOperation(value = "更新用户辖区", notes = "更新用户辖区接口,不需要更新的参数可以不传")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysAreaAssUpdateParams param, BindingResult result) {
        return sysAreaAssService.update(param);
    }

    @ApiOperation(value = "搜索用户辖区", notes = "搜索用户辖区接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<SysAreaAssVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysAreaAssSearchParams param, BindingResult result) {
        return sysAreaAssService.search(param);
    }

}
