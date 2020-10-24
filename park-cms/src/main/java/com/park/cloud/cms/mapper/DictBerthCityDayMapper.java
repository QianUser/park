package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.DictBerthCityDayDto;
import com.park.cloud.common.domain.po.dict.DictBerthCityDayPO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DictBerthCityDayMapper {

    List<DictBerthCityDayPO> selectBerthCityDay(DictBerthCityDayDto dto);

}