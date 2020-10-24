package com.park.cloud.cms.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.SysPagePOMapper;
import com.park.cloud.cms.mapper.SysRolePOMapper;
import com.park.cloud.cms.mapper.SysUserPOMapper;
import com.park.cloud.cms.service.SysRoleService;
import com.park.cloud.common.constant.RedisKeyConstants;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.SysRoleDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.sys.SysPagePO;
import com.park.cloud.common.domain.po.sys.SysPagePOExample;
import com.park.cloud.common.domain.po.sys.SysRolePO;
import com.park.cloud.common.domain.po.sys.SysUserPOExample;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPageListVO;
import com.park.cloud.common.domain.vo.cms.SysPageVO;
import com.park.cloud.common.domain.vo.cms.SysRoleListVO;
import com.park.cloud.common.domain.vo.cms.SysRoleVO;
import com.park.cloud.common.util.ApiStringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * 角色服务
 *
 * @author liyj1
 * @create 2020/2/1
 * @since 1.0.0
 */
@Service
@Slf4j
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    SysRolePOMapper sysRolePOMapper;

    @Autowired
    SysUserPOMapper userPOMapper;

    @Autowired
    SysPagePOMapper pagePOMapper;

    @Autowired
    @Qualifier("customRedisTemplate")
    private RedisTemplate redisTemplate;

    /**
     * 添加角色接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult add(SysRoleAddParams param) {
        SysRolePO po = new SysRolePO();
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setAddUser(param.getLoginSysUserId());
        po.setRoleStatus(1);
        sysRolePOMapper.insertSelective(po);

        //缓存数据
        this.updateRolePagesCache(po.getRoleId());
        return CommonResult.success();
    }

    /**
     * 更新角色接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(SysRoleUpdateParams param) {
        SysRolePO po = new SysRolePO();
        BeanUtils.copyProperties(param, po);
        sysRolePOMapper.updateByPrimaryKeySelective(po);

        //缓存数据
        this.updateRolePagesCache(po.getRoleId());
        return CommonResult.success();
    }

    /**
     * 角色删除接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult delete(SysRoleDeleteParams param) {
        //检查角色下的用户
        SysUserPOExample userPOExample = new SysUserPOExample();
        userPOExample.createCriteria().andRoleIdEqualTo(param.getRoleId());
        if (userPOMapper.countByExample(userPOExample) > 0) {
            return CommonResult.failed("该角色下有人员，不能删除");
        }

        sysRolePOMapper.deleteByPrimaryKey(param.getRoleId());

        //删除缓存
        this.deleteRolePagesCache(param.getRoleId());
        return CommonResult.success();
    }

    /**
     * 搜索角色接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<SysRoleVO>> search(SysRoleSearchParams param) {
        SysRoleDto dto = new SysRoleDto();
        BeanUtils.copyProperties(param, dto);
        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<SysRoleVO> resultList = sysRolePOMapper.selectByDto(dto);
        PageInfo<SysRoleVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<SysRoleVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    /**
     * 角色列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<List<SysRoleListVO>> list(SysRoleListParams param) {
        SysRoleDto dto = new SysRoleDto();
        BeanUtils.copyProperties(param, dto);
        List<SysRoleListVO> resultList = sysRolePOMapper.selectListByDto(dto);
        return CommonResult.success(resultList);
    }

    /**
     * 菜单页面列表接口,返回所有可设置权限的菜单页面
     *
     * @return
     */
    @Override
    public CommonResult<List<SysPageListVO>> allPages() {
        SysPagePOExample example = new SysPagePOExample();
        example.createCriteria();
        example.setOrderByClause("page_level,parent_id,page_sort");

        List<SysPagePO> pageList = pagePOMapper.selectByExample(example);
        Integer basePageId = 0;
        Map<Integer, SysPageListVO> pageListMap = new HashMap<>();
        for (SysPagePO pagePO : pageList) {
            Integer parentId = pagePO.getParentId();
            if (parentId == null) {
                parentId = basePageId;
            }

            //获取上层page
            SysPageListVO parentPageListVO;
            if (!pageListMap.containsKey(parentId)) {
                parentPageListVO = new SysPageListVO();
                pageListMap.put(parentId, parentPageListVO);
            } else {
                parentPageListVO = pageListMap.get(parentId);
            }
            List<SysPageListVO> subPages = parentPageListVO.getSubPages();
            if(subPages == null) {
                subPages = new ArrayList<>();
                parentPageListVO.setSubPages(subPages);
            }

            //查看当前page
            SysPageListVO subPage;
            if (!pageListMap.containsKey(pagePO.getPageId())) {
                subPage = new SysPageListVO();
            } else {
                subPage = pageListMap.get(pagePO.getPageId());
            }
            BeanUtils.copyProperties(pagePO, subPage);
            subPages.add(subPage);
            pageListMap.put(subPage.getPageId(), subPage);
        }

        SysPageListVO base = pageListMap.get(basePageId);

        return CommonResult.success(base.getSubPages());
    }

    /**
     * 获取该角色下所有的页面
     *
     * @param roleId
     * @return
     */
    @Override
    public List<SysPageVO> getRolePages(Integer roleId) {

        //查看缓存
        List<SysPageVO> cacheValue = this.getRolePagesCache(roleId);
        if(cacheValue != null) {
            return cacheValue;
        }

        //缓存数据
        List<SysPageVO> resultList = this.updateRolePagesCache(roleId);

        return resultList;
    }


    /**
     * 添加角色页面缓存
     * @param roleId
     */
    private List<SysPageVO> updateRolePagesCache(Integer roleId) {
        if(roleId == null) {
            return null;
        }
        SysRolePO po = sysRolePOMapper.selectByPrimaryKey(roleId);
        if(po == null || po.getRoleStatus() == 0 || StringUtils.isEmpty(po.getPageIds())) {
            this.deleteRolePagesCache(roleId);
            return null;
        }

        List<Integer> pageIdList = ApiStringUtil.toIdList(po.getPageIds());
        SysPagePOExample pagePOExample = new SysPagePOExample();
        pagePOExample.createCriteria().andPageIdIn(pageIdList);
        List<SysPagePO> sysPagePOS = pagePOMapper.selectByExample(pagePOExample);
        List<SysPageVO> resultList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(sysPagePOS)) {
            for(SysPagePO sysPagePO : sysPagePOS) {
                SysPageVO vo = new SysPageVO();
                BeanUtils.copyProperties(sysPagePO, vo);
                resultList.add(vo);
            }
        }

        String cacheKey = RedisKeyConstants.BACK_AUTHORITY_PAGES_KEY;
        redisTemplate.opsForHash().put(cacheKey, String.valueOf(roleId), JSONObject.toJSONString(resultList));
        return resultList;
    }

    /**
     * 获取权限页面缓存
     * @param roleId
     * @return
     */
    private List<SysPageVO> getRolePagesCache(Integer roleId) {
        String cacheKey = RedisKeyConstants.BACK_AUTHORITY_PAGES_KEY;
        //查看缓存
        Object cacheValue = redisTemplate.opsForHash().get(cacheKey, String.valueOf(roleId));
        log.info("getRolePagesCache:cacheKey={},roleId={},cacheValue={}", cacheKey, roleId, cacheValue);
        String cacheStr = String.valueOf(cacheValue);
        if(cacheValue != null && !StringUtils.isEmpty(cacheStr)) {
            return JSONObject.parseArray(cacheStr, SysPageVO.class);
        }
        return null;
    }

    /**
     * 删除权限页面缓存
     * @param roleId
     */
    private void deleteRolePagesCache(Integer roleId) {
        String cacheKey = RedisKeyConstants.BACK_AUTHORITY_PAGES_KEY;
        redisTemplate.opsForHash().delete(cacheKey, String.valueOf(roleId));
    }

}