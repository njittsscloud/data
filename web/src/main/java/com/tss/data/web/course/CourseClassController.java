package com.tss.data.web.course;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
@Api(value = "班级课程分配模块", tags = "CourseClassController", description = "班级课程分配模块")
@RestController
@RequestMapping("/course/class")
public class CourseClassController {
}
