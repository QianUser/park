package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.service.MonthlyTicketService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.MonthlyTicketAddParams;
import com.park.cloud.common.domain.params.cms.MonthlyTicketParams;
import com.park.cloud.common.domain.params.cms.MonthlyTicketSearchParam;
import com.park.cloud.common.domain.params.cms.MonthlyTrategyBackParams;
import com.park.cloud.common.domain.params.user.MonthlyTicketListParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.MonthlyStrategyTimeVO;
import com.park.cloud.common.domain.vo.cms.MonthlyTicketListVO;
import com.park.cloud.cms.mapper.MonthlyTicketMapper;
import com.park.cloud.common.domain.vo.user.MonthlyTicketSelectVO;
import com.park.cloud.common.util.DateUtil;
import com.park.cloud.common.util.DatetimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class MonthlyTicketServiceImpl implements MonthlyTicketService {

    @Autowired
    MonthlyTicketMapper monthlyTicketMapper;

    /**
     * 查询
     * @param param
     * @return
     */
    @Override
    public CommonResult<PageHelperVO<MonthlyTicketListVO>> list(MonthlyTicketParams param) {

        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<MonthlyTicketListVO> list = monthlyTicketMapper.selectList(param);
        PageInfo<MonthlyTicketListVO> pageInfo = new PageInfo<>(list);
        PageHelperVO<MonthlyTicketListVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(list);

        return CommonResult.success(pageHelperVO);
    }


    /**
     * 包月卷的新增
     * @param param
     * @return
     */
    @Override
    public CommonResult add(MonthlyTicketAddParams param) {
        MonthlyTicketListVO params = new MonthlyTicketListVO();
        BeanUtils.copyProperties(param , params);

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern(DateUtil.DATE_PATTERN);
        params.setStartDate(LocalDate.parse(param.getStartDate(),df1));
        params.setEndDate(LocalDate.parse(param.getEndDate(),df1));

        Date startDate = DatetimeUtil.asDate(params.getStartDate());
        Date endDate = DatetimeUtil.asDate(params.getEndDate());
        int check = DateUtil.dateCompare(startDate, endDate);
        if (check != -1){
            return CommonResult.failed("结束时间必须大于开始时间");
        }

        MonthlyTicketSelectVO vo = new MonthlyTicketSelectVO();
        vo.setParkingSectionId(param.getParkingSectionId());
        vo.setPlateNumber(param.getPlateNumber());
        vo.setPlateType(param.getPlateType());
        List<MonthlyTicketListVO> list = monthlyTicketMapper.selectBy(vo);
        if (list != null && list.size() != 0) {
            return CommonResult.failed("数据已经存在，请前往修改");
        }


        List<MonthlyStrategyTimeVO> ms=monthlyTicketMapper
                .selectStrategyByMonthlyRateId(param.getMonthlyRateId());
        for (MonthlyStrategyTimeVO tvo:ms) {
            params.setStartTime(tvo.getStartTime());
            params.setEndTime(tvo.getEndTime());
            break;
        }

        try {
            int monthNum=DateUtil.getMonth(startDate,endDate);
            params.setMonthNum(monthNum);
        } catch (Exception e) {
            return CommonResult.failed();
        }

        params.setParkingType(monthlyTicketMapper.selectParkingType(param.getParkingSectionId()));
        params.setAddTime(DatetimeUtil.getNow());
        params.setUpdateTime(DatetimeUtil.getNow());
        monthlyTicketMapper.add(params);
        return CommonResult.success();
    }

    /**
     * 包月卷的更新
     * @param param
     * @return
     */
    @Override
    public CommonResult update(MonthlyTicketAddParams param) {

        MonthlyTicketListVO params = new MonthlyTicketListVO();
        BeanUtils.copyProperties(param , params);

        DateTimeFormatter df1 = DateTimeFormatter.ofPattern(DateUtil.DATE_PATTERN);
        params.setStartDate(LocalDate.parse(param.getStartDate(),df1));
        params.setEndDate(LocalDate.parse(param.getEndDate(),df1));

        List<MonthlyTicketListVO> list = monthlyTicketMapper.selectById(param.getId());

        if (list == null && list.size()==0){
            return CommonResult.failed("没有该包月券,无法修改");
        }

        Date startDate = DatetimeUtil.asDate(params.getStartDate());
        Date endDate = DatetimeUtil.asDate(params.getEndDate());
        int check = DateUtil.dateCompare(startDate, endDate);
        if (check != -1){
            return CommonResult.failed("结束时间必须大于开始时间");
        }

        List<MonthlyStrategyTimeVO> ms=monthlyTicketMapper
                .selectStrategyByMonthlyRateId(param.getMonthlyRateId());
        for (MonthlyStrategyTimeVO tvo:ms) {
            params.setStartTime(tvo.getStartTime());
            params.setEndTime(tvo.getEndTime());
            break;
        }
        try {
            int monthNum=DateUtil.getMonth(startDate,endDate);
            params.setMonthNum(monthNum);
        } catch (Exception e) {
            return CommonResult.failed();
        }

        params.setParkingType(monthlyTicketMapper.selectParkingType(param.getParkingSectionId()));
        params.setUpdateTime(DatetimeUtil.getNow());
        monthlyTicketMapper.update(params);

        return CommonResult.success();

    }

    @Override
    public CommonResult delete(int id) {
        try {
            monthlyTicketMapper.delete(id);
            return CommonResult.success();
        } catch (Exception e) {
            return CommonResult.failed("删除用户包月券失败!");
        }
    }

    @Override
    public CommonResult<List<MonthlyTrategyBackParams>> strategy(int parkingSectionId) {
        List list = monthlyTicketMapper.selectStrategyByParkingSectionId(parkingSectionId);
        return CommonResult.success(list);
    }
}
