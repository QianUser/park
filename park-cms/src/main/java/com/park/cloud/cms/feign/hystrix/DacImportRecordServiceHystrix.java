package com.park.cloud.cms.feign.hystrix;

import com.park.cloud.cms.feign.DacImportRecordService;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.user.OutsideListParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.user.OutsideListVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DacImportRecordServiceHystrix implements DacImportRecordService {
    @Override
    public CommonResult<PageHelperVO<OutsideListVO>> outsideList(OutsideListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }

    @Override
    public CommonResult<List<OutsideListVO>> outsideAllList(OutsideListParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }
}
