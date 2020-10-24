package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.DictBerthCityDayService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.params.cms.DictBerthCityDaySearchParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictBerthCityDayVO;
import com.park.cloud.common.domain.vo.cms.DictSectionListVO;
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
 * 今日泊位占用情况接口
 *
 * @author zyj
 * @date 2020/3/17
 */
@Api(value = "DictBerthCityDayController", tags = {"今日泊位占用情况接口"})
@RestController
@RequestMapping(value = "dictBerthCityDay")
@Validated
public class DictBerthCityDayController {

    @Autowired
    private DictBerthCityDayService dictBerthCityDayService;

    @ApiOperation(value = "今日泊位占用列表", notes = "今日泊位占用列表接口,用于下拉框")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<DictSectionListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid CmsBaseParams param) {
        return dictBerthCityDayService.list(param);
    }

    @ApiOperation(value = "今日泊位占用查询", notes = "今日泊位占用查询接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<DictBerthCityDayVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictBerthCityDaySearchParams param) {
        return dictBerthCityDayService.search(param);
    }

}
