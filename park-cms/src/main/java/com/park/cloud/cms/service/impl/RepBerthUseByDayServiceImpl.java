package com.park.cloud.cms.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.RepBerthUsePOMapper;
import com.park.cloud.cms.service.RepBerthUseByDayService;
import com.park.cloud.cms.service.SysAreaAssService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.DictAreaDto;
import com.park.cloud.common.domain.dto.cms.RepBerthUseByDayDto;
import com.park.cloud.common.domain.params.cms.RepBerthUseByDayParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.RepBerthUseByDayVO;
import com.park.cloud.common.domain.vo.order.CouponPurchaseExporVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassNameRepBerthUseByDayServiceImpl
 * @Description 路边停车收费率报表
 * @Author liangshuang
 * @Date 2020/2/24 14:42
 **/
@Service
@Slf4j
public class RepBerthUseByDayServiceImpl implements RepBerthUseByDayService {
  @Autowired
  private RepBerthUsePOMapper repBerthUsePOMapper;

    @Autowired
    SysAreaAssService sysAreaAssService;

    @Override
    public CommonResult<PageHelperVO<RepBerthUseByDayVO>> getRepBerthUse(RepBerthUseByDayParams params) {
        RepBerthUseByDayDto dto = new RepBerthUseByDayDto();
        BeanUtils.copyProperties(params, dto);
        //设置登陆用户辖区
         sysAreaAssService.setAreaAssInfo(params.getLoginSysUserId(), dto);

        log.debug("====getRepBerthUse====:" + params);
        //设置分页查询
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<RepBerthUseByDayVO> list = repBerthUsePOMapper.getRepBerthUse(dto);
        PageInfo<RepBerthUseByDayVO> pageInfo = new PageInfo<>(list);
        PageHelperVO<RepBerthUseByDayVO> pageHelperResponse = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperResponse);
        log.debug("查询结果：" + pageHelperResponse);
        return CommonResult.success(pageHelperResponse);
    }


}
