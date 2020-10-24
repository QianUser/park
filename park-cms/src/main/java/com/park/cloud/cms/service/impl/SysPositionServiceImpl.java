package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.SysPositionPOMapper;
import com.park.cloud.cms.mapper.SysUserPOMapper;
import com.park.cloud.cms.service.SysPositionService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.SysPositionDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.sys.SysPositionPO;
import com.park.cloud.common.domain.po.sys.SysUserPOExample;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPositionListVO;
import com.park.cloud.common.domain.vo.cms.SysPositionVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 职位服务
 *
 * @author liyj
 * @create 2020/1/20
 * @since 1.0.0
 */
@Service
@Slf4j
public class SysPositionServiceImpl implements SysPositionService {

    @Autowired
    SysPositionPOMapper sysPositionPOMapper;

    @Autowired
    SysUserPOMapper userPOMapper;

    /**
     * 添加职位接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult add(SysPositionAddParams param) {
        SysPositionPO po = new SysPositionPO();
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setAddUser(param.getLoginSysUserId());
        sysPositionPOMapper.insertSelective(po);
        return CommonResult.success();
    }

    /**
     * 更新职位接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(SysPositionUpdateParams param) {
        SysPositionPO po = new SysPositionPO();
        BeanUtils.copyProperties(param, po);
        sysPositionPOMapper.updateByPrimaryKeySelective(po);
        return CommonResult.success();
    }

    /**
     * 职位详情
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<SysPositionVO> detail(SysPositionDetailParams param) {
        SysPositionPO po = sysPositionPOMapper.selectByPrimaryKey(param.getPositionId());
        if (po == null) {
            return CommonResult.failed("数据不存在");
        }
        SysPositionVO vo = new SysPositionVO();
        BeanUtils.copyProperties(po, vo);
        return CommonResult.success(vo);
    }

    /**
     * 职位删除接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult delete(SysPositionDeleteParams param) {
        //检查职位下的用户
        SysUserPOExample userPOExample = new SysUserPOExample();
        userPOExample.createCriteria().andPositionIdEqualTo(param.getPositionId());
        if (userPOMapper.countByExample(userPOExample) > 0) {
            return CommonResult.failed("该职位下有人员，不能删除");
        }

        sysPositionPOMapper.deleteByPrimaryKey(param.getPositionId());
        return CommonResult.success();
    }

    /**
     * 搜索职位接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<SysPositionVO>> search(SysPositionSearchParams param) {
        SysPositionDto dto = new SysPositionDto();
        BeanUtils.copyProperties(param, dto);
        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<SysPositionVO> resultList = sysPositionPOMapper.selectByDto(dto);
        PageInfo<SysPositionVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<SysPositionVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    /**
     * 职位列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<List<SysPositionListVO>> list(SysPositionListParams param) {
        SysPositionDto dto = new SysPositionDto();
        BeanUtils.copyProperties(param, dto);
        List<SysPositionListVO> resultList = sysPositionPOMapper.selectListByDto(dto);
        return CommonResult.success(resultList);
    }
}