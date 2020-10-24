package com.park.cloud.cms.mapper;

import com.park.cloud.common.domain.dto.cms.OpmUnbindVehicleInfoDto;
import com.park.cloud.common.domain.po.opm.OpmUnbindVehicleInfoPO;
import com.park.cloud.common.domain.po.opm.OpmUnbindVehicleInfoPOExample;
import java.util.List;

import com.park.cloud.common.domain.vo.cms.CmsMebBindVehicleInfoVO;
import com.park.cloud.common.domain.vo.cms.OpmUnbindVehicleInfoVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface OpmUnbindVehicleInfoPOMapper {
    long countByExample(OpmUnbindVehicleInfoPOExample example);

    int deleteByExample(OpmUnbindVehicleInfoPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpmUnbindVehicleInfoPO record);

    int insertSelective(OpmUnbindVehicleInfoPO record);

    List<OpmUnbindVehicleInfoPO> selectByExample(OpmUnbindVehicleInfoPOExample example);

    OpmUnbindVehicleInfoPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpmUnbindVehicleInfoPO record, @Param("example") OpmUnbindVehicleInfoPOExample example);

    int updateByExample(@Param("record") OpmUnbindVehicleInfoPO record, @Param("example") OpmUnbindVehicleInfoPOExample example);

    int updateByPrimaryKeySelective(OpmUnbindVehicleInfoPO record);

    int updateByPrimaryKey(OpmUnbindVehicleInfoPO record);

    List<CmsMebBindVehicleInfoVO> selectBindVehicleInfo(OpmUnbindVehicleInfoDto dto);

    int deleteBindVehicleInfo(@Param("mebBindVehicleInfoId") Integer mebBindVehicleInfoId);

    List<OpmUnbindVehicleInfoVO> selectByDto(OpmUnbindVehicleInfoDto dto);
}