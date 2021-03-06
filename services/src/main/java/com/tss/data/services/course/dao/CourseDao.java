package com.tss.data.services.course.dao;

import com.tss.data.services.course.po.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface CourseDao {
    int deleteByPrimaryKey(Long id);

    void deleteByBatch(@Param("updateTime") Date updateTime, @Param("list") List<Long> ids);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    List<Course> selectByPage();

}