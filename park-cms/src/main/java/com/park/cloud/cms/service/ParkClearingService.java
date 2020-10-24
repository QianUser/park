package com.park.cloud.cms.service;


import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.params.cms.ParkClearingCountParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.ParkClearingPageVO;
import com.park.cloud.common.domain.vo.cms.ParkClearingVO;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface ParkClearingService {

    CommonResult<PageHelperVO<ParkClearingPageVO>> getParkClearing(ParkClearingCountParams params);

    CommonResult<List<ParkClearingPageVO>> getALLParkClearing(ParkClearingCountParams params,Boolean pageFlag);

    CommonResult<ParkClearingVO> topModule(CmsBaseParams param);
}
