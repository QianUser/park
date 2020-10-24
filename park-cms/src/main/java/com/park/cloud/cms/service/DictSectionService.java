package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.IdParams;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictCityListWithChildVO;
import com.park.cloud.common.domain.vo.cms.DictSectionListVO;
import com.park.cloud.common.domain.vo.cms.DictSectionVO;
import com.park.cloud.common.domain.vo.cms.FindSectionAndParkVO;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * DictSectionService
 * 〈路段服务〉
 *
 * @author liyj
 * @create 2020/1/21
 * @since 1.0.0
 */
public interface DictSectionService {

    /**
     * 添加路段接口
     *
     * @param param
     * @return
     */
    CommonResult add(DictSectionAddParams param);

    /**
     * 更新路段接口
     *
     * @param param
     * @return
     */
    CommonResult update(DictSectionUpdateParams param);

    /**
     * 路段详情
     *
     * @param param
     * @return
     */
    CommonResult<DictSectionVO> detail(DictSectionDetailParams param);

    /**
     * 路段删除接口
     *
     * @param param
     * @return
     */
    CommonResult delete(DictSectionDeleteParams param);

    /**
     * 搜索路段接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<DictSectionVO>> search(DictSectionSearchParams param);

    /**
     * 路段列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    CommonResult<List<DictSectionListVO>> list(DictSectionListParams param);

    /**
     * 路段列表接口,带有城市、行政区、片区的上下级关系
     *
     * @param param
     * @return
     */
    CommonResult<List<DictCityListWithChildVO>> listWithParent(DictSectionListParams param);
  /**
   * @Description:查询街道和停车场名称(类型)
   * @Author: liangshuang
   * @Date: 2020/3/12 9:13
   * @param param
   com.park.cloud.common.domain.CommonResult<com.park.cloud.common.domain.vo.cms.FindSectionAndParkVO>
   **/

    CommonResult<List<FindSectionAndParkVO>> listSectionAndPark(CmsBaseParams param);

    CommonResult<List<DictSectionVO>> listByIds( IdParams param);
}