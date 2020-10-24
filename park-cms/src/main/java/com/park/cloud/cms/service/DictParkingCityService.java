package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictCityListWithChildVO;
import com.park.cloud.common.domain.vo.cms.DictParkingCityListVO;
import com.park.cloud.common.domain.vo.cms.DictParkingCityVO;

import java.util.List;

/**
 * DictParkingCityService
 * 〈停车场服务〉
 *
 * @author liyj
 * @create 2020/1/22
 * @since 1.0.0
 */
public interface DictParkingCityService {

    /**
     * 添加停车场接口
     */
    CommonResult<Object> add(DictParkingCityAddParams param);

    /**
     * 更新停车场接口
     *
     * @param param
     * @return
     */
    CommonResult update(DictParkingCityUpdateParams param);

    /**
     * 停车场详情
     *
     * @param param
     * @return
     */
    CommonResult<DictParkingCityVO> detail(DictParkingCityDetailParams param);

    /**
     * 搜索停车场接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<DictParkingCityVO>> search(DictParkingCitySearchParams param);

    /**
     * 停车场列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    CommonResult<List<DictParkingCityListVO>> list(DictParkingCityListParams param);

    /**
     * 停车场列表接口,带有城市、行政区、片区的上下级关系
     *
     * @param param
     * @return
     */
    CommonResult<List<DictCityListWithChildVO>> listWithParent(DictParkingCityListParams param);

    CommonResult<List<DictParkingCityVO>> listByIds(IdParams params);
}