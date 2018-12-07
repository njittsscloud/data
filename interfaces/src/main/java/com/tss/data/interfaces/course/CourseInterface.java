package com.tss.data.interfaces.course;

import com.github.pagehelper.PageInfo;
import com.tss.data.interfaces.course.request.CourseInfoEditReq;
import com.tss.data.interfaces.course.request.CourseListQueryReq;
import com.tss.data.interfaces.course.response.CourseListResp;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
public interface CourseInterface {
	PageInfo<CourseListResp> queryCourseList(CourseListQueryReq req);

	void editCourse(CourseInfoEditReq req);
}
