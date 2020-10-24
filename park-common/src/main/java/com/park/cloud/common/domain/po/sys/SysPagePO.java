package com.park.cloud.common.domain.po.sys;

import lombok.Data;

@Data
public class SysPagePO {
    private Integer pageId;

    private String pageName;

    private String pageRemark;

    private String pageUrl;

    private Integer parentId;

    private String pageIcon;

    private Integer pageSort;

    private Integer pageLevel;

    private Integer pageType;

}