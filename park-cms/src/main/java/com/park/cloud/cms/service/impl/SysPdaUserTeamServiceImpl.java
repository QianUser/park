package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.*;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.cms.service.SysPdaUserTeamService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.SysPdaUserTeamBerthDto;
import com.park.cloud.common.domain.dto.cms.SysPdaUserTeamDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.sys.SysPdaUserTeamBerthPO;
import com.park.cloud.common.domain.po.sys.SysPdaUserTeamPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserTeamBerthVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserTeamListVO;
import com.park.cloud.common.domain.vo.cms.SysPdaUserTeamVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 中队管理服务
 *
 * @author zyj
 */
@Service
@Slf4j
public class SysPdaUserTeamServiceImpl implements SysPdaUserTeamService {

    @Autowired
    SysPdaUserTeamMapper sysPdaUserTeamMapper;

    @Autowired
    SysAreaAssService sysAreaAssService;

    @Autowired
    DictCityPOMapper dictCityPOMapper;

    @Autowired
    DictCantonPOMapper dictCantonPOMapper;

    @Autowired
    DictAreaPOMapper dictAreaPOMapper;

    @Autowired
    DictSectionPOMapper dictSectionPOMapper;

    /**
     * 中队列表查询
     */
    @Override
    public CommonResult<PageHelperVO<SysPdaUserTeamVO>> search(SysPdaUserTeamSearchParams param) {
        try {
            //设置分页查询
            PageHelper.startPage(param.getPageNum(), param.getPageSize());

            SysPdaUserTeamDto dto = new SysPdaUserTeamDto();
            BeanUtils.copyProperties(param, dto);
            List<SysPdaUserTeamPO> resultList = sysPdaUserTeamMapper.selectUserTeam(dto);
            PageInfo<SysPdaUserTeamPO> pageInfo = new PageInfo<>(resultList);
            PageHelperVO<SysPdaUserTeamVO> pageHelperResponse = new PageHelperVO<>();
            BeanUtils.copyProperties(pageInfo, pageHelperResponse);
            List<SysPdaUserTeamVO> list = new ArrayList<>();
            pageHelperResponse.setList(list);
            if (!CollectionUtils.isEmpty(resultList)) {
                for (SysPdaUserTeamPO po : resultList) {
                    SysPdaUserTeamVO vo = new SysPdaUserTeamVO();
                    BeanUtils.copyProperties(po, vo);
                    list.add(vo);
                }
            }
            return CommonResult.success(pageHelperResponse);
        } catch (Exception e) {
            log.error("获取中队列表失败：", e);
            return CommonResult.failed();
        }
    }

    /**
     * 添加中队
     */
    @Override
    public CommonResult add(SysPdaUserTeamAddParams param) {
        try {
            SysPdaUserTeamPO po = new SysPdaUserTeamPO();
            BeanUtils.copyProperties(param, po);
            po.setAddTime(new Date());
            po.setAddUser(param.getLoginSysUserId());
            sysPdaUserTeamMapper.insertSelective(po);
            return CommonResult.success();
        } catch (Exception e) {
            log.error("SysPdaUserTeam update error.", e);
            return CommonResult.failed();
        }
    }

    /**
     * 更新中队
     */
    @Override
    public CommonResult update(SysPdaUserTeamUpdateParams param) {
        try {
            SysPdaUserTeamPO po = new SysPdaUserTeamPO();
            BeanUtils.copyProperties(param, po);
            sysPdaUserTeamMapper.updateByPrimaryKeySelective(po);
            return CommonResult.success();
        } catch (Exception e) {
            log.error("SysPdaUserTeam update error.", e);
            return CommonResult.failed();
        }
    }

    /**
     * 中队详情
     */
    @Override
    public CommonResult<SysPdaUserTeamVO> detail(SysPdaUserTeamDetailParams param) {
        try {
            SysPdaUserTeamDto dto = new SysPdaUserTeamDto();
            BeanUtils.copyProperties(param, dto);
            SysPdaUserTeamPO result = sysPdaUserTeamMapper.selectByPrimaryKey(dto);
            SysPdaUserTeamVO vo = new SysPdaUserTeamVO();
            if (result != null) {
                BeanUtils.copyProperties(result, vo);
            }
            return CommonResult.success(vo);
        } catch (Exception e) {
            log.error("SysPdaUserTeam detail error.", e);
            return CommonResult.failed();
        }
    }

    /**
     * 删除中队
     */
    @Override
    public CommonResult delete(SysPdaUserTeamDeleteParams param) {
        try {
            SysPdaUserTeamPO po = new SysPdaUserTeamPO();
            BeanUtils.copyProperties(param, po);
            sysPdaUserTeamMapper.deleteByPrimaryKey(po);
            return CommonResult.success();
        } catch (Exception e) {
            log.error("SysPdaUserTeam delete error.", e);
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<List<SysPdaUserTeamListVO>> list(SysPdaUserTeamListParams param) {
        try {
            SysPdaUserTeamDto dto = new SysPdaUserTeamDto();
            BeanUtils.copyProperties(param, dto);

            List<SysPdaUserTeamListVO> resultList = sysPdaUserTeamMapper.selectListByDto(dto);
            return CommonResult.success(resultList);
        } catch (Exception e) {
            log.error("SysPdaUserTeam list error.", e);
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<List<SysPdaUserTeamBerthVO>> getBerth(SysPdaUserTeamBerthParams param) {
        try {
            SysPdaUserTeamBerthDto dto = new SysPdaUserTeamBerthDto();
            BeanUtils.copyProperties(param, dto);

            List<SysPdaUserTeamBerthVO> result = sysPdaUserTeamMapper.selectUserTeamBerth(dto);
            return CommonResult.success(result);
        } catch (Exception e) {
            log.error("SysPdaUserTeam getBerth error.", e);
            return CommonResult.failed();
        }
    }

    @Transactional
    @Override
    public CommonResult setBerth(SysPdaUserTeamBerthParams param) {
        try {
            SysPdaUserTeamBerthDto dto = new SysPdaUserTeamBerthDto();
            BeanUtils.copyProperties(param, dto);

            // 判断是否已分配给其他中队
            if (!CollectionUtils.isEmpty(dto.getBerthIds())) {
                int count = sysPdaUserTeamMapper.selectOtherTeam(dto);
                if (count > 0) {
                    return CommonResult.failed("存在已分配给其他中队的泊位");
                }
            }

            sysPdaUserTeamMapper.deleteTeamBerth(dto);

            if (!CollectionUtils.isEmpty(dto.getBerthIds())) {
                SysPdaUserTeamBerthPO po = new SysPdaUserTeamBerthPO();
                BeanUtils.copyProperties(dto, po);
                sysPdaUserTeamMapper.insertTeamBerth(po);
            }
            return CommonResult.success();
        } catch (Exception e) {
            log.error("SysPdaUserTeam setBerth error.", e);
            return CommonResult.failed();
        }
    }
}