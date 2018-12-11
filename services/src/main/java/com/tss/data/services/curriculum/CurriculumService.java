package com.tss.data.services.curriculum;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tss.basic.common.util.ModelMapperUtil;
import com.tss.data.interfaces.course.request.CourseInfoDeleteReq;
import com.tss.data.interfaces.curriculum.CurriculumInterface;
import com.tss.data.interfaces.curriculum.request.CourseCurriculumDeleteReq;
import com.tss.data.interfaces.curriculum.request.CourseCurriculumEditReq;
import com.tss.data.interfaces.curriculum.request.CourseCurriculumListProjectQueryReq;
import com.tss.data.interfaces.curriculum.vo.CourseCurriculumProject;
import com.tss.data.services.curriculum.dao.CurriculumDao;
import com.tss.data.services.curriculum.po.Curriculum;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
@Service
public class CurriculumService implements CurriculumInterface {
	@Autowired
	CurriculumDao curriculumDao;

	@Override
	public PageInfo<CourseCurriculumProject> queryCourseCurriculumList(CourseCurriculumListProjectQueryReq req) {
		List<Curriculum> curriculumList = curriculumDao.selectByPage();
		PageHelper.startPage(req.getPageNumber(), req.getPageSize());
		List<CourseCurriculumProject> courseCurriculumProjectList = new ArrayList<>();

		if (CollectionUtils.isNotEmpty(curriculumList)) {
			courseCurriculumProjectList = ModelMapperUtil.strictMapList(curriculumList, CourseCurriculumProject.class);
		}
		PageInfo<CourseCurriculumProject> pageInfo = new PageInfo<>(courseCurriculumProjectList);
		return pageInfo;
	}

	@Override
	public void editCourseCurriculum(CourseCurriculumEditReq req) {
		Curriculum curriculum = new Curriculum();
		BeanUtils.copyProperties(req, curriculum);

		if (req.getCourseId() != null) {
			Date createTime = new Date();
			curriculum.setCreateTime(createTime);
			curriculum.setUpdateTime(createTime);
			curriculumDao.insertSelective(curriculum);
		} else {
			curriculum.setUpdateTime(new Date());
			curriculumDao.updateByPrimaryKeySelective(curriculum);
		}

	}

	@Override
	public void deleteCourseCurriculum(CourseCurriculumDeleteReq req) {
		curriculumDao.deleteByBatch(new Date(), req.getIds());
	}
}
