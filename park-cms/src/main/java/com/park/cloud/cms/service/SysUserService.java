package com.park.cloud.cms.service;

import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysUserLoginVO;
import com.park.cloud.common.domain.vo.cms.SysUserVO;

/**
 * SysUserService
 * 〈CMS用户服务〉
 *
 * @author liyj
 * @create 2020/1/14
 * @since 1.0.0
 */
public interface SysUserService {

    /**
     * 用户登录，生成认证token
     * @param params
     * @return
     */
    CommonResult<SysUserLoginVO> login(SysUserLoginParams params);

    /**
     * 验证用户登录token，并返回用户ID
     * @param userToken
     * @return
     */
    Integer getUserIdByUserToken(String userToken);

    /**
     * 登录用户修改本账号的登录密码
     * @param param
     * @return
     */
    CommonResult updatePwd(SysUserUpdatePwdParams param);

    /**
     * 登录用户修改本账号的个人信息
     * @param param
     * @return
     */
    CommonResult updatePersonalInfo(SysUserUpdatePersonalInfoParams param);

    /**
     * 登录用户退出当前账号
     * @param param
     * @return
     */
    CommonResult logout(CmsBaseParams param);


    /**
     * 添加人员接口
     *
     * @param param
     * @return
     */
    CommonResult add(SysUserAddParams param);

    /**
     * 更新人员接口
     *
     * @param param
     * @return
     */
    CommonResult update(SysUserUpdateParams param);

    /**
     * 人员详情
     *
     * @param param
     * @return
     */
    CommonResult<SysUserVO> detail(SysUserDetailParams param);

    /**
     * 人员删除接口
     *
     * @param param
     * @return
     */
    CommonResult delete(SysUserDeleteParams param);

    /**
     * 搜索人员接口
     *
     * @param param
     * @return
     */
    CommonResult<PageHelperVO<SysUserVO>> search(SysUserSearchParams param);

}