package com.tss.data.services.course.po;

import java.util.Date;

public class CourseTeacher {
    /**
     *id
     */
    private Long id;

    /**
     *课程分配id
     */
    private Long courseId;

    /**
     *课程id
     */
    private Long curriculumId;

    /**
     *课程名称
     */
    private String curriculumName;

    /**
     *教师id
     */
    private Long teacherId;

    /**
     *教师姓名
     */
    private String teacherName;

    /**
     *创建时间
     */
    private Date createTime;

    /**
     *更新时间
     */
    private Date updateTime;

    /**
     *删除标志 0正常 1已删除
     */
    private Integer delFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getCurriculumId() {
        return curriculumId;
    }

    public void setCurriculumId(Long curriculumId) {
        this.curriculumId = curriculumId;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}