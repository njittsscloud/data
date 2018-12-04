/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Tong Liu
 * Date: 2018/12/3
 * Description:EditdepartmentInfoReq.java
 */
package com.tss.data.interfaces.classes.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "编辑班级信息Req", description = "编辑班级信息Req")
public class ClassInfoEditReq {

    @ApiModelProperty("班级id")
    private Long id;

    @ApiModelProperty("班级编号")
    private String classNo;

    @ApiModelProperty("班级名称")
    private String className;

    @ApiModelProperty("班级描述")
    private String description;

    @ApiModelProperty("所属院系id")
    private Integer deptId;

    @ApiModelProperty("院系名称")
    private String deptName;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
