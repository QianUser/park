package com.park.cloud.cms.feign.hystrix;

import com.park.cloud.cms.feign.TraOrderChangeService;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.order.TraOrderChangeListParams;
import com.park.cloud.common.domain.params.order.TraOrderChangeParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.order.TraOrderChangeVO;
import org.springframework.stereotype.Component;

@Component
public class TraOrderChangeServiceHystrix implements TraOrderChangeService {
    @Override
    public CommonResult<String> add(TraOrderChangeParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<PageHelperVO<TraOrderChangeVO>> list(TraOrderChangeListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }
}
