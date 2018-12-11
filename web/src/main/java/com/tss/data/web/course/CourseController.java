package com.tss.data.web.course;

import com.github.pagehelper.PageInfo;
import com.tss.basic.site.argumentresolver.JsonParam;
import com.tss.data.interfaces.course.CourseInterface;
import com.tss.data.interfaces.course.request.CourseInfoDeleteReq;
import com.tss.data.interfaces.course.request.CourseInfoEditReq;
import com.tss.data.interfaces.course.request.CourseListQueryReq;
import com.tss.data.interfaces.course.response.CourseListResp;
import com.tss.data.services.course.CourseService;
import com.tss.data.services.course.po.Course;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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

    @Autowired
    private CourseInterface courseInterface;

    @ApiOperation(value = "查询课程列表信息", notes = "查询课程列表信息")
    @PostMapping(value = "/queryCourseList")
    PageInfo<CourseListResp> queryCourseList(@JsonParam CourseListQueryReq req) {
        return courseInterface.queryCourseList(req);
    }

    @ApiOperation(value = "编辑课程信息", notes = "编辑课程信息")
    @PostMapping("/editCourse")
    void editCourseInfo(@JsonParam CourseInfoEditReq req) {
        courseInterface.editCourse(req);
    }

    @ApiOperation(value = "删除课程信息", notes = "删除课程信息")
    @PostMapping("/deleteCourseBatch")
    void deleteCourseInfo(@JsonParam CourseInfoDeleteReq req) {
        courseInterface.deleteCourse(req);
    }
}
