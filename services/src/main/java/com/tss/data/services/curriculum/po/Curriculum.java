package com.tss.data.services.curriculum.po;

import java.math.BigDecimal;
import java.util.Date;

public class Curriculum {
    /**
     *id
     */
    private Long id;

    /**
     *课程名称
     */
    private String name;

    /**
     *课程编号
     */
    private String code;

    /**
     *学分
     */
    private BigDecimal credit;

    /**
     *讲课学时
     */
    private Integer teachClassHour;

    /**
     *总学时
     */
    private Integer totalClassHour;

    /**
     *学院id
     */
    private Long academicId;

    /**
     *学院名称
     */
    private String academicName;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    public Integer getTeachClassHour() {
        return teachClassHour;
    }

    public void setTeachClassHour(Integer teachClassHour) {
        this.teachClassHour = teachClassHour;
    }

    public Integer getTotalClassHour() {
        return totalClassHour;
    }

    public void setTotalClassHour(Integer totalClassHour) {
        this.totalClassHour = totalClassHour;
    }

    public Long getAcademicId() {
        return academicId;
    }

    public void setAcademicId(Long academicId) {
        this.academicId = academicId;
    }

    public String getAcademicName() {
        return academicName;
    }

    public void setAcademicName(String academicName) {
        this.academicName = academicName;
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