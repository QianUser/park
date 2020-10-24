package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPositionListVO;
import com.park.cloud.common.domain.vo.cms.SysPositionVO;

import java.util.List;

/**
 * SysPositionService
 * 〈职位信息〉
 *
 * @author liyj
 * @create 2020/1/20
 * @since 1.0.0
 */
public interface SysPositionService {

    /**
     * 添加职位接口
     *
     * @param param
     * @return
     */
    CommonResult add(SysPositionAddParams param);

    /**
     * 更新职位接口
     *
     * @param param
     * @return
     */
    CommonResult update(SysPositionUpdateParams param);

    /**
     * 职位详情
     *
     * @param param
     * @return
     */
    CommonResult<SysPositionVO> detail(SysPositionDetailParams param);

    /**
     * 职位删除接口
     *
     * @param param
     * @return
     */
    CommonResult delete(SysPositionDeleteParams param);

    /**
     * 搜索职位接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<SysPositionVO>> search(SysPositionSearchParams param);

    /**
     * 职位列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    CommonResult<List<SysPositionListVO>> list(SysPositionListParams param);
}