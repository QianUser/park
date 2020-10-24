package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.PeccancyFineSearchParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.PeccancyFineSearchVO;

/**
 * @author liuhainan
 */
public interface OpmPeccancyFineService {
    CommonResult<PageHelperVO<PeccancyFineSearchVO>> search( PeccancyFineSearchParams param);
}
