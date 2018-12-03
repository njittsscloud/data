/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Tong Liu
 * Date: 2018/12/3
 * Description:EditdepartmentInfoReq.java
 */
package com.tss.data.interfaces.department.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Tong Liu
 */
@ApiModel(value = "编辑院系信息Req",description = "编辑院系信息Req")
public class EditdepartmentInfoReq {
    
    @ApiModelProperty("院系id,自增长")
    private Integer id;

    @ApiModelProperty("学院编号")
    private String deptNo;

    @ApiModelProperty("学院名称")
    private String deptName;

    @ApiModelProperty("学院描述")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
