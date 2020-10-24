package com.park.cloud.cms.feign.hystrix;

import com.park.cloud.cms.feign.IQSMonthCardService;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.params.cms.QSMonthCardParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.vo.cms.QSMonthCardVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <h3>park</h3>
 * <p></p>
 *
 * @author : zhangqinxiaowei
 * @date : 2020-09-16 13:31
 **/
@Component
@Slf4j
public class IQSMonthCardServiceHystrix implements IQSMonthCardService {
    @Override
    public CommonResult<PageHelperVO<QSMonthCardVO>> queryMonthCardAll(QSMonthCardParams params){
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }
}
