/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Tong Liu
 * Date: 2018/11/29
 * Description:DepartmentController.java
 */
package com.tss.data.web.department;

import com.github.pagehelper.PageInfo;
import com.tss.basic.site.argumentresolver.JsonParam;
import com.tss.basic.site.exception.BusinessException;
import com.tss.basic.site.exception.ErrorCode;
import com.tss.data.interfaces.department.DepartmentInterface;
import com.tss.data.interfaces.department.request.EditdepartmentInfoReq;
import com.tss.data.interfaces.department.request.QueryDepartmentListReq;
import com.tss.data.interfaces.department.response.DepartmentListResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tong Liu
 */
@Api(value = "院系",description = "院系管理")
@RestController
@RequestMapping("/department")
public class DepartmentController {
    
    @Autowired
    DepartmentInterface departmentInterface;
    
    @ApiOperation(value = "查询院系列表信息",notes = "查询院系列表信息")
    @RequestMapping(value = "/queryDepartmentList",method = RequestMethod.POST)
    PageInfo<DepartmentListResp> querydepartmentList(@JsonParam QueryDepartmentListReq req){
        return  departmentInterface.queryDepartmentList(req);
    }
    
    @ApiOperation(value="編輯院系信息",notes = "編輯学生信息")
    @RequestMapping(value = "/editDepartmentInfo",method = RequestMethod.POST)
    void editDepartmentInfo(@JsonParam EditdepartmentInfoReq req){
        departmentInterface.editDepartment(req);
    }
    
    @ApiOperation(value = "删除院系信息",notes = "删除院系信息")
    @RequestMapping(value ="/deleteDepartMent/{id}",method = RequestMethod.GET)
    void deletedepartMentInfo(@PathVariable("id") Integer id){
        if (id==null){
            throw new BusinessException(new ErrorCode(1,"院系id不为空"));
        }
        departmentInterface.delete(id);
    }
    
}
