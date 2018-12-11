package com.tss.data.interfaces.curriculum.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 * @author zhoujie
 * @create 2018-12-11 17:30
 **/
@ApiModel(value = "请求实验项目基本信息列表Req", description = "请求实验项目基本信息列表Req")
public class CurriculumProjectQueryReq {
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
