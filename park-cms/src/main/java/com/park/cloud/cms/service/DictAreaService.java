package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictAreaListVO;
import com.park.cloud.common.domain.vo.cms.DictAreaVO;

import java.util.List;

/**
 * DictAreaService
 * 〈片区服务〉
 *
 * @author liyj1
 * @create 2020/1/31
 * @since 1.0.0
 */
public interface DictAreaService {

    /**
     * 添加片区接口
     *
     * @param param
     * @return
     */
    CommonResult add(DictAreaAddParams param);

    /**
     * 更新片区接口
     *
     * @param param
     * @return
     */
    CommonResult update(DictAreaUpdateParams param);

    /**
     * 片区详情
     *
     * @param param
     * @return
     */
    CommonResult<DictAreaVO> detail(DictAreaDetailParams param);

    /**
     * 片区删除接口
     *
     * @param param
     * @return
     */
    CommonResult delete(DictAreaDeleteParams param);

    /**
     * 搜索片区接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<DictAreaVO>> search(DictAreaSearchParams param);

    /**
     * 片区列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    CommonResult<List<DictAreaListVO>> list(DictAreaListParams param);
}