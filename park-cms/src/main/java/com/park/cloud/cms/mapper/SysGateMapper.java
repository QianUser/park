package com.park.cloud.cms.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysGateMapper {
    List<String> selectSerial();

    Long selectCurrentParking(String controllerSerialNumber);
}
