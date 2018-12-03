package com.tss.data.services.classes.dao;


import com.tss.data.services.classes.po.ClassesInfo;

public interface ClassInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassesInfo record);

    int insertSelective(ClassesInfo record);

    ClassesInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassesInfo record);

    int updateByPrimaryKey(ClassesInfo record);
}