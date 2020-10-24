package com.park.cloud.cms.feign;

import com.park.cloud.cms.feign.hystrix.IQSMonthCardServiceHystrix;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.QSMonthCardParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.QSMonthCardVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * <p></p>
 *
 * @author : zhangqinxiaowei
 * @date : 2020-09-15 18:26
 **/
@Service
@FeignClient(value = "park-rule-model", fallback = IQSMonthCardServiceHystrix.class)
public interface IQSMonthCardService {

    @PostMapping("qSMonthCard/queryMonthCardAll")
    CommonResult<PageHelperVO<QSMonthCardVO>> queryMonthCardAll(QSMonthCardParams params);
}
