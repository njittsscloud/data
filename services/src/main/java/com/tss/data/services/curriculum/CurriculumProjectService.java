package com.tss.data.services.curriculum;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tss.basic.common.util.ModelMapperUtil;
import com.tss.data.interfaces.curriculum.CurriculumProjectInterface;
import com.tss.data.interfaces.curriculum.request.CurriculumProjectDeleteReq;
import com.tss.data.interfaces.curriculum.request.CurriculumProjectEditReq;
import com.tss.data.interfaces.curriculum.request.CurriculumProjectQueryReq;
import com.tss.data.interfaces.curriculum.vo.CurriculumProjectBaseInfo;
import com.tss.data.interfaces.curriculum.vo.TeacherCourseCurriculumProjectRespVO;
import com.tss.data.services.curriculum.dao.CurriculumDao;
import com.tss.data.services.curriculum.dao.CurriculumProjectDao;
import com.tss.data.services.curriculum.po.CurriculumProject;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class CurriculumProjectService implements CurriculumProjectInterface {
	private static final Logger LOG = LoggerFactory.getLogger(CurriculumProjectService.class);

	@Autowired
	private CurriculumProjectDao curriculumProjectDao;

	@Override
	public TeacherCourseCurriculumProjectRespVO getTeacherCourseCurriculumProjectList(Long teacherId) {
		TeacherCourseCurriculumProjectRespVO resp = new TeacherCourseCurriculumProjectRespVO();
		resp.setCourseProjectList(curriculumProjectDao.getTeacherCourseCurriculumProjectList(teacherId));
		return resp;
	}

	@Override
	public PageInfo<CurriculumProjectBaseInfo> queryCurricumProjectBaseInfoList(CurriculumProjectQueryReq req) {
		List<CurriculumProject> curriculumProjectList = curriculumProjectDao.selectByPage();
		PageHelper.startPage(req.getPageNumber(), req.getPageSize());
		List<CurriculumProjectBaseInfo> curriculumProjectBaseInfoList = new ArrayList<>();

		if (CollectionUtils.isNotEmpty(curriculumProjectList)) {
			curriculumProjectBaseInfoList = ModelMapperUtil.strictMapList(curriculumProjectList, CurriculumProjectBaseInfo.class);
		}
		PageInfo<CurriculumProjectBaseInfo> pageInfo = new PageInfo<>(curriculumProjectBaseInfoList);
		return pageInfo;
	}

	@Override
	public void editCurriculumProject(CurriculumProjectEditReq req) {
		CurriculumProject curriculumProject = new CurriculumProject();
		BeanUtils.copyProperties(req, curriculumProject);

		if (req.getProjectId() != null) {
			Date createTime = new Date();
            curriculumProject.setCreateTime(createTime);
            curriculumProject.setUpdateTime(createTime);
            curriculumProjectDao.insert(curriculumProject);
		} else {
			curriculumProject.setUpdateTime(new Date());
			curriculumProjectDao.update(curriculumProject);
		}
	}


	@Override
	public void deleteCurriculumProject(CurriculumProjectDeleteReq req) {
		curriculumProjectDao.deleteByBatch(new Date(), req.getIds());
	}
}
