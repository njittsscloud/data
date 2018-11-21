package com.tss.data.services.course.dao;

import com.tss.data.services.course.po.CourseClass;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseClassDao {
    int deleteByPrimaryKey(Long id);

    int insert(CourseClass record);

    int insertSelective(CourseClass record);

    CourseClass selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CourseClass record);

    int updateByPrimaryKey(CourseClass record);
}