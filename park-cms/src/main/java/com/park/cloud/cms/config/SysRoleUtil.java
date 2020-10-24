package com.park.cloud.cms.config;

import com.park.cloud.cms.mapper.SysRolePOMapper;
import com.park.cloud.cms.mapper.SysUserPOMapper;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.po.sys.SysRolePO;
import com.park.cloud.common.domain.po.sys.SysUserPO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Objects;

/**
 * <Description>
 *
 * @author liuhainan
 * @createDate 2020/06/20 16:25
 */
@Slf4j
@Component
public class SysRoleUtil {

    @Autowired
    SysUserPOMapper sysUserPOMapper;

    @Autowired
    SysRolePOMapper sysRolePOMapper;

    public static  SysRoleUtil sysRoleUtil;


    @PostConstruct
    public void init() {
        sysRoleUtil = this;
    }

    public static CommonResult chekAuthority(Integer loginSysUserId,String content){
        log.info("权限校验:loginSysUserId：{},content:{}",loginSysUserId,content);
        if(Objects.isNull(loginSysUserId)){
            return CommonResult.failed("登录用户id不能为空！");
        }
        if(Objects.isNull(content)){
            return CommonResult.failed("权限内容不能为空！");
        }
        SysUserPO sysUserPO = sysRoleUtil.sysUserPOMapper.selectByPrimaryKey(loginSysUserId);
        if(Objects.isNull(sysUserPO)){
            return CommonResult.failed("该用户没有"+content+"权限");
        }

        //roleId为0 的是超级管理员
        if(sysUserPO.getRoleId()!=0){
            SysRolePO sysRolePO = sysRoleUtil.sysRolePOMapper.selectByPrimaryKey(sysUserPO.getRoleId());
            if(Objects.isNull(sysRolePO)){
                return CommonResult.failed("该用户没有"+content+"权限");
            }
            String menuContent = sysRolePO.getMenuContent();
            if(StringUtils.isBlank(menuContent) || !menuContent.contains(content)){
                return CommonResult.failed("该用户没有"+content+"权限");
            }
        }
        return CommonResult.success(true);
    }

}
