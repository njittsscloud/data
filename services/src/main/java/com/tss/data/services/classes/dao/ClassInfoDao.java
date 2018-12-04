package com.tss.data.services.classes.dao;


import com.tss.data.services.classes.po.ClassInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface ClassInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassInfo record);

    int insertSelective(ClassInfo record);

    ClassInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassInfo record);

    int updateByPrimaryKey(ClassInfo record);

    List<ClassInfo> selectByPage();
    
    void batchDelete(@Param("updateTime")Date updateTime,@Param("list") List<Long> ids);
}