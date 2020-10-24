package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.DictCityCodeListParams;
import com.park.cloud.common.domain.vo.cms.DictCityCodeListVO;

import java.util.List;

/**
 * DictCityCodeService
 * 〈城市编码服务〉
 *
 * @author liyj1
 * @create 2020/1/31
 * @since 1.0.0
 */
public interface DictCityCodeService {

    /**
     * 返回全国省市行政区列表数据
     *
     * @param param
     * @return
     */
    CommonResult<List<DictCityCodeListVO>> list(DictCityCodeListParams param);
}