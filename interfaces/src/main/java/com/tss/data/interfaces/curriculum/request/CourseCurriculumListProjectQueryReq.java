package com.tss.data.interfaces.curriculum.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 * @author zhoujie
 * @create 2018-12-10 16:13
 **/
@ApiModel(value = "请求课程分配实验项目信息列表Req", description = "请求课程分配实验项目信息列表Req")
public class CourseCurriculumListProjectQueryReq {
	@ApiModelProperty("当前页数")
	int pageNumber;

	@ApiModelProperty("页面大小")
	int pageSize;

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
