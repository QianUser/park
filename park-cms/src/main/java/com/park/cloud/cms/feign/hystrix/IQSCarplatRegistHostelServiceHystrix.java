package com.park.cloud.cms.feign.hystrix;

import com.park.cloud.cms.feign.IQSCarplatRegistHostelService;
import com.park.cloud.common.domain.params.cms.QSCarplatRegistHostelParams;
import com.park.cloud.common.domain.vo.PageHelperVO;
import com.park.cloud.common.domain.CommonErrorMessage;
import com.park.cloud.common.domain.CommonResult;
import com.park.cloud.common.domain.vo.cms.QSCarplatRegistHostelVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <h3>park</h3>
 * <p></p>
 *
 * @author : zhangqinxiaowei
 * @date : 2020-09-25 16:10
 **/
@Component
@Slf4j
public class IQSCarplatRegistHostelServiceHystrix implements IQSCarplatRegistHostelService {

    @Override
    public CommonResult<PageHelperVO<QSCarplatRegistHostelVO>> queryMonthOrderList(QSCarplatRegistHostelParams params) {
        return CommonResult.failed(CommonErrorMessage.THIRD_SERVER_ERR);
    }
}
