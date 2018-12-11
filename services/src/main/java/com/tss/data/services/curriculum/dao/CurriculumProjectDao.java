package com.tss.data.services.curriculum.dao;

import com.tss.data.interfaces.curriculum.vo.CourseCurriculumProject;
import com.tss.data.services.curriculum.po.CurriculumProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface CurriculumProjectDao {

    int insert(CurriculumProject record);

    void deleteByBatch(@Param("updateTime") Date updateTime, @Param("list") List<Long> ids);

    CurriculumProject findById(Long id);

    int update(CurriculumProject record);

    List<CourseCurriculumProject> getTeacherCourseCurriculumProjectList(Long teacherId);

    List<CurriculumProject> selectByPage();

}