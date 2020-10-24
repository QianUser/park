package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.SysPdaUserMapper;
import com.park.cloud.cms.service.SysPdaUserService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.SysPdaUserDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.sys.SysPdaUserPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserListVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 巡检员管理服务
 *
 * @author zyj
 * @date 2020/2/25
 */
@Service
@Slf4j
public class SysPdaUserServiceImpl implements SysPdaUserService {

    @Autowired
    SysPdaUserMapper sysPdaUserMapper;

    /**
     * 巡检员列表查询
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<SysPdaUserVO>> search(SysPdaUserSearchParams param) {
        try {
            //设置分页查询
            PageHelper.startPage(param.getPageNum(), param.getPageSize());

            SysPdaUserDto dto = new SysPdaUserDto();
            BeanUtils.copyProperties(param, dto);
            List<SysPdaUserPO> resultList = sysPdaUserMapper.selectUser(dto);
            PageInfo<SysPdaUserPO> pageInfo = new PageInfo<>(resultList);
            PageHelperVO<SysPdaUserVO> pageHelperResponse = new PageHelperVO<>();
            BeanUtils.copyProperties(pageInfo, pageHelperResponse);
            List<SysPdaUserVO> list = new ArrayList<>();
            pageHelperResponse.setList(list);
            if (!CollectionUtils.isEmpty(resultList)) {
                for (SysPdaUserPO po : resultList) {
                    SysPdaUserVO vo = new SysPdaUserVO();
                    BeanUtils.copyProperties(po, vo);
                    list.add(vo);
                }
            }
        return CommonResult.success(pageHelperResponse);
        } catch (Exception e) {
            log.error("获取巡检员列表失败：", e);
            return CommonResult.failed();
        }
    }

    /**
     * 添加巡检员
     * @param param
     * @return
     */
    @Override
    public CommonResult add(SysPdaUserAddParams param) {
        SysPdaUserPO po = new SysPdaUserPO();
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setAddUser(param.getLoginSysUserId());
        // 用户状态，启用中
        po.setPdaUserStatus((byte) 1);
        sysPdaUserMapper.insertSelective(po);
        return CommonResult.success();
    }

    /**
     * 更新巡检员
     * @param param
     * @return
     */
    @Override
    public CommonResult update(SysPdaUserUpdateParams param) {
        SysPdaUserPO po = new SysPdaUserPO();
        BeanUtils.copyProperties(param, po);
        sysPdaUserMapper.updateByPrimaryKeySelective(po);
        return CommonResult.success();
    }

    /**
     * 巡检员详情
     * @param param
     * @return
     */
    @Override
    public CommonResult<SysPdaUserVO> detail(SysPdaUserDetailParams param) {
        SysPdaUserDto dto = new SysPdaUserDto();
        BeanUtils.copyProperties(param, dto);
        SysPdaUserPO result = sysPdaUserMapper.selectByPrimaryKey(dto);
        SysPdaUserVO vo = new SysPdaUserVO();
        if (result != null) {
            BeanUtils.copyProperties(result, vo);
        }
        return CommonResult.success(vo);
    }

    /**
     * 删除巡检员
     * @param param
     * @return
     */
    @Override
    public CommonResult delete(SysPdaUserDeleteParams param) {
        SysPdaUserPO po = new SysPdaUserPO();
        BeanUtils.copyProperties(param, po);
        sysPdaUserMapper.deleteByPrimaryKey(po);
        return CommonResult.success();
    }

    @Override
    public CommonResult<List<SysPdaUserListVO>> list(SysPdaUserListParams param) {
        return null;
    }

    @Override
    public List<SysPdaUserPO> allList(SysPdaUserSearchParams param) {
        SysPdaUserDto dto = new SysPdaUserDto();
        BeanUtils.copyProperties(param, dto);
        return sysPdaUserMapper.selectUser(dto);
    }
}