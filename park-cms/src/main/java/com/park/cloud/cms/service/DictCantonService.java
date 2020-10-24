package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictCantonListVO;
import com.park.cloud.common.domain.vo.cms.DictCantonVO;

import java.util.List;

/**
 * DictCantonService
 * 〈行政区服务〉
 *
 * @author liyj1
 * @create 2020/1/31
 * @since 1.0.0
 */
public interface DictCantonService {

    /**
     * 添加行政区接口
     *
     * @param param
     * @return
     */
    CommonResult add(DictCantonAddParams param);

    /**
     * 更新行政区接口
     *
     * @param param
     * @return
     */
    CommonResult update(DictCantonUpdateParams param);

    /**
     * 行政区详情
     *
     * @param param
     * @return
     */
    CommonResult<DictCantonVO> detail(DictCantonDetailParams param);

    /**
     * 行政区删除接口
     *
     * @param param
     * @return
     */
    CommonResult delete(DictCantonDeleteParams param);

    /**
     * 搜索行政区接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<DictCantonVO>> search(DictCantonSearchParams param);

    /**
     * 行政区列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    CommonResult<List<DictCantonListVO>> list(DictCantonListParams param);
}