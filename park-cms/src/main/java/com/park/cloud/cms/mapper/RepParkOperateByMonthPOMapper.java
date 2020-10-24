package com.park.cloud.cms.mapper;

import java.util.Collection;
import java.util.List;

import com.park.cloud.common.domain.dto.cms.RepParkOperateByMonthDto;
import com.park.cloud.common.domain.dto.cms.RepParkOperateDetailsDto;
import com.park.cloud.common.domain.dto.cms.RepRunStatisicsByMonthDto;
import com.park.cloud.common.domain.po.rep.RepParkOperateByMonthPO;
import com.park.cloud.common.domain.po.rep.RepParkOperateByMonthPOExample;
import com.park.cloud.common.domain.vo.cms.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface RepParkOperateByMonthPOMapper {
    long countByExample(RepParkOperateByMonthPOExample example);

    int deleteByExample(RepParkOperateByMonthPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepParkOperateByMonthPO record);

    int insertSelective(RepParkOperateByMonthPO record);

    List<RepParkOperateByMonthPO> selectByExample(RepParkOperateByMonthPOExample example);

    RepParkOperateByMonthPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepParkOperateByMonthPO record, @Param("example") RepParkOperateByMonthPOExample example);

    int updateByExample(@Param("record") RepParkOperateByMonthPO record, @Param("example") RepParkOperateByMonthPOExample example);

    int updateByPrimaryKeySelective(RepParkOperateByMonthPO record);

    int updateByPrimaryKey(RepParkOperateByMonthPO record);

    List<RepParkOperateByMonthVO> dealStatistics(RepParkOperateByMonthDto dto);

    Integer findCount();

    List<RepParkOperateByMonthPageVO> findRepPark(RepParkOperateByMonthDto dto);

    List<RepParkOperateDetailsVO> detailsList(RepParkOperateDetailsDto dto);

    List<RepParkOperateDetailsVO> detailsListBySertionId(RepParkOperateDetailsDto dto);

    List<RepRunStatisticsByMonthVO> findRepRunStatics(RepRunStatisicsByMonthDto dto);

    List<RepRunStatisticsTopVO> findAllByDate(RepRunStatisicsByMonthDto dto);

    List<RepRunBelowStatisticsVO> findAllByBelowDate(RepRunStatisicsByMonthDto dto);
}