package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.DictBerthCityAddParams;
import com.park.cloud.common.domain.params.cms.DictBerthCityDetailParams;
import com.park.cloud.common.domain.params.cms.DictBerthCitySearchParams;
import com.park.cloud.common.domain.params.cms.DictBerthCityUpdateParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictBerthCityVO;

/**
 * DictBerthCityService
 * 〈泊位服务〉
 *
 * @author liyj
 * @create 2020/1/22
 * @since 1.0.0
 */
public interface DictBerthCityService {

    /**
     * 添加泊位接口
     *
     * @param param
     * @return
     */
    CommonResult add(DictBerthCityAddParams param);

    /**
     * 更新泊位接口
     *
     * @param param
     * @return
     */
    CommonResult update(DictBerthCityUpdateParams param);

    /**
     * 泊位详情
     *
     * @param param
     * @return
     */
    CommonResult<DictBerthCityVO> detail(DictBerthCityDetailParams param);

    /**
     * 搜索泊位接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<DictBerthCityVO>> search(DictBerthCitySearchParams param);
}