package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.DictLongParkingDto;
import com.park.cloud.common.domain.po.dict.DictLongParkingPO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DictLongParkingMapper {

    List<DictLongParkingPO> selectLongParking(DictLongParkingDto dto);

}