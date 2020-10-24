package com.park.cloud.cms.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.SysAreaAssPOMapper;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.constant.RedisKeyConstants;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.CmsBaseDto;
import com.park.cloud.common.domain.dto.cms.SysAreaAssDto;
import com.park.cloud.common.domain.params.cms.SysAreaAssSearchParams;
import com.park.cloud.common.domain.params.cms.SysAreaAssUpdateParams;
import com.park.cloud.common.domain.po.sys.SysAreaAssPO;
import com.park.cloud.common.domain.po.sys.SysAreaAssPOExample;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysAreaAssCacheVO;
import com.park.cloud.common.domain.vo.cms.SysAreaAssVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * 用户辖区分配服务
 *
 * @author liyj1
 * @create 2020/2/1
 * @since 1.0.0
 */
@Service
@Slf4j
public class SysAreaAssServiceImpl implements SysAreaAssService {

    @Autowired
    SysAreaAssPOMapper sysAreaAssPOMapper;

    @Autowired
    @Qualifier("customRedisTemplate")
    private RedisTemplate redisTemplate;

    /**
     * 更新用户辖区接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(SysAreaAssUpdateParams param) {
        SysAreaAssPO po = new SysAreaAssPO();
        BeanUtils.copyProperties(param, po);

        //查找用户辖区数据
        SysAreaAssPOExample example = new SysAreaAssPOExample();
        example.createCriteria().andUserIdEqualTo(param.getUserId());
        if (sysAreaAssPOMapper.countByExample(example) > 0) {
            //更新
            sysAreaAssPOMapper.updateByExampleSelective(po, example);
        } else {
            //新增
            po.setAddTime(new Date());
            po.setAddUser(param.getLoginSysUserId());
            sysAreaAssPOMapper.insertSelective(po);
        }

        //缓存数据
        this.updateUserAreaAssCache(param.getUserId());
        return CommonResult.success();
    }

    /**
     * 搜索用户辖区接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<SysAreaAssVO>> search(SysAreaAssSearchParams param) {
        SysAreaAssDto dto = new SysAreaAssDto();
        BeanUtils.copyProperties(param, dto);
        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<SysAreaAssVO> resultList = sysAreaAssPOMapper.selectByDto(dto);
        PageInfo<SysAreaAssVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<SysAreaAssVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    /**
     * 获取用户辖区信息
     *
     * @param userId
     * @return
     */
    @Override
    public SysAreaAssCacheVO getUserAreaAss(Integer userId) {
        String cacheValue = (String) redisTemplate.opsForHash().get(RedisKeyConstants.BACK_SYS_AREA_ASS_KEY, String.valueOf(userId));
        if (StringUtils.isEmpty(cacheValue)) {
            //缓存数据
            SysAreaAssCacheVO cacheVO = this.updateUserAreaAssCache(userId);
            return cacheVO;
        }
        SysAreaAssCacheVO cacheVO = JSONObject.parseObject(cacheValue, SysAreaAssCacheVO.class);
        return cacheVO;
    }

    /**
     * 设置用户辖区信息
     *
     * @param userId
     * @param dto
     * @return
     */
    @Override
    public void setAreaAssInfo(Integer userId, CmsBaseDto dto) {
        SysAreaAssCacheVO cacheVO = this.getUserAreaAss(userId);
        if(cacheVO != null) {
            dto.setLoginUserAreaAssType(cacheVO.getAreaAssType());
            dto.setLoginUserAreaIds(cacheVO.getAreaIds());
            dto.setLoginUserCantonIds(cacheVO.getCantonIds());
            dto.setLoginUserCityIds(cacheVO.getCityIds());
        }
    }

    /**
     * 更新用户辖区缓存
     *
     * @param userId
     * @return
     */
    private SysAreaAssCacheVO updateUserAreaAssCache(Integer userId) {
        SysAreaAssPOExample example = new SysAreaAssPOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<SysAreaAssPO> poList = sysAreaAssPOMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(poList)) {
            return null;
        }
        SysAreaAssPO po = poList.get(0);
        //缓存数据
        SysAreaAssCacheVO cacheVO = new SysAreaAssCacheVO();
        BeanUtils.copyProperties(po, cacheVO);
        redisTemplate.opsForHash().put(RedisKeyConstants.BACK_SYS_AREA_ASS_KEY
                , String.valueOf(userId), JSONObject.toJSONString(cacheVO));
        return cacheVO;
    }

}