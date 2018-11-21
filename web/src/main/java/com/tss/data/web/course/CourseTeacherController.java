package com.tss.data.web.course;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
@Api(value = "教师课程分配模块", tags = "CourseTeacherController", description = "教师课程分配模块")
@RestController
@RequestMapping("/course/teacher")
public class CourseTeacherController {
}
