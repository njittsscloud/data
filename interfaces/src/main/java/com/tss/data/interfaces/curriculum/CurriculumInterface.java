package com.tss.data.interfaces.curriculum;

import com.github.pagehelper.PageInfo;
import com.tss.data.interfaces.course.request.CourseInfoDeleteReq;
import com.tss.data.interfaces.curriculum.request.CourseCurriculumDeleteReq;
import com.tss.data.interfaces.curriculum.request.CourseCurriculumEditReq;
import com.tss.data.interfaces.curriculum.request.CourseCurriculumListProjectQueryReq;
import com.tss.data.interfaces.curriculum.vo.CourseCurriculumProject;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
public interface CurriculumInterface {
	PageInfo<CourseCurriculumProject> queryCourseCurriculumList(CourseCurriculumListProjectQueryReq req);

	void editCourseCurriculum(CourseCurriculumEditReq req);

	void deleteCourseCurriculum(CourseCurriculumDeleteReq ids);
}
