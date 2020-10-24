package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.SysGateNotPayService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.SysGateNotPayDetailParams;
import com.park.cloud.common.domain.params.cms.SysGateNotPayUpdateParams;
import com.park.cloud.common.domain.vo.cms.SysGateNotPayVO;
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
 * 出场未支付处理接口
 */
@Api(value = "SysGateNotPayController", tags = {"出场未支付处理接口"})
@RestController
@RequestMapping(value = "sysGateNotPay")
@Validated
public class SysGateNotPayController {
    @Autowired
    SysGateNotPayService sysGateNotPayService;

    @LoginAuthIgnore
    @ApiOperation(value = "未支付", notes = "未支付接口")
    @RequestMapping(value = "gateNotPay", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<SysGateNotPayVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysGateNotPayDetailParams param) {
        return sysGateNotPayService.detail(param);
    }

    @LoginAuthIgnore
    @ApiOperation(value = "更新未支付", notes = "更新未支付接口")
    @RequestMapping(value = "updateGateNotPay", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid SysGateNotPayUpdateParams param) {
        return sysGateNotPayService.update(param);
    }

}
