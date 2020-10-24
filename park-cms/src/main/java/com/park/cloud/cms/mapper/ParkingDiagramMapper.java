package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.OverviewDto;
import com.park.cloud.common.domain.vo.cms.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ParkingDiagramMapper {

    List<ParkingDiagramVO> selectParking(OverviewDto dto);

    List<ParkingSaturationVO> selectSaturation(OverviewDto dto);

    ParkingAmountVO selectParkingAmount(OverviewDto dto);

    List<ParkingAmountDayVO> selectParkingAmountThisMonth(OverviewDto dto);

    List<ParkingAmountDayVO> selectParkingAmountLastMonth(OverviewDto dto);

    List<ParkingAmountTimeVO> selectParkingAmountOffRoad(OverviewDto dto);

    List<ParkingAmountTimeVO> selectParkingAmountCurb(OverviewDto dto);

    List<ParkingCountTimeVO> selectParkingCountOffRoad(OverviewDto dto);

    List<ParkingCountTimeVO> selectParkingCountCurb(OverviewDto dto);

    ParkingTypeVO selectParkingType(OverviewDto dto);

    ParkingServiceVO selectParkingService(OverviewDto dto);

    ParkingTimeVO selectParkingTime(OverviewDto dto);

    List<ParkingAmountAllVO> selectParkingAmountAll(OverviewDto dto);

    ParkingDiagramInfoVO selectParkingLatLng(OverviewDto dto);
}