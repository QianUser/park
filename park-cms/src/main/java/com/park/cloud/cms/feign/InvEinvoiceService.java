package com.park.cloud.cms.feign;

import com.park.cloud.cms.feign.hystrix.InvEinvoiceServiceHystrix;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.user.InvEinvoiceListPasrams;
import com.park.cloud.common.domain.params.user.InvIdParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.user.EinvoiceDetailVO;
import com.park.cloud.common.domain.vo.user.InvEinvoiceListVO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@FeignClient(value = "park-user-service", fallback = InvEinvoiceServiceHystrix.class)
public interface InvEinvoiceService {

    /**
     * 根据条件查询所有发票
     * @param pasrams
     * @return
     */
    @PostMapping("invEinvoice/einvoiceList")
    CommonResult<PageHelperVO<InvEinvoiceListVO>> einvoiceList(@RequestBody InvEinvoiceListPasrams pasrams);

    @PostMapping("invEinvoice/einvoiceDetail")
    CommonResult<EinvoiceDetailVO> einvoiceDetail(@RequestBody InvIdParams param);

    @PostMapping("invEinvoice/einvoiceAllList")
    CommonResult<List<InvEinvoiceListVO>> einvoiceAllList(@RequestBody InvEinvoiceListPasrams param);

}
