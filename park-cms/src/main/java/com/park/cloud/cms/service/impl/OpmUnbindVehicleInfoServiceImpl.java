package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.OpmUnbindVehicleInfoPOMapper;
import com.park.cloud.cms.service.OpmUnbindVehicleInfoService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.OpmUnbindVehicleInfoDto;
import com.park.cloud.common.domain.dto.cms.OpmUnbindVehicleInfoDto;
import com.park.cloud.common.domain.params.cms.OpmUnbindVehicleInfoAddParams;
import com.park.cloud.common.domain.params.cms.OpmUnbindVehicleInfoSearchParams;
import com.park.cloud.common.domain.po.opm.OpmUnbindVehicleInfoPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.CmsMebBindVehicleInfoVO;
import com.park.cloud.common.domain.vo.cms.OpmUnbindVehicleInfoVO;
import com.park.cloud.common.domain.vo.cms.OpmUnbindVehicleInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * 车牌解绑服务
 *
 * @author liyj1
 * @create 2020/2/11
 * @since 1.0.0
 */
@Service
@Slf4j
public class OpmUnbindVehicleInfoServiceImpl implements OpmUnbindVehicleInfoService {

    @Autowired
    OpmUnbindVehicleInfoPOMapper opmUnbindVehicleInfoPOMapper;

    /**
     * 搜索解绑车牌接口
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<OpmUnbindVehicleInfoVO>> search(OpmUnbindVehicleInfoSearchParams param) {
        OpmUnbindVehicleInfoDto dto = new OpmUnbindVehicleInfoDto();
        BeanUtils.copyProperties(param, dto);
        //设置分页查询
        PageHelper.startPage(param.getPageNum(), param.getPageSize());

        List<OpmUnbindVehicleInfoVO> resultList = opmUnbindVehicleInfoPOMapper.selectByDto(dto);
        PageInfo<OpmUnbindVehicleInfoVO> pageInfo = new PageInfo<>(resultList);

        PageHelperVO<OpmUnbindVehicleInfoVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(resultList);
        return CommonResult.success(pageHelperVO);
    }

    /**
     * 解绑车牌接口
     *
     * @param param
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public CommonResult add(OpmUnbindVehicleInfoAddParams param) {
        OpmUnbindVehicleInfoDto dto = new OpmUnbindVehicleInfoDto();
        BeanUtils.copyProperties(param, dto);
        //查询绑定该车牌的信息
        List<CmsMebBindVehicleInfoVO> bindVehicleInfoVOS = opmUnbindVehicleInfoPOMapper.selectBindVehicleInfo(dto);
        if(CollectionUtils.isEmpty(bindVehicleInfoVOS)) {
            return CommonResult.failed("车牌无人设置成默认车牌");
        }

        for(CmsMebBindVehicleInfoVO bindVehicleInfoVO : bindVehicleInfoVOS) {
            //删除用户的绑定车牌
            opmUnbindVehicleInfoPOMapper.deleteBindVehicleInfo(bindVehicleInfoVO.getMebBindVehicleInfoId());

            //添加到解绑车牌列表
            OpmUnbindVehicleInfoPO po = new OpmUnbindVehicleInfoPO();
            BeanUtils.copyProperties(bindVehicleInfoVO, po);
            po.setAddTime(new Date());
            po.setAddUser(param.getLoginSysUserId());
            opmUnbindVehicleInfoPOMapper.insertSelective(po);
        }

        return CommonResult.success();
    }
}