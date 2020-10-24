package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserTeamBerthVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserTeamListVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserTeamVO;

import java.util.List;

/**
 * SysPdaUserTeamService
 * 中队管理服务
 *
 * @author zyj
 * @date 2020/2/25
 */
public interface SysPdaUserTeamService {

    /**
     * 中队列表查询
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<SysPdaUserTeamVO>> search(SysPdaUserTeamSearchParams param);

    /**
     * 添加中队
     * @param param
     * @return
     */
    CommonResult add(SysPdaUserTeamAddParams param);

    /**
     * 更新中队
     * @param param
     * @return
     */
    CommonResult update(SysPdaUserTeamUpdateParams param);

    /**
     * 中队详情
     * @param param
     * @return
     */
    CommonResult<SysPdaUserTeamVO> detail(SysPdaUserTeamDetailParams param);

    /**
     * 删除中队
     * @param param
     * @return
     */
    CommonResult delete(SysPdaUserTeamDeleteParams param);

    /**
     * 中队列表，用于下拉框
     * @param param
     * @return
     */
    CommonResult<List<SysPdaUserTeamListVO>> list(SysPdaUserTeamListParams param);

    CommonResult<List<SysPdaUserTeamBerthVO>> getBerth(SysPdaUserTeamBerthParams param);

    CommonResult setBerth(SysPdaUserTeamBerthParams param);
}