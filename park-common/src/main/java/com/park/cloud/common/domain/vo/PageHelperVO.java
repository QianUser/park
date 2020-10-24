package com.park.cloud.common.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * @author kris_ni
 * @date 2018/12/11
 */
@Data
@ApiModel
@Component
@Scope("prototype")
public class PageHelperVO<T> implements Serializable {

    @ApiModelProperty(value = "页码，当前页")
    private int pageNum;

    @ApiModelProperty(value = "每页条数")
    private int pageSize;

    @ApiModelProperty(value = "总条数")
    private long total;

    @ApiModelProperty(value = "页数")
    private int pages;

    @ApiModelProperty(value = "列表数据")
    private List<T> list;

    @ApiModelProperty(value = "列表统计数据")
    private T t;

}
