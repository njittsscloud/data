package com.tss.data.services.curriculum.po;

import java.util.Date;

public class CurriculumProject {
    /**
     *id
     */
    private Long id;

    /**
     *项目编号
     */
    private String code;

    /**
     *项目名称
     */
    private String name;

    /**
     *项目学时数
     */
    private Integer projectHour;

    /**
     *课程id
     */
    private Long curriculumId;

    /**
     *课程名称
     */
    private String curriculumName;

    /**
     *描述
     */
    private String desc;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProjectHour() {
        return projectHour;
    }

    public void setProjectHour(Integer projectHour) {
        this.projectHour = projectHour;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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