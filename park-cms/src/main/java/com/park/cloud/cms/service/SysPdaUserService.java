package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.sys.SysPdaUserPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserListVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserVO;

import java.util.List;

/**
 * SysPdaUserService
 * 巡检员管理服务
 *
 * @author zyj
 * @date 2020/2/25
 */
public interface SysPdaUserService {

    /**
     * 巡检员列表查询
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<SysPdaUserVO>> search(SysPdaUserSearchParams param);

    /**
     * 添加巡检员
     * @param param
     * @return
     */
    CommonResult add(SysPdaUserAddParams param);

    /**
     * 更新巡检员
     * @param param
     * @return
     */
    CommonResult update(SysPdaUserUpdateParams param);

    /**
     * 巡检员详情
     * @param param
     * @return
     */
    CommonResult<SysPdaUserVO> detail(SysPdaUserDetailParams param);

    /**
     * 删除巡检员
     * @param param
     * @return
     */
    CommonResult delete(SysPdaUserDeleteParams param);

    CommonResult<List<SysPdaUserListVO>> list(SysPdaUserListParams param);

    List<SysPdaUserPO> allList(SysPdaUserSearchParams params);
}