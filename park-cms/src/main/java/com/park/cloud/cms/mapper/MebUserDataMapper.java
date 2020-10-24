package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.MebUserDataDto;
import com.park.cloud.common.domain.po.meb.MebUserDataPO;
import com.park.cloud.common.domain.vo.cms.MebUserDataDayVO;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public interface MebUserDataMapper {

    MebUserDataPO selectUserCount();

    List<MebUserDataPO> selectUserData(MebUserDataDto dto);

    List<MebUserDataDayVO> selectNewUserDataMonth(Date month);

    List<MebUserDataDayVO> selectTradeUserDataMonth(Date month);

    List<MebUserDataDayVO> selectActiveUserDataMonth(Date month);
}