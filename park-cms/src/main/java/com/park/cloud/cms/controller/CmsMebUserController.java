package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.CmsMebUserService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.CmsMebUserSearchParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.CmsMebUserVO;
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
 * 用户管理-用户信息接口
 *
 * @author liyj1
 * @create 2020/2/10
 * @since 1.0.0
 */
@Api(value = "CmsMebUserController", tags = {"用户管理-用户信息接口"})
@RestController
@RequestMapping(value = "mebUser")
@Validated
public class CmsMebUserController {

    @Autowired
    CmsMebUserService mebUserService;

    @ApiOperation(value = "搜索用户", notes = "搜索用户接口")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<CmsMebUserVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid CmsMebUserSearchParams param, BindingResult result) {
        return mebUserService.search(param);
    }

}
