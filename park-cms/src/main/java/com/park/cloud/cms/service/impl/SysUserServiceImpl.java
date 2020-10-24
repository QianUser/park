package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.config.SysRoleUtil;
import com.park.cloud.cms.mapper.SysRolePOMapper;
import com.park.cloud.cms.mapper.SysUserPOMapper;
import com.park.cloud.cms.service.SysRoleService;
import com.park.cloud.cms.service.SysUserService;
import com.park.cloud.common.constant.Constants;
import com.park.cloud.common.constant.RedisKeyConstants;
import com.park.cloud.common.domain.CommonHeaderInfo;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.CommonRuntimeException;
import com.park.cloud.common.domain.dto.cms.SysUserDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.sys.SysRolePO;
import com.park.cloud.common.domain.po.sys.SysUserPO;
import com.park.cloud.common.domain.po.sys.SysUserPOExample;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysUserLoginVO;
import com.park.cloud.common.domain.vo.cms.SysUserVO;
import com.park.cloud.common.util.CommonHeaderInfoUtil;
import com.park.cloud.common.util.MD5;
import com.park.cloud.common.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * CMS用户服务
 *
 * @author liyj
 * @create 2020/1/14
 * @since 1.0.0
 */
@Service
@Slf4j
public class SysUserServiceImpl implements SysUserService {


    @Autowired
    @Qualifier("customRedisTemplate")
    private RedisTemplate redisTemplate;

    @Autowired
    SysUserPOMapper sysUserPOMapper;

    @Autowired
    SysRolePOMapper sysRolePOMapper;

    @Autowired
    SysRoleService sysRoleService;


    /**
     * 用户登录，生成认证token
     *
     * @param params
     * @return
     */
    @Override
    public CommonResult<SysUserLoginVO> login(SysUserLoginParams params) {
        String userName = params.getUserName();
        SysUserPO userPO = this.getByUserName(userName);
        if (userPO == null) {
            return CommonResult.failed(-1001, "密码错误或账号不存在");
        }
        if (userPO.getUserStatus() == null || userPO.getUserStatus() != 1) {
            return CommonResult.failed("登录失败，账户已停用");
        }
        //检查密码
        this.checkPwd(userPO.getUserPwd(), params.getUserPwd());

        SysUserLoginVO userVO = new SysUserLoginVO();
        BeanUtils.copyProperties(userPO, userVO);
        userVO.setUserToken(this.generateUserToken(userPO));

        //查询该用户可使用的页面列表
        Integer roleId = userPO.getRoleId();
        if(roleId != null && roleId != 0) {
            SysRolePO rolePO = sysRolePOMapper.selectByPrimaryKey(roleId);
            if(rolePO != null) {
                userVO.setMenuContent(rolePO.getMenuContent());
            }
//            userVO.setPages(sysRoleService.getRolePages(roleId));
        }

        return CommonResult.success(userVO);
    }

    /**
     * 验证用户登录token，并返回用户ID
     *
     * @param userToken
     * @return
     */
    @Override
    public Integer getUserIdByUserToken(String userToken) {
        if (StringUtils.isEmpty(userToken)) {
            return null;
        }
        String dbCacheKey = RedisKeyConstants.BACK_USER_TOKEN_KEY + userToken;
        Integer userId = (Integer) redisTemplate.opsForValue().get(dbCacheKey);

        return userId;
    }

