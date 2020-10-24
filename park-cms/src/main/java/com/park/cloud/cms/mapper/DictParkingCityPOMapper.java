package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.DictParkingCityDto;
import com.park.cloud.common.domain.po.dict.DictParkingCityPO;
import com.park.cloud.common.domain.po.dict.DictParkingCityPOExample;
import com.park.cloud.common.domain.vo.cms.DictParkingCityListVO;
import com.park.cloud.common.domain.vo.cms.DictParkingCityVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DictParkingCityPOMapper {
    long countByExample(DictParkingCityPOExample example);

    int deleteByExample(DictParkingCityPOExample example);

    int deleteByPrimaryKey(Integer parkingId);

    int insert(DictParkingCityPO record);

    int insertSelective(DictParkingCityPO record);

    List<DictParkingCityPO> selectByExample(DictParkingCityPOExample example);

    DictParkingCityPO selectByPrimaryKey(Integer parkingId);

    int updateByExampleSelective(@Param("record") DictParkingCityPO record, @Param("example") DictParkingCityPOExample example);

    int updateByExample(@Param("record") DictParkingCityPO record, @Param("example") DictParkingCityPOExample example);

    int updateByPrimaryKeySelective(DictParkingCityPO record);

    int updateByPrimaryKey(DictParkingCityPO record);

    List<DictParkingCityVO> selectByDto(DictParkingCityDto dto);

    DictParkingCityVO selectDetailById(@Param("parkingId") Integer parkingId);

    List<DictParkingCityListVO> selectListByDto(DictParkingCityDto dto);

    List<DictParkingCityVO> selectListWithParentByDto(DictParkingCityDto dto);
}