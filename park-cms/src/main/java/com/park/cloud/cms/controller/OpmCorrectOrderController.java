package com.park.cloud.cms.controller;

import com.park.cloud.cms.service.OpmCorrectOrderService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.OpmCorrectOrderAuditParams;
import com.park.cloud.common.domain.params.cms.OpmCorrectOrderListParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.OpmCorrectOrderVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 纠错订单
 *
 * @author liuhainan
 * @date 2020/2/5
 * @since 1.0.0
 */
@Api(value = "OpmCorrectOrderController", tags = {"纠错订单接口"})
@RestController
@RequestMapping(value = "opmCorrectOrder")
@Validated
public class OpmCorrectOrderController {

    @Autowired
    private OpmCorrectOrderService correctOrderService;

    @ApiOperation(value = "纠错订单列表查询", notes = "纠错订单列表查询")
    @RequestMapping(value = "search", method = RequestMethod.POST
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
            , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CommonResult<PageHelperVO<OpmCorrectOrderVO>> search(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) OpmCorrectOrderListParams param) {
        return correctOrderService.search(param);
    }

    @PostMapping("update")
    @ApiOperation(value = "审核纠错订单", notes = "审核纠错订单")
    public CommonResult<String> update(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)@Valid OpmCorrectOrderAuditParams params){
        return correctOrderService.update(params);
    }

}
