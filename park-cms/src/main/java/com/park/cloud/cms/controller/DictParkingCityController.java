package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.DictParkingCityService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictCityListWithChildVO;
import com.park.cloud.common.domain.vo.cms.DictParkingCityListVO;
import com.park.cloud.common.domain.vo.cms.DictParkingCityVO;
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
import java.util.List;
import java.util.Objects;

/**
 * 停车场管理接口
 *
 * @author liyj
 * @create 2020/1/22
 * @since 1.0.0
 */
@Api(value = "DictParkingCityController", tags = {"停车场管理接口"})
@RestController
@RequestMapping(value = "dictParking")
@Validated
public class DictParkingCityController {

    @Autowired
    DictParkingCityService dictParkingCityService;

    @ApiOperation(value = "添加停车场", notes = "添加停车场接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<Object> add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictParkingCityAddParams param, BindingResult result) {
        return dictParkingCityService.add(param);
    }

    @ApiOperation(value = "更新停车场", notes = "更新停车场接口,不需要更新的参数可以不传")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictParkingCityUpdateParams param, BindingResult result) {
        return dictParkingCityService.update(param);
    }

    @ApiOperation(value = "停车场详情", notes = "停车场详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<DictParkingCityVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictParkingCityDetailParams param, BindingResult result) {
        return dictParkingCityService.detail(param);
    }

    @ApiOperation(value = "搜索停车场", notes = "搜索停车场接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<DictParkingCityVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictParkingCitySearchParams param, BindingResult result) {
        return dictParkingCityService.search(param);
    }

    @ApiOperation(value = "停车场列表", notes = "停车场列表接口,用于下拉框")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<DictParkingCityListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictParkingCityListParams param, BindingResult result) {
        return dictParkingCityService.list(param);
    }

    @ApiOperation(value = "停车场列表", notes = "停车场列表接口,带有城市、行政区、片区的上下级关系")
    @RequestMapping(value = "listWithParent", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<DictCityListWithChildVO>> listWithParent(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictParkingCityListParams param, BindingResult result) {
        return dictParkingCityService.listWithParent(param);
    }

    @LoginAuthIgnore
    @ApiOperation(value = "停车场列表", notes = "根据停车场id查询停车场列表")
    @RequestMapping(value = "listByParkIds", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<DictParkingCityVO>> listByParkIds(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) IdParams param) {
        if(Objects.isNull(param.getId())){
            return CommonResult.failed("路段id列表不能为空！");
        }
        return dictParkingCityService.listByIds(param);
    }

}
