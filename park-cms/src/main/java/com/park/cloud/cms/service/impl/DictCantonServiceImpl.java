package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.DictAreaPOMapper;
import com.park.cloud.cms.mapper.DictCantonPOMapper;
import com.park.cloud.cms.service.DictCantonService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.DictCantonDto;
import com.park.cloud.common.domain.params.cms.*;
import com.park.cloud.common.domain.po.dict.DictAreaPOExample;
import com.park.cloud.common.domain.po.dict.DictCantonPO;
import com.park.cloud.common.domain.po.dict.DictCantonPOExample;
import com.park.cloud.common.domain.po.dict.DictSectionPOExample;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictCantonListVO;
import com.park.cloud.common.domain.vo.cms.DictCantonVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * 行政区服务
 *
 * @author liyj1
 * @create 2020/1/31
 * @since 1.0.0
 */
@Service
@Slf4j
public class DictCantonServiceImpl implements DictCantonService {

    @Autowired
    DictCantonPOMapper dictCantonPOMapper;

    @Autowired
    DictAreaPOMapper dictAreaPOMapper;

    @Autowired
    SysAreaAssService sysAreaAssService;

    /**
     * 添加行政区接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult add(DictCantonAddParams param) {
        DictCantonPOExample example = new DictCantonPOExample();
        example.createCriteria().andCantonCodeEqualTo(param.getCantonCode());
        long count = dictCantonPOMapper.countByExample(example);
        if(count>0){
            return CommonResult.failed("不能添加相同的行政区！");
        }
        DictCantonPO po = new DictCantonPO();
        BeanUtils.copyProperties(param, po);
        po.setAddTime(new Date());
        po.setAddUser(param.getLoginSysUserId());
        dictCantonPOMapper.insertSelective(po);
        return CommonResult.success();
    }

    /**
     * 更新行政区接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult update(DictCantonUpdateParams param) {
        DictCantonPO dictCantonPO = dictCantonPOMapper.selectByPrimaryKey(param.getCantonId());
        if(Objects.isNull(dictCantonPO) || Objects.isNull(dictCantonPO.getCantonId())){
            return CommonResult.failed("未查询到该记录");
        }
        if(StringUtils.isNotBlank(param.getCantonCode()) && !param.getCantonCode().equals(dictCantonPO.getCantonCode())){
            DictCantonPOExample example = new DictCantonPOExample();
            example.createCriteria().andCantonCodeEqualTo(param.getCantonCode());
            long count = dictCantonPOMapper.countByExample(example);
            if(count>0){
                return CommonResult.failed("不能添加相同的行政区！");
            }
        }

        DictCantonPO po = new DictCantonPO();
        BeanUtils.copyProperties(param, po);
        dictCantonPOMapper.updateByPrimaryKeySelective(po);
        return CommonResult.success();
    }

    /**
     * 行政区详情
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<DictCantonVO> detail(DictCantonDetailParams param) {
        DictCantonPO po = dictCantonPOMapper.selectByPrimaryKey(param.getCantonId());
        if (po == null) {
            return CommonResult.failed("数据不存在");
        }
        DictCantonVO vo = new DictCantonVO();
        BeanUtils.copyProperties(po, vo);
        return CommonResult.success(vo);
    }

    /**
     * 行政区删除接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult delete(DictCantonDeleteParams param) {
        //检查行政区下的片区
        DictAreaPOExample example = new DictAreaPOExample();
        example.createCriteria().andCantonIdEqualTo(param.getCantonId());
        if (dictAreaPOMapper.countByExample(example) > 0) {
            return CommonResult.failed("该行政区下有片区，不能删除");
        }

        dictCantonPOMapper.deleteByPrimaryKey(param.getCantonId());
        return CommonResult.success();
    }

    /**
     * 搜索行政区接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<DictCantonVO>> search(DictCantonSearchParams param) {
        DictCantonDto dto = new DictCantonDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);

        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<DictCantonVO> resultList = dictCantonPOMapper.selectByDto(dto);
        PageInfo<DictCantonVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<DictCantonVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    /**
     * 行政区列表接口,用于下拉框
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<List<DictCantonListVO>> list(DictCantonListParams param) {
        DictCantonDto dto = new DictCantonDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);

        List<DictCantonListVO> resultList = dictCantonPOMapper.selectListByDto(dto);
        return CommonResult.success(resultList);
    }
}