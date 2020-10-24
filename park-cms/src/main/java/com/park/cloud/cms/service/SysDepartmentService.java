package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysDepartmentListVO;
import com.park.cloud.common.domain.vo.cms.SysDepartmentVO;

import java.util.List;

/**
 * SysDepartmentService
 * 〈部门服务〉
 *
 * @author liyj
 * @create 2020/1/20
 * @since 1.0.0
 */
public interface SysDepartmentService {

    /**
     * 添加部门接口
     *
     * @param param
     * @return
     */
    CommonResult add(SysDepartmentAddParams param);

    /**
     * 更新部门接口
     *
     * @param param
     * @return
     */
    CommonResult update(SysDepartmentUpdateParams param);

    /**
     * 部门详情
     *
     * @param param
     * @return
     */
    CommonResult<SysDepartmentVO> detail(SysDepartmentDetailParams param);

    /**
     * 部门删除接口
     *
     * @param param
     * @return
     */
    CommonResult delete(SysDepartmentDeleteParams param);

    /**
     * 搜索部门接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<SysDepartmentVO>> search(SysDepartmentSearchParams param);

    /**
     * 部门列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    CommonResult<List<SysDepartmentListVO>> list(SysDepartmentListParams param);
}