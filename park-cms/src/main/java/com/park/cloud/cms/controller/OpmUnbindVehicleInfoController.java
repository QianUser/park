package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.OpmUnbindVehicleInfoService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.OpmUnbindVehicleInfoAddParams;
import com.park.cloud.common.domain.params.cms.OpmUnbindVehicleInfoSearchParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.OpmUnbindVehicleInfoVO;
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
 * 车牌解绑接口
 *
 * @author liyj1
 * @create 2020/2/11
 * @since 1.0.0
 */
@Api(value = "OpmUnbindVehicleInfoController", tags = {"车牌解绑接口"})
@RestController
@RequestMapping(value = "opmUnbindVehicle")
@Validated
public class OpmUnbindVehicleInfoController {

    @Autowired
    OpmUnbindVehicleInfoService opmUnbindVehicleInfoService;

    @ApiOperation(value = "搜索解绑车牌", notes = "搜索解绑车牌接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<OpmUnbindVehicleInfoVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid OpmUnbindVehicleInfoSearchParams param, BindingResult result) {
        return opmUnbindVehicleInfoService.search(param);
    }

    @ApiOperation(value = "解绑车牌", notes = "解绑车牌接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid OpmUnbindVehicleInfoAddParams param, BindingResult result) {
        return opmUnbindVehicleInfoService.add(param);
    }

}
