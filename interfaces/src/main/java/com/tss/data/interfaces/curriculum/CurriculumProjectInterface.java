package com.tss.data.interfaces.curriculum;

import com.tss.data.interfaces.curriculum.vo.TeacherCourseCurriculumProjectRespVO;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
public interface CurriculumProjectInterface {
    TeacherCourseCurriculumProjectRespVO getTeacherCourseCurriculumProjectList(Long teacherId);
}
