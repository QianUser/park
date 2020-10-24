package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.RepPdaUserPeccancyParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.RepPdaUserCountVO;
import com.park.cloud.common.domain.vo.cms.RepPdaUserPeccancyVO;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:巡检员派单报表业务层
 * @Author: liangshuang
 * @Date: 2020/2/25 15:26

 **/

public interface RepPdaUserPeccancyService {

    CommonResult<PageHelperVO<RepPdaUserPeccancyVO>> getRepPdaUserPeccancy(RepPdaUserPeccancyParams params);


    CommonResult<RepPdaUserCountVO> dealStatistics(RepPdaUserPeccancyParams params);
}
