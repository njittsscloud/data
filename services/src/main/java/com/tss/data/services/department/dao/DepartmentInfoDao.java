package com.tss.data.services.department.dao;

import com.tss.data.services.department.po.DepartmentInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentInfoDao {
    
    int deleteByPrimaryKey(Integer id);

    int insert(DepartmentInfo record);

    int insertSelective(DepartmentInfo record);

    DepartmentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DepartmentInfo record);

    int updateByPrimaryKey(DepartmentInfo record);
    
    List<DepartmentInfo> selectByPage();
}