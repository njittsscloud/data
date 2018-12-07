package com.tss.data.interfaces.course.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 *
 * @author zhoujie
 * @create 2018-12-05 23:44
 **/
@ApiModel("课程信息列表")
public class CourseListResp {
	@ApiModelProperty("课程id")
	private Long id;

	@ApiModelProperty("学年")
	private String year;

	@ApiModelProperty("学期")
	private Integer term;

	@ApiModelProperty("起止周")
	private String week;

	@ApiModelProperty("课程id")
	private Long curriculumId;

	@ApiModelProperty("课程名称")
	private String curriculumName;

	@ApiModelProperty("创建时间")
	private Date createTime;

	@ApiModelProperty("更新时间")
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
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
}
