package com.tss.data.interfaces.course.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.util.List;

/**
 *
 * @author zhoujie
 * @create 2018-12-07 23:42
 **/
@ApiModel(value = "课程信息删除Req", description = "课程信息删除Req")
public class CourseInfoDeleteReq {
	@ApiModelProperty("课程ids")
	@Size(min = 1, message = "传入的需要删除的课程id数应该大于1")
	private List<Long> ids;

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}
}
