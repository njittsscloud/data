package com.tss.data.services.course.dao;

import com.tss.data.services.course.po.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseDao {
    int deleteByPrimaryKey(Long id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}