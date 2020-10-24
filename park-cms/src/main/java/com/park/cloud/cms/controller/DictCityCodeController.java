package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.DictCityCodeService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.DictCityCodeListParams;
import com.park.cloud.common.domain.vo.cms.DictCityCodeListVO;
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
 * 城市编码接口
 *
 * @author liyj1
 * @create 2020/1/31
 * @since 1.0.0
 */
@Api(value = "DictCityCodeController", tags = {"城市编码接口"})
@RestController
@RequestMapping(value = "dictCityCode")
@Validated
public class DictCityCodeController {

    @Autowired
    DictCityCodeService dictCityCodeService;

    @ApiOperation(value = "全国省市行政区列表接口", notes = "返回全国省市行政区列表数据")
    @RequestMapping(value = "list", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<List<DictCityCodeListVO>> list(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictCityCodeListParams param, BindingResult result) {
        return dictCityCodeService.list(param);
    }

}
