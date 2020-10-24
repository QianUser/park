package com.park.cloud.cms.feign;

import com.park.cloud.cms.feign.hystrix.InvEinvoiceServiceHystrix;
import com.park.cloud.cms.feign.hystrix.TraCouponUsageRecordServiceHystrix;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.TraCouponUsageRecordParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.CouponUsageRecordVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author liuhainan
 */
@Service
@FeignClient(value = "park-order-service", fallback = TraCouponUsageRecordServiceHystrix.class)
public interface TraCouponUsageRecordService {

    @PostMapping("couponUsageRecord/list")
    CommonResult<PageHelperVO<CouponUsageRecordVO>> getCouponUsageRecords(TraCouponUsageRecordParams params);

    @PostMapping("couponUsageRecord/allList")
    CommonResult<List<CouponUsageRecordVO>> allList(TraCouponUsageRecordParams params);

}
