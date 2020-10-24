package com.park.cloud.cms.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.RepPdaUserPeccancyPOMapper;
import com.park.cloud.cms.service.RepPdaUserPeccancyService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.RepPdaUserPeccancyDto;
import com.park.cloud.common.domain.params.cms.RepPdaUserPeccancyParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.RepPdaUserCountVO;
import com.park.cloud.common.domain.vo.cms.RepPdaUserPeccancyVO;
import com.park.cloud.common.domain.vo.order.CouponPurchaseExporVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassNameRepPdaUserPeccancyServiceImpl
 * @Description TODO
 * @Author liangshuang
 * @Date 2020/2/25 15:26
 **/
@Service
@Slf4j
public class RepPdaUserPeccancyServiceImpl implements RepPdaUserPeccancyService {

    @Autowired
    SysAreaAssService sysAreaAssService;
    @Autowired
   private  RepPdaUserPeccancyPOMapper repPdaUserPeccancyPOMapper;

    @Override
    public CommonResult<PageHelperVO<RepPdaUserPeccancyVO>> getRepPdaUserPeccancy(RepPdaUserPeccancyParams params) {
        RepPdaUserPeccancyDto dto = new RepPdaUserPeccancyDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);

        log.debug("====getRepBerthUse====:" + params);
        //设置分页查询
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<RepPdaUserPeccancyVO> list = repPdaUserPeccancyPOMapper.getRepPdaUserPeccancy(dto);
        PageInfo<RepPdaUserPeccancyVO> pageInfo = new PageInfo<>(list);
        PageHelperVO<RepPdaUserPeccancyVO> pageHelperResponse = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperResponse);
        log.debug("查询结果：" + pageHelperResponse);
        return CommonResult.success(pageHelperResponse);
    }


    @Override
    public CommonResult<RepPdaUserCountVO> dealStatistics(RepPdaUserPeccancyParams params) {
        RepPdaUserPeccancyDto dto = new RepPdaUserPeccancyDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
        sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);
        List<RepPdaUserPeccancyVO> list = repPdaUserPeccancyPOMapper.getRepPdaUserPeccancy(dto);
        //派单总数
        Integer peccancyNum=0;
        //派单总金额
        Integer orderPrice=0;
        //派单完成数
        Integer finishNum=0;
        //完成的总时间
        Integer averageFinishTime=0;
        for (int i=0;i<list.size();i++){
            peccancyNum+=list.get(i).getPeccancyNum();
            orderPrice+=list.get(i).getOrderPrice();
            finishNum+=list.get(i).getFinishNum();
            averageFinishTime+=list.get(i).getAverageFinishTime();
        }
        RepPdaUserCountVO repPdaUserCountVO=new RepPdaUserCountVO();
        repPdaUserCountVO.setPeccancyNum(peccancyNum);
        repPdaUserCountVO.setOrderPrice(orderPrice);
        //派单完成率
        BigDecimal decimal1 = new BigDecimal(peccancyNum);
        BigDecimal decimal2 = new BigDecimal(finishNum);
        if (peccancyNum!=0&&finishNum!=0){
            repPdaUserCountVO.setFinishRatio(decimal1.divide(decimal2,2, RoundingMode.HALF_UP));
        }else{
            repPdaUserCountVO.setFinishRatio(new BigDecimal(0.00));
        }
        //平均完成时间
        if (averageFinishTime!=0&&finishNum!=0){
            repPdaUserCountVO.setAverageFinishTime(averageFinishTime/finishNum);
        }else{
            repPdaUserCountVO.setAverageFinishTime(0);
        }
        return CommonResult.success(repPdaUserCountVO);
    }
}
