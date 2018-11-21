package com.tss.data.interfaces.curriculum.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
@ApiModel
public class TeacherCourseCurriculumProjectRespVO {
    
    @ApiModelProperty(value = "课程项目列表")
    private List<CourseCurriculumProject> courseProjectList;

    public List<CourseCurriculumProject> getCourseProjectList() {
        return courseProjectList;
    }

    public void setCourseProjectList(List<CourseCurriculumProject> courseProjectList) {
        this.courseProjectList = courseProjectList;
    }
}
