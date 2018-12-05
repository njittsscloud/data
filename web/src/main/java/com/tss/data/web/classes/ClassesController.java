/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Tong Liu
 * Date: 2018/11/29
 * Description:DepartmentController.java
 */
package com.tss.data.web.classes;

import com.github.pagehelper.PageInfo;
import com.tss.basic.site.argumentresolver.JsonParam;
import com.tss.data.interfaces.classes.ClassesInterface;
import com.tss.data.interfaces.classes.request.ClassInfoDeleteReq;
import com.tss.data.interfaces.classes.request.ClassInfoEditReq;
import com.tss.data.interfaces.classes.request.ClassListQueryReq;
import com.tss.data.interfaces.classes.response.ClassListResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tong Liu
 */
@Api(value = "班级管理", tags = "ClassController", description = "班级管理")
@RestController
@RequestMapping("/classes")
public class ClassesController {

    @Autowired
    ClassesInterface classesInterface;

    @ApiOperation(value = "查询班级列表信息", notes = "查询班级列表信息")
    @RequestMapping(value = "/queryClassList", method = RequestMethod.POST)
    PageInfo<ClassListResp> queryClassList(@JsonParam ClassListQueryReq req) {
        return classesInterface.queryClassList(req);
    }

    @ApiOperation(value = "编辑班级信息", notes = "编辑班级信息")
    @RequestMapping(value = "/editClassInfo", method = RequestMethod.POST)
    void editClassInfo(@JsonParam ClassInfoEditReq req) {
        classesInterface.editClass(req);
    }

    @ApiOperation(value = "删除班级信息", notes = "删除班级信息批量")
    @RequestMapping(value = "/deleteClassBatch", method = RequestMethod.POST)
    void deleteClassInfo(@JsonParam(validation = true) ClassInfoDeleteReq req) {
        classesInterface.delete(req);
    }
}
