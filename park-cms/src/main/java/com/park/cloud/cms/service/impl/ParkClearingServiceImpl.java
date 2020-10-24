package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.RepParkOperatePOMapper;
import com.park.cloud.cms.service.ParkClearingService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.FindCantonDto;
import com.park.cloud.common.domain.dto.cms.parkClearingDto;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.params.cms.ParkClearingCountParams;
import com.park.cloud.common.domain.po.dict.DictParkingCityPO;
import com.park.cloud.common.domain.po.dict.DictSectionPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.ParkClearingPageVO;
import com.park.cloud.common.domain.vo.cms.ParkClearingVO;
import com.park.cloud.common.domain.vo.cms.RepParkFinanceDetailsVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassNameParkClearingServiceImpl
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/3/6 10:05
 **/
@Service
@Slf4j
public class ParkClearingServiceImpl implements ParkClearingService {
    @Autowired
    private RepParkOperatePOMapper repParkOperatePOMapper;
    @Autowired
    SysAreaAssService sysAreaAssService;
    @Override
    public CommonResult<ParkClearingVO> topModule(CmsBaseParams param) {
        FindCantonDto dto = new FindCantonDto();
        BeanUtils.copyProperties(param, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(param.getLoginSysUserId(), dto);
        ParkClearingVO parkClearingVO = new ParkClearingVO();
        //查询所有的路内(路边或路段)停车场数据
        List<DictSectionPO> list = repParkOperatePOMapper.findAllSection(dto);
        //查询所有的路外(封闭)停车场数据
        List<DictParkingCityPO> cytyList = repParkOperatePOMapper.findAllParkingCity(dto);
        //根据封闭式和路边的停车场id查询出待结算金额
        double sectionMoney = 0d;
        for (int i = 0; i < list.size(); i++) {
            sectionMoney += repParkOperatePOMapper.findMoneyBySectionId(list.get(i).getSectionId());
        }
        double parkMoney = 0d;
        for (int w = 0; w < cytyList.size(); w++) {
            parkMoney += repParkOperatePOMapper.findMoneyByParkId(cytyList.get(w).getParkingId());
        }
        parkClearingVO.setRoadsidePark(list.size());
        BigDecimal decimal1 = new BigDecimal(list.size());
        BigDecimal decimal2 = new BigDecimal(list.size() + cytyList.size());
        BigDecimal decimal = decimal1.divide(decimal2, 2, RoundingMode.HALF_UP);
        parkClearingVO.setRoadsideRatio(decimal);
        parkClearingVO.setClosePark(cytyList.size());
        BigDecimal decimal3 = new BigDecimal(cytyList.size());
        BigDecimal decimal4 = new BigDecimal(list.size() + cytyList.size());
        BigDecimal decimal5 = decimal3.divide(decimal4, 2, RoundingMode.HALF_UP);
        parkClearingVO.setCloseRatio(decimal5);

        parkClearingVO.setSectionMoney(sectionMoney);
        BigDecimal money = new BigDecimal(sectionMoney);
        BigDecimal money1 = new BigDecimal(sectionMoney + parkMoney);
        BigDecimal money2 = BigDecimal.ZERO;
        if (BigDecimal.ZERO.compareTo(money1) < 0) {
            money2 = money.divide(money1, 2, RoundingMode.HALF_UP);
        }
        parkClearingVO.setSectionRatio(money2);
        parkClearingVO.setParkMoney(parkMoney);
        BigDecimal money3 = new BigDecimal(parkMoney);
        BigDecimal money4 = new BigDecimal(sectionMoney + parkMoney);
        BigDecimal money5 = BigDecimal.ZERO;
        if (BigDecimal.ZERO.compareTo(money4) < 0) {
            money5 = money3.divide(money4, 2, RoundingMode.HALF_UP);
        }
        parkClearingVO.setParkRatio(money5);
        return CommonResult.success(parkClearingVO);
    }

    @Override
    public CommonResult<PageHelperVO<ParkClearingPageVO>> getParkClearing(ParkClearingCountParams params) {

//        parkClearingDto dto = new parkClearingDto();
//        BeanUtils.copyProperties(params, dto);
//        //设置登陆用户辖区
//        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
//        log.debug("====getRepBerthUse====:" + params);
//        PageHelper.startPage(params.getPageNum(), params.getPageSize());
//        List<ParkClearingPageVO>list =  repParkOperatePOMapper.getParkClearing(dto);
        List<ParkClearingPageVO> list = getALLParkClearing(params, true).getData();
        PageInfo<ParkClearingPageVO> pageInfo = new PageInfo<>(list);
        PageHelperVO<ParkClearingPageVO> pageHelperResponse = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperResponse);
        log.debug("查询结果：" + pageHelperResponse);
        return CommonResult.success(pageHelperResponse);
    }

    @Override
    public CommonResult<List<ParkClearingPageVO>> getALLParkClearing(ParkClearingCountParams params,Boolean pageFlag) {

        parkClearingDto dto = new parkClearingDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        log.debug("====getRepBerthUse====:" + params);
//        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        if(pageFlag){
            PageHelper.startPage(params.getPageNum(), params.getPageSize());
        }
        List<ParkClearingPageVO> list =  repParkOperatePOMapper.getParkClearing(dto);
//        PageInfo<ParkClearingPageVO> pageInfo = new PageInfo<>(list);
//        PageHelperVO<ParkClearingPageVO> pageHelperResponse = new PageHelperVO<>();
//        BeanUtils.copyProperties(pageInfo, pageHelperResponse);
//        log.debug("查询结果：" + pageHelperResponse);
        if(list ==null){
            list = new ArrayList<ParkClearingPageVO>();
        }
        return CommonResult.success(list);
    }


}
