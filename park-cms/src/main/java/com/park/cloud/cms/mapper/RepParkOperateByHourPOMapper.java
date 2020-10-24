package com.park.cloud.cms.mapper;

import java.util.List;

import com.park.cloud.common.domain.dto.cms.ReoFindEarningsCaseDto;
import com.park.cloud.common.domain.dto.cms.RepParkByHourTopDto;
import com.park.cloud.common.domain.dto.cms.RepStatisticsByDayDto;
import com.park.cloud.common.domain.po.rep.RepParkOperateByHourPO;
import com.park.cloud.common.domain.po.rep.RepParkOperateByHourPOExample;
import com.park.cloud.common.domain.vo.cms.CantonIdSVO;
import com.park.cloud.common.domain.vo.cms.FindEarningsCaseVO;
import com.park.cloud.common.domain.vo.cms.RepParkByHourStatisticsTopVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface RepParkOperateByHourPOMapper {
    long countByExample(RepParkOperateByHourPOExample example);

    int deleteByExample(RepParkOperateByHourPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepParkOperateByHourPO record);

    int insertSelective(RepParkOperateByHourPO record);

    List<RepParkOperateByHourPO> selectByExample(RepParkOperateByHourPOExample example);

    RepParkOperateByHourPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepParkOperateByHourPO record, @Param("example") RepParkOperateByHourPOExample example);

    int updateByExample(@Param("record") RepParkOperateByHourPO record, @Param("example") RepParkOperateByHourPOExample example);

    int updateByPrimaryKeySelective(RepParkOperateByHourPO record);

    int updateByPrimaryKey(RepParkOperateByHourPO record);

    List<RepParkByHourStatisticsTopVO> findTop(RepParkByHourTopDto dto);

    Integer findBerthCount(RepParkByHourTopDto dto);


    RepParkByHourStatisticsTopVO findDataStatistics(RepStatisticsByDayDto dto);

    String findNameById(int cantonId);

    List<FindEarningsCaseVO> findAllByDate(ReoFindEarningsCaseDto dto);

    List<CantonIdSVO> findAllCantonById(@Param("loginUserCityIds") String loginUserCityIds);

    List<FindEarningsCaseVO> findAllByYearDate(ReoFindEarningsCaseDto dto);
}