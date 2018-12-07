package com.tss.data.interfaces.course.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 *
 * @author zhoujie
 * @create 2018-12-06 0:04
 **/
@ApiModel(value = "编辑课程信息Req", description = "编辑课程信息Req")
public class CourseInfoEditReq {

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
}
