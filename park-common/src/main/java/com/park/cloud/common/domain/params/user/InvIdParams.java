package com.park.cloud.common.domain.params.user;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author liuhainan
 */
@Data
public class InvIdParams extends ClientBaseParams{

    @NotNull(message = "请输入id")
    private String id;
}