    /**
     * 登录用户修改本账号的登录密码
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult updatePwd(SysUserUpdatePwdParams param) {
        SysUserPO userPO = sysUserPOMapper.selectByPrimaryKey(param.getLoginSysUserId());

        //检查旧的密码
        this.checkPwd(userPO.getUserPwd(), param.getUserPwdOld());

        SysUserPO updatePO = new SysUserPO();
        updatePO.setUserId(param.getLoginSysUserId());
        updatePO.setUserPwd(param.getUserPwd());

        sysUserPOMapper.updateByPrimaryKeySelective(updatePO);
        return CommonResult.success();
    }

    /**
     * 登录用户修改本账号的个人信息
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult updatePersonalInfo(SysUserUpdatePersonalInfoParams param) {
        SysUserPO updatePO = new SysUserPO();
        BeanUtils.copyProperties(param, updatePO);
        updatePO.setUserId(param.getLoginSysUserId());

        sysUserPOMapper.updateByPrimaryKeySelective(updatePO);
        return CommonResult.success();
    }

    /**
     * 登录用户退出当前账号
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult logout(CmsBaseParams param) {
        CommonHeaderInfo headerInfo = CommonHeaderInfoUtil.getInfo();
        if (headerInfo == null) {
            return CommonResult.success();
        }
        String dbCacheKey = RedisKeyConstants.BACK_USER_TOKEN_KEY + headerInfo.getTk();
        redisTemplate.delete(dbCacheKey);
        return CommonResult.success();
    }


    /**
     * 添加人员接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult add(SysUserAddParams param) {

//        if(Objects.isNull(param.getLoginSysUserId())){
//            return CommonResult.failed("当前登录用户信息为空！");
//        }
//        SysUserPO sysUserPO = sysUserPOMapper.selectByPrimaryKey(param.getLoginSysUserId());
//        if(Objects.isNull(sysUserPO)){
//            return CommonResult.failed("该用户无权限创建人员！");
//        }
//
//        //roleId为0 的是超级管理员
//        if(sysUserPO.getRoleId()!=0){
//            SysRolePO sysRolePO = sysRolePOMapper.selectByPrimaryKey(sysUserPO.getRoleId());
//            if(Objects.isNull(sysRolePO)){
//                return CommonResult.failed("该用户无权限创建人员！");
//            }
//            String menuContent = sysRolePO.getMenuContent();
//            if(StringUtils.isBlank(menuContent) || !menuContent.contains("人员管理")){
//                return CommonResult.failed("该用户无权限创建人员！");
//            }
//        }

        CommonResult result = SysRoleUtil.chekAuthority(param.getLoginSysUserId(), "人员管理");
        if(result.getCode()==Constants.ERROR_CODE){
            return result;
        }

        this.checkUserName(param.getUserName(), null);

        SysUserPO po = new SysUserPO();
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setAddUser(param.getLoginSysUserId());
        po.setUserStatus(1);
        sysUserPOMapper.insertSelective(po);
        return CommonResult.success();
    }


    /**
     * 更新人员接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(SysUserUpdateParams param) {
        this.checkUserName(param.getUserName(), param.getUserId());

        SysUserPO po = new SysUserPO();
        BeanUtils.copyProperties(param, po);
        sysUserPOMapper.updateByPrimaryKeySelective(po);
        return CommonResult.success();
    }

    /**
     * 人员详情
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<SysUserVO> detail(SysUserDetailParams param) {
        SysUserPO po = sysUserPOMapper.selectByPrimaryKey(param.getUserId());
        if (po == null) {
            return CommonResult.failed("数据不存在");
        }
        SysUserVO vo = new SysUserVO();
        BeanUtils.copyProperties(po, vo);
        return CommonResult.success(vo);
    }

    /**
     * 人员删除接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult delete(SysUserDeleteParams param) {
        sysUserPOMapper.deleteByPrimaryKey(param.getUserId());
        return CommonResult.success();
    }

    /**
     * 搜索人员接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<SysUserVO>> search(SysUserSearchParams param) {
        SysUserDto dto = new SysUserDto();
        BeanUtils.copyProperties(param, dto);
        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<SysUserVO> resultList = sysUserPOMapper.selectByDto(dto);
        PageInfo<SysUserVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<SysUserVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    /**
     * 生成登录token
     *
     * @param userPO
     * @return
     */
    private String generateUserToken(SysUserPO userPO) {
        String tokenCode = RandomUtil.getTokenCode();
        String userToken = MD5.MD5Lower(userPO.getUserId() + Constants.CHAR_AT + tokenCode);
        // String memCacheKey = userToken + "_UserId";
        String dbCacheKey = RedisKeyConstants.BACK_USER_TOKEN_KEY + userToken;
        redisTemplate.opsForValue().set(dbCacheKey, userPO.getUserId(), 30, TimeUnit.DAYS);
        return userToken;
    }

    /**
     * 根据用户名获取用户信息
     *
     * @param userName
     * @return
     */
    private SysUserPO getByUserName(String userName) {
        SysUserPOExample example = new SysUserPOExample();
        example.createCriteria().andUserNameEqualTo(userName);
        List<SysUserPO> result = sysUserPOMapper.selectByExample(example);
        if (result == null || result.isEmpty()) {
            return null;
        }

        return result.get(0);
    }

    /**
     * 检查用户名是否存在
     *
     * @param userName
     * @param userId
     * @return
     */
    private void checkUserName(String userName, Integer userId) {
        SysUserPOExample example = new SysUserPOExample();
        SysUserPOExample.Criteria criteria = example.createCriteria().andUserNameEqualTo(userName);
        if (userId != null) {
            criteria.andUserIdNotEqualTo(userId);
        }
        if (sysUserPOMapper.countByExample(example) > 0) {
            throw new CommonRuntimeException("用户名重复");
        }
    }

    /**
     * 检查用户数据库中的密码和接口输入的MD5密码是否相同
     *
     * @param password
     * @param encodePwd
     * @return
     */
    private void checkPwd(String password, String encodePwd) {
        String md5Password = MD5.MD5Lower(password);
        log.info("login: pwd={}, bpwd={}, bpwdMd5={}", encodePwd, password, md5Password);
        if (!encodePwd.equalsIgnoreCase(md5Password)) {
            throw new CommonRuntimeException("密码错误或账号不存在", -1002);
        }
    }

}