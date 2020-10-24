package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.DictAreaPOMapper;
import com.park.cloud.cms.mapper.DictParkingCityPOMapper;
import com.park.cloud.cms.mapper.DictSectionPOMapper;
import com.park.cloud.cms.service.DictAreaService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.DictAreaDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.dict.DictAreaPO;
import com.park.cloud.common.domain.po.dict.DictParkingCityPOExample;
import com.park.cloud.common.domain.po.dict.DictSectionPOExample;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictAreaListVO;
import com.park.cloud.common.domain.vo.cms.DictAreaVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 片区服务
 *
 * @author liyj1
 * @create 2020/1/31
 * @since 1.0.0
 */
@Service
@Slf4j
public class DictAreaServiceImpl implements DictAreaService {

    @Autowired
    DictAreaPOMapper dictAreaPOMapper;

    @Autowired
    DictSectionPOMapper dictSectionPOMapper;

    @Autowired
    DictParkingCityPOMapper dictParkingCityPOMapper;

    @Autowired
    SysAreaAssService sysAreaAssService;

    /**
     * 添加片区接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult add(DictAreaAddParams param) {
        DictAreaPO po = new DictAreaPO();
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setAddUser(param.getLoginSysUserId());
        dictAreaPOMapper.insertSelective(po);
        return CommonResult.success();
    }

    /**
     * 更新片区接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(DictAreaUpdateParams param) {
        DictAreaPO po = new DictAreaPO();
        BeanUtils.copyProperties(param, po);
        dictAreaPOMapper.updateByPrimaryKeySelective(po);
        return CommonResult.success();
    }

    /**
     * 片区详情
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<DictAreaVO> detail(DictAreaDetailParams param) {
        DictAreaPO po = dictAreaPOMapper.selectByPrimaryKey(param.getAreaId());
        if (po == null) {
            return CommonResult.failed("数据不存在");
        }
        DictAreaVO vo = new DictAreaVO();
        BeanUtils.copyProperties(po, vo);
        return CommonResult.success(vo);
    }

    /**
     * 片区删除接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult delete(DictAreaDeleteParams param) {
        //检查片区下的路段
        DictSectionPOExample example = new DictSectionPOExample();
        example.createCriteria().andAreaIdEqualTo(param.getAreaId());
        if (dictSectionPOMapper.countByExample(example) > 0) {
            return CommonResult.failed("该片区下有路段，不能删除");
        }
        //检查片区下的停车场
        DictParkingCityPOExample parkingExample = new DictParkingCityPOExample();
        parkingExample.createCriteria().andAreaIdEqualTo(param.getAreaId());
        if (dictParkingCityPOMapper.countByExample(parkingExample) > 0) {
            return CommonResult.failed("该片区下有停车场，不能删除");
        }

        dictAreaPOMapper.deleteByPrimaryKey(param.getAreaId());
        return CommonResult.success();
    }

    /**
     * 搜索片区接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<DictAreaVO>> search(DictAreaSearchParams param) {
        DictAreaDto dto = new DictAreaDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);

        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<DictAreaVO> resultList = dictAreaPOMapper.selectByDto(dto);
        PageInfo<DictAreaVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<DictAreaVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    /**
     * 片区列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<List<DictAreaListVO>> list(DictAreaListParams param) {
        DictAreaDto dto = new DictAreaDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);

        List<DictAreaListVO> resultList = dictAreaPOMapper.selectListByDto(dto);
        return CommonResult.success(resultList);
    }
}