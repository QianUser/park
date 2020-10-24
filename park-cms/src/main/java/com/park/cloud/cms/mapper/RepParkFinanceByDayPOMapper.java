package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.RepFindParkDto;
import com.park.cloud.common.domain.dto.cms.RepParkFinanceByDayCountDto;
import com.park.cloud.common.domain.po.rep.RepParkFinanceByDayPOExample;

import java.util.List;

import com.park.cloud.common.domain.po.rep.RepParkFinanceByDayPO;
import com.park.cloud.common.domain.vo.cms.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface RepParkFinanceByDayPOMapper {
    long countByExample(RepParkFinanceByDayPOExample example);

    int deleteByExample(RepParkFinanceByDayPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepParkFinanceByDayPO record);

    int insertSelective(RepParkFinanceByDayPO record);

    List<RepParkFinanceByDayPO> selectByExample(RepParkFinanceByDayPOExample example);

    RepParkFinanceByDayPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepParkFinanceByDayPO record, @Param("example") RepParkFinanceByDayPOExample example);

    int updateByExample(@Param("record") RepParkFinanceByDayPO record, @Param("example") RepParkFinanceByDayPOExample example);

    int updateByPrimaryKeySelective(RepParkFinanceByDayPO record);

    int updateByPrimaryKey(RepParkFinanceByDayPO record);

    Integer findMoneyCount(RepParkFinanceByDayCountDto dto);

    Integer getPayNum(RepParkFinanceByDayCountDto dto);

    List<RepParkFinanceAndParkingVO> getFinanceAndPakring(RepParkFinanceByDayCountDto dto);

   List<RepParkFinanceByDayPageVO> findAllByParams(RepParkFinanceByDayCountDto dto);

    List<RepParkFinanceDetailsVO> detailsList(RepParkFinanceByDayPO repParkFinanceByDayPO);

    List<RepParkFinanceDetailsVO> ParkDetailsList(RepParkFinanceByDayPO repParkFinanceByDayPO);

    List<RepParkFinanceAndPayTypeVO> getDealSummarize(RepParkFinanceByDayCountDto dto);

    RepFindParkDto getParkType(Integer parkingSectionId);

    List<RepParkFinanceDetailsVO> ParkReadDetailsList(RepFindParkDto parkDto);
}