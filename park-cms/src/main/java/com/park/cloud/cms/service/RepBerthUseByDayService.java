package com.park.cloud.cms.service;

        import com.park.cloud.common.domain.CommonResult;
        import com.park.cloud.common.domain.params.cms.RepBerthUseByDayParams;
        import com.park.cloud.common.domain.vo.PageHelperVO;
        import com.park.cloud.common.domain.vo.cms.RepBerthUseByDayVO;

        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.io.UnsupportedEncodingException;

/**
 * OpmUnbindVehicleInfoService
 * 〈路边停车收费率报表〉
 *
 * @author liyj1
 * @create 2020/2/11
 * @since 1.0.0
 */
public interface RepBerthUseByDayService {

    //根据条件查询列表数据
    CommonResult<PageHelperVO<RepBerthUseByDayVO>> getRepBerthUse(RepBerthUseByDayParams params);



}
