package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.params.cms.MonthlyTicketParams;
import com.park.cloud.common.domain.vo.cms.MonthlyStrategyTimeVO;
import com.park.cloud.common.domain.vo.cms.MonthlyTicketListVO;
import com.park.cloud.common.domain.vo.user.MonthlyTicketSelectVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MonthlyTicketMapper {

    List<MonthlyTicketListVO> selectList(MonthlyTicketParams param);

    int add(MonthlyTicketListVO params);

    List<MonthlyTicketListVO> selectBy(MonthlyTicketSelectVO vo);

    List<MonthlyTicketListVO> selectById(int id);

    int update(MonthlyTicketListVO param);

    int delete(int id);

    List selectStrategyByParkingSectionId(int parkingSectionId);

    List<MonthlyStrategyTimeVO> selectStrategyByMonthlyRateId(Integer monthlyRateId);

    int selectParkingType(Integer parkingSectionId);
}
