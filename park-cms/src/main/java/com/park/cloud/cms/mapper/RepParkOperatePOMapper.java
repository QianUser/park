package com.park.cloud.cms.mapper;

import java.util.Collection;
import java.util.List;

import com.park.cloud.common.domain.dto.cms.*;
import com.park.cloud.common.domain.po.dict.DictParkingCityPO;
import com.park.cloud.common.domain.po.dict.DictSectionPO;
import com.park.cloud.common.domain.po.rep.RepParkOperatePO;
import com.park.cloud.common.domain.po.rep.RepParkOperatePOExample;
import com.park.cloud.common.domain.vo.cms.ParkClearingPageVO;
import com.park.cloud.common.domain.vo.cms.RepParkOperatePageVO;
import com.park.cloud.common.domain.vo.cms.RepParkOperateVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface RepParkOperatePOMapper {
    long countByExample(RepParkOperatePOExample example);

    int deleteByExample(RepParkOperatePOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepParkOperatePO record);

    int insertSelective(RepParkOperatePO record);

    List<RepParkOperatePO> selectByExample(RepParkOperatePOExample example);

    RepParkOperatePO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepParkOperatePO record, @Param("example") RepParkOperatePOExample example);

    int updateByExample(@Param("record") RepParkOperatePO record, @Param("example") RepParkOperatePOExample example);

    int updateByPrimaryKeySelective(RepParkOperatePO record);

    int updateByPrimaryKey(RepParkOperatePO record);

    List<RepParkOperateVO> dealStatistics(RepParkOperateDto dto);


    List<RepParkOperatePageVO> findAllBySection(RepParkOperatePageDto dto);

    List<RepParkOperatePageVO> findAllByParking(RepParkOperatePageDto dto);

    List<DictSectionPO> findAllSection(FindCantonDto dto);

    List<DictParkingCityPO> findAllParkingCity(FindCantonDto dto);

    double findMoneyBySectionId(Integer sectionId);

    double findMoneyByParkId(Integer parkingId);

    List<ParkClearingPageVO> getParkClearing(parkClearingDto dto);


    Integer findOrderCount(RepRoadStatisticsDto dto);

    Integer findFinishOrderCount(RepRoadStatisticsDto dto);

    Integer findArrearageOrderCount(RepRoadStatisticsDto dto);

    Integer findPaymentOrderCount(RepRoadStatisticsDto dto);

    Integer findEarningsCount(RepRoadStatisticsDto dto);

    Integer findBerthCount(RepRoadStatisticsDto dto);

    Integer findSelfHelpPay(RepRoadStatisticsDto dto);

    Integer findPDAPay(RepRoadStatisticsDto dto);

    List<RepParkOperatePageVO> findAll(RepParkOperatePageDto dto);
}