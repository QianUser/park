package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.params.cms.MebUserDataListParams;
import com.park.cloud.common.domain.params.cms.MebUserDataMonthParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.MebUserDataMonthVO;
import com.park.cloud.common.domain.vo.cms.MebUserDataVO;

/**
 * SysUserDataService
 * 用户报表服务
 *
 * @author zyj
 * @date 2020/3/17
 */
public interface MebUserDataService {

    CommonResult<PageHelperVO<MebUserDataVO>> list(MebUserDataListParams param);

    /**
     * 获取用户数
     * @param param
     * @return
     */
    CommonResult<MebUserDataVO> count(CmsBaseParams param);

    /**
     * 一个月的用户数
     * @param param
     * @return
     */
    CommonResult<MebUserDataMonthVO> selectUserDataMonth(MebUserDataMonthParams param);
}