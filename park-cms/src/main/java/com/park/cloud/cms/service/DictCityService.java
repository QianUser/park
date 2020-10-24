package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictCityListVO;
import com.park.cloud.common.domain.vo.cms.DictCityVO;

import java.util.List;

/**
 * DictCityService
 * 〈城市服务〉
 *
 * @author liyj1
 * @create 2020/1/31
 * @since 1.0.0
 */
public interface DictCityService {

    /**
     * 添加城市接口
     *
     * @param param
     * @return
     */
    CommonResult add(DictCityAddParams param);

    /**
     * 更新城市接口
     *
     * @param param
     * @return
     */
    CommonResult update(DictCityUpdateParams param);

    /**
     * 城市详情
     *
     * @param param
     * @return
     */
    CommonResult<DictCityVO> detail(DictCityDetailParams param);

    /**
     * 城市删除接口
     *
     * @param param
     * @return
     */
    CommonResult delete(DictCityDeleteParams param);

    /**
     * 搜索城市接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<DictCityVO>> search(DictCitySearchParams param);

    /**
     * 城市列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    CommonResult<List<DictCityListVO>> list(DictCityListParams param);
}