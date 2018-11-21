package com.tss.data.services.curriculum;

import com.tss.data.interfaces.curriculum.CurriculumProjectInterface;
import com.tss.data.interfaces.curriculum.vo.TeacherCourseCurriculumProjectRespVO;
import com.tss.data.services.curriculum.dao.CurriculumDao;
import com.tss.data.services.curriculum.dao.CurriculumProjectDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
@Service
public class CurriculumProjectService implements CurriculumProjectInterface {
    private static final Logger LOG = LoggerFactory.getLogger(CurriculumProjectService.class);

    @Autowired
    private CurriculumDao curriculumDao;
    @Autowired
    private CurriculumProjectDao curriculumProjectDao;
    
    @Override
    public TeacherCourseCurriculumProjectRespVO getTeacherCourseCurriculumProjectList(Long teacherId) {
        TeacherCourseCurriculumProjectRespVO resp = new TeacherCourseCurriculumProjectRespVO();
        resp.setCourseProjectList(curriculumProjectDao.getTeacherCourseCurriculumProjectList(teacherId));
        return resp;
    }
}
