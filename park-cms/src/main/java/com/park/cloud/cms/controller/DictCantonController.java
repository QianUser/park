package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.DictCantonService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictCantonListVO;
import com.park.cloud.common.domain.vo.cms.DictCantonVO;
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

/**
 * 行政区管理接口
 *
 * @author liyj1
 * @create 2020/1/31
 * @since 1.0.0
 */
@Api(value = "DictCantonController", tags = {"行政区管理接口"})
@RestController
@RequestMapping(value = "dictCanton")
@Validated
public class DictCantonController {

    @Autowired
    DictCantonService dictCantonService;

    @ApiOperation(value = "添加行政区", notes = "添加行政区接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictCantonAddParams param, BindingResult result) {
        return dictCantonService.add(param);
    }

    @ApiOperation(value = "更新行政区", notes = "更新行政区接口,不需要更新的参数可以不传")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictCantonUpdateParams param, BindingResult result) {
        return dictCantonService.update(param);
    }

    @ApiOperation(value = "行政区详情", notes = "行政区详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<DictCantonVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictCantonDetailParams param, BindingResult result) {
        return dictCantonService.detail(param);
    }

    @ApiOperation(value = "行政区删除", notes = "行政区删除接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictCantonDeleteParams param, BindingResult result) {
        return dictCantonService.delete(param);
    }

    @ApiOperation(value = "搜索行政区", notes = "搜索行政区接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<DictCantonVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictCantonSearchParams param, BindingResult result) {
        return dictCantonService.search(param);
    }

    @ApiOperation(value = "行政区列表", notes = "行政区列表接口,用于下拉框")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<DictCantonListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictCantonListParams param, BindingResult result) {
        return dictCantonService.list(param);
    }

}
