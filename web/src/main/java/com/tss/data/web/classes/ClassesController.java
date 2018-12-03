/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Tong Liu
 * Date: 2018/11/29
 * Description:DepartmentController.java
 */
package com.tss.data.web.classes;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Tong Liu
 */
@Api(value = "班级",description = "班级管理")
@RestController
@RequestMapping("/classes")
public class ClassesController {
    
}
