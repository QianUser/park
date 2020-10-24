package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.DictLongParkingMapper;
import com.park.cloud.cms.service.DictLongParkingService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.dto.cms.DictLongParkingDto;
import com.park.cloud.common.domain.params.cms.DictLongParkingSearchParams;
import com.park.cloud.common.domain.po.dict.DictLongParkingPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.DictLongParkingVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 僵尸车查询服务
 *
 * @author zyj
 * @date 2020/3/17
 */
@Service
@Slf4j
public class DictLongParkingServiceImpl implements DictLongParkingService {

    @Autowired
    private DictLongParkingMapper dictLongParkingMapper;

    /**
     * 僵尸车列表查询
     *
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<DictLongParkingVO>> search(DictLongParkingSearchParams param) {
        try {
            //设置分页查询
            PageHelper.startPage(param.getPageNum(), param.getPageSize());

            DictLongParkingDto dto = new DictLongParkingDto();
            BeanUtils.copyProperties(param, dto);
            List<String> timeList = param.getStartParkingTime();
            if (timeList != null) {
                if (timeList.size() > 0) {
                    dto.setStartParkingTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(timeList.get(0)));
                }
                if (timeList.size() > 1) {
                    dto.setEndParkingTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(timeList.get(1)));
                }
            }
            String parkTime = param.getParkTime();
            if (StringUtils.isNotBlank(parkTime)) {
                String[] parkTimes = parkTime.split("-");
                if (parkTimes.length > 0) {
                    dto.setParkStartTime(Integer.parseInt(parkTimes[0])*60);
                    if (parkTimes.length > 1) {
                        dto.setParkEndTime(Integer.parseInt(parkTimes[1])*60);
                    }
                }
            }
            List<DictLongParkingPO> resultList = dictLongParkingMapper.selectLongParking(dto);
            resultList.removeAll(Collections.singleton(null));
            PageInfo<DictLongParkingPO> pageInfo = new PageInfo<>(resultList);
            PageHelperVO<DictLongParkingVO> pageHelperResponse = new PageHelperVO<>();
            BeanUtils.copyProperties(pageInfo, pageHelperResponse);
            List<DictLongParkingVO> list = new ArrayList<>();
            pageHelperResponse.setList(list);
            if (!CollectionUtils.isEmpty(resultList)) {
                for (DictLongParkingPO po : resultList) {
                    DictLongParkingVO vo = new DictLongParkingVO();
                    BeanUtils.copyProperties(po, vo);
                    if (vo.getParkTime() != null) {
                        vo.setParkTime(vo.getParkTime().setScale(2, BigDecimal.ROUND_HALF_EVEN));
                    }
                    list.add(vo);
                }
            }
            return CommonResult.success(pageHelperResponse);
        } catch (Exception e) {
            log.error("僵尸车查询失败：", e);
            return CommonResult.failed();
        }
    }

    @Override
    public List<DictLongParkingPO> allList(DictLongParkingSearchParams param) {
        try {
            DictLongParkingDto dto = new DictLongParkingDto();
            BeanUtils.copyProperties(param, dto);
            List<String> timeList = param.getStartParkingTime();
            if (timeList != null) {
                if (timeList.size() > 0) {
                    dto.setStartParkingTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(timeList.get(0)));
                }
                if (timeList.size() > 1) {
                    dto.setEndParkingTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(timeList.get(1)));
                }
            }
            String parkTime = param.getParkTime();
            if (StringUtils.isNotBlank(parkTime)) {
                String[] parkTimes = parkTime.split("-");
                if (parkTimes.length > 0) {
                    dto.setParkStartTime(Integer.parseInt(parkTimes[0]) * 60);
                    if (parkTimes.length > 1) {
                        dto.setParkEndTime(Integer.parseInt(parkTimes[1]) * 60);
                    }
                }
            }
            return dictLongParkingMapper.selectLongParking(dto);
        } catch (Exception e) {
            log.error("longParking export error", e);
        }
        return null;
    }
}