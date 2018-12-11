package com.tss.data.interfaces.curriculum.request;/**
 * @Author: zhoujie
 * @Date: Create in 2018/12/11 23:11
 * @Modified by:
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 * @author zhoujie
 * @create 2018-12-11 23:11
 **/
@ApiModel(value = "实验项目信息编辑Req", description = "实验项目信息编辑Req")
public class CurriculumProjectEditReq {
	@ApiModelProperty(value = "实验项目id")
	private Long projectId;

	@ApiModelProperty(value = "实验项目名称")
	private String projectName;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}
