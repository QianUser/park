package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.SysPdaUserSignListParams;
import com.park.cloud.common.domain.params.cms.SysPdaUserSignSearchParams;
import com.park.cloud.common.domain.po.sys.SysPdaUserSignPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserSignListVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserSignVO;

import java.util.List;

/**
 * SysPdaUserSignService
 * 签到信息服务
 *
 * @author zyj
 * @date 2020/2/25
 */
public interface SysPdaUserSignService {

    /**
     * 签到列表查询
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<SysPdaUserSignVO>> search(SysPdaUserSignSearchParams param);


    CommonResult<List<SysPdaUserSignListVO>> list(SysPdaUserSignListParams param);

    List<SysPdaUserSignPO> allList(SysPdaUserSignSearchParams param);
}