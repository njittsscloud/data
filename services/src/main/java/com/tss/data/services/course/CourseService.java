package com.tss.data.services.course;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tss.basic.common.util.ModelMapperUtil;
import com.tss.data.interfaces.course.CourseInterface;
import com.tss.data.interfaces.course.request.CourseInfoDeleteReq;
import com.tss.data.interfaces.course.request.CourseInfoEditReq;
import com.tss.data.interfaces.course.request.CourseListQueryReq;
import com.tss.data.interfaces.course.response.CourseListResp;
import com.tss.data.services.course.dao.CourseDao;
import com.tss.data.services.course.po.Course;
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
public class CourseService implements CourseInterface {
	@Autowired
	CourseDao courseDao;

	@Override
	public PageInfo<CourseListResp> queryCourseList(CourseListQueryReq req) {
		List<Course> couseList = courseDao.selectByPage();
		PageHelper.startPage(req.getPageNumber(), req.getPageSize());
		List<CourseListResp> courseListRespList = new ArrayList<>();

		if (CollectionUtils.isNotEmpty(couseList)) {
			courseListRespList = ModelMapperUtil.strictMapList(couseList, CourseListResp.class);
		}
		PageInfo<CourseListResp> pageInfo = new PageInfo<>(courseListRespList);
		return pageInfo;
	}

	@Override
	public void editCourse(CourseInfoEditReq req) {
		Course course = new Course();
		BeanUtils.copyProperties(req, course);

		if (req.getId() != null) {
			Date creaTime = new Date();
			course.setCreateTime(creaTime);
			course.setUpdateTime(creaTime);
			courseDao.insertSelective(course);
		} else {
			course.setUpdateTime(new Date());
			courseDao.updateByPrimaryKeySelective(course);
		}
	}

	@Override
	public void deleteCourse(CourseInfoDeleteReq req) {
		courseDao.deleteByBatch(new Date(), req.getIds());
	}
}
