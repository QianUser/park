package com.park.cloud.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.park.cloud.cms.mapper.DictBerthCityPOMapper;
import com.park.cloud.cms.mapper.OpmCorrectOrderPOMapper;
import com.park.cloud.cms.service.OpmCorrectOrderService;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.OpmCorrectOrderAuditParams;
import com.park.cloud.common.domain.params.cms.OpmCorrectOrderListParams;
import com.park.cloud.common.domain.params.cms.OpmCorrectOrderParams;
import com.park.cloud.common.domain.po.dict.DictBerthCityPO;
import com.park.cloud.common.domain.po.dict.DictBerthCityPOExample;
import com.park.cloud.common.domain.po.opm.OpmCorrectOrderPO;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.OpmCorrectOrderVO;
import com.park.cloud.common.domain.vo.cms.PeccancyFineSearchVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author liuhainan
 */
@Slf4j
@Service
public class OpmCorrectOrderServiceImpl implements OpmCorrectOrderService {

    @Autowired
    private OpmCorrectOrderPOMapper correctOrderPOMapper;

    @Autowired
    private DictBerthCityPOMapper berthCityPOMapper;

    @Override
    public CommonResult<PageHelperVO<OpmCorrectOrderVO>> search(OpmCorrectOrderListParams params) {
        //设置分页查询
        PageHelper.startPage(params.getPageNum(), params.getPageSize());
        List<OpmCorrectOrderVO> list = correctOrderPOMapper.list(params);
        PageInfo<OpmCorrectOrderVO> pageInfo = new PageInfo<>(list);
        PageHelperVO<OpmCorrectOrderVO> pageHelperVO = new PageHelperVO<>();
        BeanUtils.copyProperties(pageInfo, pageHelperVO);
        pageHelperVO.setList(list);
        return CommonResult.success(pageHelperVO);
    }

    @Transactional
    @Override
    public CommonResult<String> update(OpmCorrectOrderAuditParams params) {
        try {
            OpmCorrectOrderPO correctOrderPO = new OpmCorrectOrderPO();

            OpmCorrectOrderPO correctOrderPO1 = correctOrderPOMapper.selectByPrimaryKey(params.getCorrectId());
            if(Objects.isNull(correctOrderPO1)){
                return CommonResult.failed("纠错订单不存在");
            }

            correctOrderPO.setAuditUserId(params.getLoginSysUserId());
            correctOrderPO.setAuditTime(new Date());
            correctOrderPO.setAuditState(1);
            correctOrderPO.setCorrectId(params.getCorrectId());

            if((correctOrderPO1.getParkStatus()==0 && params.getCorrectState()==0 )
                    ||(correctOrderPO1.getParkStatus()==1 && params.getCorrectState()==1)){
                correctOrderPO.setCorrectState(0);
            }else {
                correctOrderPO.setCorrectState(1);
            }

            correctOrderPOMapper.updateByPrimaryKeySelective(correctOrderPO);

            DictBerthCityPOExample example = new DictBerthCityPOExample();
            DictBerthCityPO berthCityPO = new DictBerthCityPO();
            berthCityPO.setParkStatus(params.getCorrectState());
            example.createCriteria().andBerthCodeEqualTo(correctOrderPO1.getBerthCode());
            berthCityPOMapper.updateByExampleSelective(berthCityPO,example);
            return CommonResult.success();
        }catch (Exception e){
            log.error("更新失败！");
            log.error(e.getMessage());
            return CommonResult.failed();
        }
    }

    @Override
    public CommonResult<List<OpmCorrectOrderVO>> searchList(OpmCorrectOrderListParams params) {

        List<OpmCorrectOrderVO> list = correctOrderPOMapper.list(params);

        return CommonResult.success(list);
    }
}
