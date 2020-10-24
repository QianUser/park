package com.park.cloud.cms.feign;

import com.park.cloud.cms.feign.hystrix.IQSCarplatRegistHostelServiceHystrix;
import com.park.cloud.common.domain.params.cms.QSCarplatRegistHostelParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.vo.cms.QSCarplatRegistHostelVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * <p></p>
 *
 * @author : zhangqinxiaowei
 * @date : 2020-09-25 16:09
 **/
@Service
@FeignClient(value = "park-rule-model", fallback = IQSCarplatRegistHostelServiceHystrix.class)
public interface IQSCarplatRegistHostelService {

    @PostMapping("qSCarplatRegistHostel/queryMonthOrderList")
    CommonResult<PageHelperVO<QSCarplatRegistHostelVO>> queryMonthOrderList(QSCarplatRegistHostelParams params);
}
