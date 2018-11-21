package com.tss.data.services.curriculum.dao;

import com.tss.data.services.curriculum.po.Curriculum;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CurriculumDao {
    int deleteByPrimaryKey(Long id);

    int insert(Curriculum record);

    int insertSelective(Curriculum record);

    Curriculum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Curriculum record);

    int updateByPrimaryKey(Curriculum record);
}