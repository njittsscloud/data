package com.tss.data.interfaces.curriculum.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
public class CurriculumProjectBaseInfo {

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
