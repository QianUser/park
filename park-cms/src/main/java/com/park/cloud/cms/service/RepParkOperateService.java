package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.RepParkOperateCountParams;
import com.park.cloud.common.domain.params.cms.RepParkOperateParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.RepParkOperatePageVO;
import com.park.cloud.common.domain.vo.cms.RepParkOperateVO;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public interface RepParkOperateService {


    //查询上方统计数据
    CommonResult<RepParkOperateVO> dealStatistics(RepParkOperateCountParams params);

    CommonResult<PageHelperVO<RepParkOperatePageVO>> getRepBerthUse(RepParkOperateParams params);
}
