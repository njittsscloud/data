package com.tss.data.web.curriculum;

import com.github.pagehelper.PageInfo;
import com.tss.basic.site.argumentresolver.JsonParam;
import com.tss.data.interfaces.curriculum.request.CourseCurriculumDeleteReq;
import com.tss.data.interfaces.curriculum.request.CourseCurriculumEditReq;
import com.tss.data.interfaces.curriculum.request.CourseCurriculumListProjectQueryReq;
import com.tss.data.interfaces.curriculum.vo.CourseCurriculumProject;
import com.tss.data.services.curriculum.CurriculumService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: MQG
 * @date: 2018/11/21
 */
@Api(value = "课程模块", tags = "CurriculumController", description = "课程模块")
@RestController
@RequestMapping("/curriculum")
public class CurriculumController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CurriculumController.class);

	@Autowired
	CurriculumService curriculumService;

	@ApiOperation(value = "获取课程课表列表", notes = "获取课程课表列表")
	@PostMapping(value = "getCourseCurriculumList")
	public PageInfo<CourseCurriculumProject> getCourseCurriculumList(@JsonParam CourseCurriculumListProjectQueryReq req) {
		return curriculumService.queryCourseCurriculumList(req);
	}

	@ApiOperation(value = "编辑课程课表信息", notes = "编辑课程课表信息")
	@PostMapping(value = "editCourseCurriculum")
	void editCourseCurricmlumInfo(@JsonParam CourseCurriculumEditReq req) {
		curriculumService.editCourseCurriculum(req);
	}

	@ApiOperation(value = "删除课程课表信息", notes = "删除课程课表信息")
	void deleteCourseCurriculumInfo(@JsonParam CourseCurriculumDeleteReq req) {
		curriculumService.deleteCourseCurriculum(req);
	}
}
