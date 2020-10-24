package com.park.cloud.common.domain.vo.export;

import lombok.Data;

import java.util.List;

/**
 * @author xjd
 * @title: BaseExportVO
 * @description: TODO
 * @date 2019/4/2 17:46
 */
@Data
public class BaseExportVO<T> {
    private List<T> childList;
}
