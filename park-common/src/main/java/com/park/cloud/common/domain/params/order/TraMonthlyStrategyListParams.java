package com.park.cloud.common.domain.params.order;

import com.park.cloud.common.domain.params.cms.CmsPageHelperParams;
import lombok.Data;

/**
 * @author liuhainan
 */
@Data
public class TraMonthlyStrategyListParams extends CmsPageHelperParams {

    private String monthlyStrategyName;
}
