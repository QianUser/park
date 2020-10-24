package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.CmsBaseDto;
import com.park.cloud.common.domain.params.cms.SysAreaAssSearchParams;
import com.park.cloud.common.domain.params.cms.SysAreaAssUpdateParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysAreaAssCacheVO;
import com.park.cloud.common.domain.vo.cms.SysAreaAssVO;

/**
 * SysAreaAssService
 * 〈用户辖区分配服务〉
 *
 * @author liyj1
 * @create 2020/2/1
 * @since 1.0.0
 */
public interface SysAreaAssService {

    /**
     * 更新用户辖区接口
     *
     * @param param
     * @return
     */
    CommonResult update(SysAreaAssUpdateParams param);

    /**
     * 搜索用户辖区接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<SysAreaAssVO>> search(SysAreaAssSearchParams param);

    /**
     * 获取用户辖区信息
     *
     * @param userId
     * @return
     */
    SysAreaAssCacheVO getUserAreaAss(Integer userId);

    /**
     * 设置用户辖区信息
     *
     * @param userId
     * @return
     */
    void setAreaAssInfo(Integer userId, CmsBaseDto dto);
}