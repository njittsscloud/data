package com.tss.data.interfaces.course.request;/**
 * @Author: zhoujie
 * @Date: Create in 2018/12/5 23:52
 * @Modified by:
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 * @author zhoujie
 * @create 2018-12-05 23:52
 **/
@ApiModel(value = "请求课程信息列表Req", description = "请求课程信息列表Req")
public class CourseListQueryReq {
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
