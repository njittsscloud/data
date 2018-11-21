package com.tss.data.services.course.dao;

import com.tss.data.services.course.po.CourseTeacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseTeacherDao {
    int deleteByPrimaryKey(Long id);

    int insert(CourseTeacher record);

    int insertSelective(CourseTeacher record);

    CourseTeacher selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CourseTeacher record);

    int updateByPrimaryKey(CourseTeacher record);
}