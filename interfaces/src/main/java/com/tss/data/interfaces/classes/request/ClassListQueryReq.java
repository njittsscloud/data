/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Tong Liu
 * Date: 2018/12/2
 * Description:QueryDepartmentListReq.java
 */
package com.tss.data.interfaces.classes.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Tong Liu
 */
@ApiModel(value = "请求院系列表Req", description = "请求院系列表Req")
public class ClassListQueryReq {
    
    @ApiModelProperty("当前页数")
    int pageNumber;

    @ApiModelProperty("页面大小")
    int pageSize;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
