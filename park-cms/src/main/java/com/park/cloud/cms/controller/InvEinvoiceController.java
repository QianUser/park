package com.park.cloud.cms.controller;

import com.park.cloud.cms.feign.InvEinvoiceService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.user.InvEinvoiceListPasrams;
import com.park.cloud.common.domain.params.user.InvIdParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.user.EinvoiceDetailVO;
import com.park.cloud.common.domain.vo.user.InvEinvoiceListVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author liuhainan
 */
@Api(value = "用户申请电子发票", tags = {"用户申请电子发票接口"})
@RequestMapping(value = "invEinvoice")
@Slf4j
@RestController
public class InvEinvoiceController {

    @Autowired
    private InvEinvoiceService invEinvoiceService;

    @ApiOperation(value = "根据条件查询所有发票", notes = "根据条件查询所有发票")
    @PostMapping("einvoiceList")
    public CommonResult<PageHelperVO<InvEinvoiceListVO>> einvoiceList(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true) InvEinvoiceListPasrams pasrams){

        return invEinvoiceService.einvoiceList(pasrams);
    }

    @ApiOperation(value = "发票详情(Cms使用)", notes = "发票详情(Cms使用)")
    @PostMapping("einvoiceDetail")
    public CommonResult<EinvoiceDetailVO> einvoiceDetail(@RequestBody @ApiParam(
            name = "参数信息", value = "参数实体", required = true)@Valid IdParams pasrams){
        InvIdParams invIdParams = new InvIdParams();
        invIdParams.setId(pasrams.getId());
        return invEinvoiceService.einvoiceDetail(invIdParams);
    }
}
