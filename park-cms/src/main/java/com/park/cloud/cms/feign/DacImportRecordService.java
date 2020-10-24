package com.park.cloud.cms.feign;

import com.park.cloud.cms.feign.hystrix.DacImportRecordServiceHystrix;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.user.OutsideListParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.user.OutsideListVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author liuhainan
 */
@Service
@FeignClient(value = "park-user-service", fallback = DacImportRecordServiceHystrix.class)
public interface DacImportRecordService {

    @PostMapping("record/outsideList")
    CommonResult<PageHelperVO<OutsideListVO>> outsideList(@RequestBody OutsideListParams params);

    @PostMapping("record/outsideAllList")
    CommonResult<List<OutsideListVO>> outsideAllList(@RequestBody OutsideListParams params);
}
