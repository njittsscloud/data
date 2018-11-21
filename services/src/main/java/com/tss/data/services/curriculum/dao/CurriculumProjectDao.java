package com.tss.data.services.curriculum.dao;

import com.tss.data.interfaces.curriculum.vo.CourseCurriculumProject;
import com.tss.data.services.curriculum.po.CurriculumProject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CurriculumProjectDao {

    int insert(CurriculumProject record);

    CurriculumProject findById(Long id);

    int update(CurriculumProject record);

    List<CourseCurriculumProject> getTeacherCourseCurriculumProjectList(Long teacherId);
}