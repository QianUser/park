package com.park.cloud.cms.controller;

import com.park.cloud.cms.feign.DacImportRecordService;
import com.park.cloud.common.annotation.LoginAuthIgnore;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.user.OutsideListParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.user.OutsideListVO;
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
 * @author liuhainan
 */
@Api(value = "DacImportRecordController", tags = {"路外停车场车辆进出记录接口"})
@RestController
@RequestMapping(value = "importRecord")
@Validated
public class DacImportRecordController {

    @Autowired
    private DacImportRecordService importRecordService;

    @ApiOperation(value = "路外停车记录(CMS用)", notes = "路外停车记录(CMS用)")
    @RequestMapping(value = "outsideList", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<OutsideListVO>> outsideList(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid OutsideListParams params, BindingResult result) {
        return importRecordService.outsideList(params);
    }
}
