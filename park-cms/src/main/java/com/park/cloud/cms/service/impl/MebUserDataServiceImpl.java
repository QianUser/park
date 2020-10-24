package com.park.cloud.cms.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.MebUserDataMapper;
import com.park.cloud.cms.service.MebUserDataService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.MebUserDataDto;
import com.park.cloud.common.domain.params.cms.CmsBaseParams;
import com.park.cloud.common.domain.params.cms.MebUserDataListParams;
import com.park.cloud.common.domain.params.cms.MebUserDataMonthParams;
import com.park.cloud.common.domain.po.meb.MebUserDataPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.MebUserDataDayVO;
import com.park.cloud.common.domain.vo.cms.MebUserDataMonthVO;
import com.park.cloud.common.domain.vo.cms.MebUserDataVO;
import com.park.cloud.common.util.DatetimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用户报表服务
 *
 * @author zyj
 * @date 2020/3/17
 */
@Service
@Slf4j
public class MebUserDataServiceImpl implements MebUserDataService {

    @Autowired
    MebUserDataMapper mebUserDataMapper;

    @Override
    public CommonResult<MebUserDataVO> count(CmsBaseParams param) {
        try {
            MebUserDataPO po = mebUserDataMapper.selectUserCount();
            MebUserDataVO result = new MebUserDataVO();

            if (po == null) {
                result = JSONObject.parseObject(JSONObject.toJSONStringWithDateFormat(result, DatetimeUtil.DATETIME_INPATTERN, SerializerFeature.WriteNullNumberAsZero), MebUserDataVO.class);
                return CommonResult.success(result);
            }

            BeanUtils.copyProperties(po, result);

            result.setTotalCountRate(BigDecimal.ZERO);
            result.setTodayNewCountRate(BigDecimal.ZERO);
            result.setTodayTradeCountRate(BigDecimal.ZERO);
            result.setTodayActiveCountRate(BigDecimal.ZERO);

            // 计算占比
            BigDecimal totalCount = BigDecimal.ZERO;
            if (result.getTotalCount() != null && result.getTotalCount() > 0) {
                totalCount = new BigDecimal(result.getTotalCount());
                result.setTotalCountRate(totalCount.divide(totalCount, 4, RoundingMode.HALF_EVEN));
            }
            if (BigDecimal.ZERO.compareTo(totalCount) == 0) {
                result = JSONObject.parseObject(JSONObject.toJSONStringWithDateFormat(result, DatetimeUtil.DATETIME_INPATTERN, SerializerFeature.WriteNullNumberAsZero), MebUserDataVO.class);
                return CommonResult.success(result);
            }
            if (result.getTodayNewCount() != null && result.getTodayNewCount() > 0) {
                result.setTodayNewCountRate(new BigDecimal(result.getTodayNewCount()).divide(totalCount, 4, RoundingMode.HALF_EVEN));
            }
            if (result.getTodayTradeCount() != null && result.getTodayTradeCount() > 0) {
                result.setTodayTradeCountRate(new BigDecimal(result.getTodayTradeCount()).divide(totalCount, 4, RoundingMode.HALF_EVEN));
            }
            if (result.getTodayActiveCount() != null && result.getTodayActiveCount() > 0) {
                result.setTodayActiveCountRate(new BigDecimal(result.getTodayActiveCount()).divide(totalCount, 4, RoundingMode.HALF_EVEN));
            }
            return CommonResult.success(result);
        } catch (Exception e) {
            log.error("获取用户数失败.", e);
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<PageHelperVO<MebUserDataVO>> list(MebUserDataListParams param) {
        try {
            //设置分页查询
            PageHelper.startPage(param.getPageNum(), param.getPageSize());

            MebUserDataDto dto = new MebUserDataDto();
            dto.setPageNum(param.getPageNum());
            dto.setPageSize(param.getPageSize());
            Date month = StringUtils.isBlank(param.getMonth()) ? new Date() : new SimpleDateFormat("yyyy-MM-dd").parse(param.getMonth() + "-01");
            dto.setMonth(month);
            List<MebUserDataPO> resultList = mebUserDataMapper.selectUserData(dto);
            PageInfo<MebUserDataPO> pageInfo = new PageInfo<>(resultList);
            PageHelperVO<MebUserDataVO> pageHelperResponse = new PageHelperVO<>();
            BeanUtils.copyProperties(pageInfo, pageHelperResponse);
            List<MebUserDataVO> list = new ArrayList<>();
            pageHelperResponse.setList(list);
            if (!CollectionUtils.isEmpty(resultList)) {
                for (MebUserDataPO po : resultList) {
                    MebUserDataVO vo = new MebUserDataVO();
                    BeanUtils.copyProperties(po, vo);
                    list.add(vo);
                }
            }
            return CommonResult.success(pageHelperResponse);
        } catch (Exception e) {
            log.error("获取用户数列表失败.", e);
            return CommonResult.failed();
        }
    }


    @Override
    public CommonResult<MebUserDataMonthVO> selectUserDataMonth(MebUserDataMonthParams param) {
        try {
            Date month = StringUtils.isBlank(param.getMonth()) ? new Date() : new SimpleDateFormat("yyyy-MM-dd").parse(param.getMonth() + "-01");
            List<MebUserDataDayVO> newUserData = mebUserDataMapper.selectNewUserDataMonth(month);
            List<MebUserDataDayVO> tradeUserData = mebUserDataMapper.selectTradeUserDataMonth(month);
            List<MebUserDataDayVO> activeUserData = mebUserDataMapper.selectActiveUserDataMonth(month);
            MebUserDataMonthVO result = new MebUserDataMonthVO();
            result.setNewUserData(newUserData);
            result.setTradeUserData(tradeUserData);
            result.setActiveUserData(activeUserData);
            return CommonResult.success(result);
        } catch (Exception e) {
            log.error("获取用户数失败.", e);
            return CommonResult.failed();
        }
    }

}