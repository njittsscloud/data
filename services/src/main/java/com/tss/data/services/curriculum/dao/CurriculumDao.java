package com.tss.data.services.curriculum.dao;

import com.tss.data.services.curriculum.po.Curriculum;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface CurriculumDao {
    int deleteByPrimaryKey(Long id);

    void deleteByBatch(@Param("updateTime") Date updateTime, @Param("list") List<Long> ids);

    int insert(Curriculum record);

    int insertSelective(Curriculum record);

    Curriculum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Curriculum record);

    int updateByPrimaryKey(Curriculum record);

    List<Curriculum> selectByPage();
}