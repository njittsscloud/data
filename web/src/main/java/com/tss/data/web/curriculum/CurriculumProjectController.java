package com.tss.data.web.curriculum;

import com.github.pagehelper.PageInfo;
import com.tss.basic.site.argumentresolver.JsonParam;
import com.tss.data.interfaces.curriculum.CurriculumProjectInterface;
import com.tss.data.interfaces.curriculum.request.CurriculumProjectDeleteReq;
import com.tss.data.interfaces.curriculum.request.CurriculumProjectEditReq;
import com.tss.data.interfaces.curriculum.request.CurriculumProjectQueryReq;
import com.tss.data.interfaces.curriculum.vo.CurriculumProjectBaseInfo;
import com.tss.data.interfaces.curriculum.vo.TeacherCourseCurriculumProjectRespVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
@Api(value = "课程项目模块", tags = "CurriculumProjectController", description = "课程项目模块")
@RestController
@RequestMapping("/curriculum/project")
public class CurriculumProjectController {
    private static final Logger LOG = LoggerFactory.getLogger(CurriculumProjectController.class);
    
    @Autowired
    private CurriculumProjectInterface curriculumProjectInterface;

    @ApiOperation(value = "获取教师课程分配和实验项目列表", notes = "获取教师课程分配和实验项目列表")
    @RequestMapping(value = "/getCourseCurriculumProjectList/{teacherId}", method = RequestMethod.GET)
    public TeacherCourseCurriculumProjectRespVO getTeacherCourseCurriculumProjectList(@PathVariable Long teacherId) {
        return curriculumProjectInterface.getTeacherCourseCurriculumProjectList(teacherId);
    }

    @ApiOperation(value = "获取实验项目列表", notes = "获取实验项目列表")
    @PostMapping(value = "/getCurriculumProjectList")
    public PageInfo<CurriculumProjectBaseInfo> getCurricumlumProjectList(@JsonParam CurriculumProjectQueryReq req) {
        return curriculumProjectInterface.queryCurricumProjectBaseInfoList(req);
    }

    @ApiOperation(value = "编辑实验项目信息", notes = "编辑实验项目信息")
    @PostMapping(value = "/editCurriculumProject")
    public void editCurriculumProject(@JsonParam CurriculumProjectEditReq req) {
        curriculumProjectInterface.editCurriculumProject(req);
    }

    @ApiOperation(value = "删除实验项目", notes = "删除实验项目")
    @PostMapping(value = "deleteCurriculumProject")
    public void deleteCurriculumProject(@JsonParam CurriculumProjectDeleteReq req) {
        curriculumProjectInterface.deleteCurriculumProject(req);
    }
}
