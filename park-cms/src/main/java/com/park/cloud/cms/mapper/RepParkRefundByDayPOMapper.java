package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.RepParkCountRefundDto;
import com.park.cloud.common.domain.dto.cms.RepParkRefundByDayDto;
import com.park.cloud.common.domain.po.rep.RepParkRefundByDayPO;
import com.park.cloud.common.domain.po.rep.RepParkRefundByDayPOExample;
import com.park.cloud.common.domain.vo.cms.RepParkRefundByDayVO;
import com.park.cloud.common.domain.vo.cms.RepParkingAndRefundVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RepParkRefundByDayPOMapper {
    long countByExample(RepParkRefundByDayPOExample example);

    int deleteByExample(RepParkRefundByDayPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RepParkRefundByDayPO record);

    int insertSelective(RepParkRefundByDayPO record);

    List<RepParkRefundByDayPO> selectByExample(RepParkRefundByDayPOExample example);

    RepParkRefundByDayPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RepParkRefundByDayPO record, @Param("example") RepParkRefundByDayPOExample example);

    int updateByExample(@Param("record") RepParkRefundByDayPO record, @Param("example") RepParkRefundByDayPOExample example);

    int updateByPrimaryKeySelective(RepParkRefundByDayPO record);

    int updateByPrimaryKey(RepParkRefundByDayPO record);

    List<RepParkRefundByDayVO> getRepParkRefund(RepParkRefundByDayDto dto);

    Integer findMoneyCount(RepParkCountRefundDto dto);

    Integer getRefundCount(RepParkCountRefundDto dto);

    List<RepParkingAndRefundVO> getRefundAndPakring(RepParkCountRefundDto dto);
}