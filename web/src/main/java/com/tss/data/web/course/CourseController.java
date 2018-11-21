package com.tss.data.web.course;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
@Api(value = "课程分配模块", tags = "CourseController", description = "课程分配模块")
@RestController
@RequestMapping("/course")
public class CourseController {
    private static final Logger LOG = LoggerFactory.getLogger(CourseController.class);
}
