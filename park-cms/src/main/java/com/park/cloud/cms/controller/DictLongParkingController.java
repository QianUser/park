package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.DictLongParkingService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.DictLongParkingSearchParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictLongParkingVO;
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
 * 僵尸车相关接口
 *
 * @author zyj
 * @date 2020/3/17
 */
@Api(value = "LongParkingController", tags = {"僵尸车相关接口"})
@RestController
@RequestMapping(value = "dictLongParking")
@Validated
public class DictLongParkingController {

    @Autowired
    private DictLongParkingService dictLongParkingService;

    @ApiOperation(value = "僵尸车查询", notes = "僵尸车查询接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<DictLongParkingVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid DictLongParkingSearchParams param) {
        return dictLongParkingService.search(param);
    }

}
