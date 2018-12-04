/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Liu Tong
 * Date: 2018/12/4
 * Description:ClassInfoDeleteReq.java
 */
package com.tss.data.interfaces.classes.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * 班级信息删除Req
 *
 * @author Liu Tong
 */
@ApiModel("班级信息删除Req")
public class ClassInfoDeleteReq {

    @ApiModelProperty("班级ids")
    @Size(min = 1, message = "班级id数量应该大于1")
    private List<Long> ids;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }
}
