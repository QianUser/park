package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.SysDepartmentPOMapper;
import com.park.cloud.cms.mapper.SysUserPOMapper;
import com.park.cloud.cms.service.SysDepartmentService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.SysDepartmentDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.sys.SysDepartmentPO;
import com.park.cloud.common.domain.po.sys.SysDepartmentPOExample;
import com.park.cloud.common.domain.po.sys.SysUserPOExample;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysDepartmentListVO;
import com.park.cloud.common.domain.vo.cms.SysDepartmentVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 部门服务
 *
 * @author liyj
 * @create 2020/1/20
 * @since 1.0.0
 */
@Service
@Slf4j
public class SysDepartmentServiceImpl implements SysDepartmentService {

    @Autowired
    SysDepartmentPOMapper sysDepartmentPOMapper;

    @Autowired
    SysUserPOMapper userPOMapper;


    /**
     * 添加部门接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult add(SysDepartmentAddParams param) {
        SysDepartmentPO po = new SysDepartmentPO();
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setAddUser(param.getLoginSysUserId());
        sysDepartmentPOMapper.insertSelective(po);
        return CommonResult.success();
    }

    /**
     * 更新部门接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(SysDepartmentUpdateParams param) {
        SysDepartmentPO po = new SysDepartmentPO();
        BeanUtils.copyProperties(param, po);
        sysDepartmentPOMapper.updateByPrimaryKeySelective(po);
        return CommonResult.success();
    }

    /**
     * 部门详情
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<SysDepartmentVO> detail(SysDepartmentDetailParams param) {
        SysDepartmentPO po = sysDepartmentPOMapper.selectByPrimaryKey(param.getDeptId());
        if (po == null) {
            return CommonResult.failed("数据不存在");
        }
        SysDepartmentVO vo = new SysDepartmentVO();
        BeanUtils.copyProperties(po, vo);
        return CommonResult.success(vo);
    }

    /**
     * 部门删除接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult delete(SysDepartmentDeleteParams param) {
        //检查部门下的用户
        SysUserPOExample userPOExample = new SysUserPOExample();
        userPOExample.createCriteria().andUserDeptIdEqualTo(param.getDeptId());
        if (userPOMapper.countByExample(userPOExample) > 0) {
            return CommonResult.failed("该部门下有人员，不能删除");
        }

        //检查下级部门
        SysDepartmentPOExample departmentPOExample = new SysDepartmentPOExample();
        departmentPOExample.createCriteria().andParentDeptIdEqualTo(param.getDeptId());
        if (sysDepartmentPOMapper.countByExample(departmentPOExample) > 0) {
            return CommonResult.failed("该部门有下级部门，不能删除");
        }

        sysDepartmentPOMapper.deleteByPrimaryKey(param.getDeptId());
        return CommonResult.success();
    }

    /**
     * 搜索部门接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<SysDepartmentVO>> search(SysDepartmentSearchParams param) {
        SysDepartmentDto dto = new SysDepartmentDto();
        BeanUtils.copyProperties(param, dto);
        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<SysDepartmentVO> resultList = sysDepartmentPOMapper.selectByDto(dto);
        PageInfo<SysDepartmentVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<SysDepartmentVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    /**
     * 部门列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<List<SysDepartmentListVO>> list(SysDepartmentListParams param) {
        SysDepartmentDto dto = new SysDepartmentDto();
        BeanUtils.copyProperties(param, dto);
        dto.setDeptStatus(1);
        List<SysDepartmentListVO> resultList = sysDepartmentPOMapper.selectListByDto(dto);
        return CommonResult.success(resultList);
    }
}