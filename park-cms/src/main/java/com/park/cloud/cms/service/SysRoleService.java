package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPageListVO;
import com.park.cloud.common.domain.vo.cms.SysPageVO;
import com.park.cloud.common.domain.vo.cms.SysRoleListVO;
import com.park.cloud.common.domain.vo.cms.SysRoleVO;

import java.util.List;

/**
 * SysRoleService
 * 〈角色服务〉
 *
 * @author liyj1
 * @create 2020/2/1
 * @since 1.0.0
 */
public interface SysRoleService {

    /**
     * 添加角色接口
     *
     * @param param
     * @return
     */
    CommonResult add(SysRoleAddParams param);

    /**
     * 更新角色接口
     *
     * @param param
     * @return
     */
    CommonResult update(SysRoleUpdateParams param);

    /**
     * 角色删除接口
     *
     * @param param
     * @return
     */
    CommonResult delete(SysRoleDeleteParams param);

    /**
     * 搜索角色接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<SysRoleVO>> search(SysRoleSearchParams param);

    /**
     * 角色列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    CommonResult<List<SysRoleListVO>> list(SysRoleListParams param);

    /**
     * 菜单页面列表接口,返回所有可设置权限的菜单页面
     *
     * @return
     */
    CommonResult<List<SysPageListVO>> allPages();

    /**
     * 获取该角色下所有的页面
     *
     * @param roleId
     * @return
     */
    List<SysPageVO> getRolePages(Integer roleId);

}