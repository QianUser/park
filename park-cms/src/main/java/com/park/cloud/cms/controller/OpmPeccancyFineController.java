package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.OpmPeccancyFineService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.MebMerchantSearchParams;
import com.park.cloud.common.domain.params.cms.PeccancyFineSearchParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.MebMerchantVO;
import com.park.cloud.common.domain.vo.cms.PeccancyFineSearchVO;
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
 * 违章欠款接口
 *
 * @author liuhainan
 * @date 2020/2/5
 * @since 1.0.0
 */
@Api(value = "PeccancyFineController", tags = {"违章欠款接口"})
@RestController
@RequestMapping(value = "opmPeccancyFine")
@Validated
public class OpmPeccancyFineController {

    @Autowired
    private OpmPeccancyFineService opmPeccancyFineService;


    @ApiOperation(value = "自泊欠费订单列表查询", notes = "自泊欠费订单列表查询")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<PeccancyFineSearchVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) @Valid PeccancyFineSearchParams param, BindingResult result) {
        return opmPeccancyFineService.search(param);
    }

}
