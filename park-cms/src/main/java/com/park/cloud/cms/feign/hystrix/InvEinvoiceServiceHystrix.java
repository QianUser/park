package com.park.cloud.cms.feign.hystrix;

import com.park.cloud.cms.feign.InvEinvoiceService;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.user.InvEinvoiceListPasrams;
import com.park.cloud.common.domain.params.user.InvIdParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.user.EinvoiceDetailVO;
import com.park.cloud.common.domain.vo.user.InvEinvoiceListVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InvEinvoiceServiceHystrix implements InvEinvoiceService {
    @Override
    public CommonResult<PageHelperVO<InvEinvoiceListVO>> einvoiceList(InvEinvoiceListPasrams pasrams) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<EinvoiceDetailVO> einvoiceDetail(InvIdParams param) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<List<InvEinvoiceListVO>> einvoiceAllList(InvEinvoiceListPasrams param) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }
}
