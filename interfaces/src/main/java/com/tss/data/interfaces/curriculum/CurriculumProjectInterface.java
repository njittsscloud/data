package com.tss.data.interfaces.curriculum;

import com.github.pagehelper.PageInfo;
import com.tss.data.interfaces.curriculum.request.CurriculumProjectDeleteReq;
import com.tss.data.interfaces.curriculum.request.CurriculumProjectEditReq;
import com.tss.data.interfaces.curriculum.request.CurriculumProjectQueryReq;
import com.tss.data.interfaces.curriculum.vo.CurriculumProjectBaseInfo;
import com.tss.data.interfaces.curriculum.vo.TeacherCourseCurriculumProjectRespVO;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
public interface CurriculumProjectInterface {
    TeacherCourseCurriculumProjectRespVO getTeacherCourseCurriculumProjectList(Long teacherId);

    PageInfo<CurriculumProjectBaseInfo> queryCurricumProjectBaseInfoList(CurriculumProjectQueryReq req);

    void editCurriculumProject(CurriculumProjectEditReq req);

    void deleteCurriculumProject(CurriculumProjectDeleteReq req);
}
