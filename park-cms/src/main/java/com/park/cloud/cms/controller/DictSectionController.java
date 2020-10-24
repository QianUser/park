package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.DictSectionService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictCityListWithChildVO;
import com.park.cloud.common.domain.vo.cms.DictSectionListVO;
import com.park.cloud.common.domain.vo.cms.DictSectionVO;
import com.park.cloud.common.domain.vo.cms.FindSectionAndParkVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

/**
 * 路段管理接口
 *
 * @author liyj
 * @create 2020/1/21
 * @since 1.0.0
 */
@Api(value = "DictSectionController", tags = {"路段管理接口"})
@RestController
@RequestMapping(value = "dictSection")
@Validated
public class DictSectionController {

    @Autowired
    DictSectionService dictSectionService;

    @ApiOperation(value = "添加路段", notes = "添加路段接口")
    @RequestMapping(value = "add", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult add(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictSectionAddParams param, BindingResult result) {
        return dictSectionService.add(param);
    }

    @ApiOperation(value = "更新路段", notes = "更新路段接口,不需要更新的参数可以不传")
    @RequestMapping(value = "update", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictSectionUpdateParams param, BindingResult result) {
        return dictSectionService.update(param);
    }

    @ApiOperation(value = "路段详情", notes = "路段详情接口")
    @RequestMapping(value = "detail", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<DictSectionVO> detail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictSectionDetailParams param, BindingResult result) {
        return dictSectionService.detail(param);
    }

    @ApiOperation(value = "路段删除", notes = "路段删除接口")
    @RequestMapping(value = "delete", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult delete(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictSectionDeleteParams param, BindingResult result) {
        return dictSectionService.delete(param);
    }

    @ApiOperation(value = "搜索路段", notes = "搜索路段接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<DictSectionVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictSectionSearchParams param, BindingResult result) {
        return dictSectionService.search(param);
    }

    @ApiOperation(value = "路段列表", notes = "路段列表接口,用于下拉框")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<DictSectionListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictSectionListParams param, BindingResult result) {
        return dictSectionService .list(param);
    }

    @ApiOperation(value = "路段列表", notes = "路段列表接口,带有城市、行政区、片区的上下级关系")
    @RequestMapping(value = "listWithParent", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<DictCityListWithChildVO>> listWithParent(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictSectionListParams param, BindingResult result) {
        return dictSectionService.listWithParent(param);
    }

    @PostMapping("listSectionAndPark")
    @ApiOperation(value = "路段和停车场的数据", notes = "路段和停车场的数据")
    @ResponseBody
    public CommonResult<List<FindSectionAndParkVO>> listSectionAndPark(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid CmsBaseParams param, BindingResult result) {
        return dictSectionService.listSectionAndPark(param);
    }

    @LoginAuthIgnore
    @ApiOperation(value = "路段列表", notes = "跟id列表查询路段列表")
    @RequestMapping(value = "listByIds", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<DictSectionVO>> listByIds(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) IdParams param) {
        if(Objects.isNull(param.getId())){
            return CommonResult.failed("路段id列表不能为空！");
        }
        return dictSectionService .listByIds(param);
    }

}
