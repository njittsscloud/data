/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Tong Liu
 * Date: 2018/11/29
 * Description:DepartmentService.java
 */
package com.tss.data.services.department;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tss.basic.common.util.ModelMapperUtil;
import com.tss.basic.site.exception.BusinessException;
import com.tss.basic.site.exception.ErrorCode;
import com.tss.data.interfaces.department.DepartmentInterface;
import com.tss.data.interfaces.department.request.EditdepartmentInfoReq;
import com.tss.data.interfaces.department.request.QueryDepartmentListReq;
import com.tss.data.interfaces.department.response.DepartmentListResp;
import com.tss.data.services.department.dao.DepartmentInfoDao;
import com.tss.data.services.department.po.DepartmentInfo;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Tong Liu
 */
@Service
public class DepartmentService implements DepartmentInterface {
    
    private static Logger LOG = LoggerFactory.getLogger(DepartmentService.class);
    
    @Autowired
    DepartmentInfoDao departmentInfoDao;

    /**
     * 分页查询院系信息
     * @return
     */
    @Override
    public PageInfo<DepartmentListResp> queryDepartmentList(QueryDepartmentListReq req) {
        PageHelper.startPage(req.getPageNumber(),req.getPageSize());
        List<DepartmentInfo> departmentInfos = departmentInfoDao.selectByPage();
        List<DepartmentListResp> departmentListResps = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(departmentInfos)){
            departmentListResps = ModelMapperUtil.strictMapList(departmentInfos, DepartmentListResp.class);
        }
        PageInfo<DepartmentListResp> pageInfo = new PageInfo<>(departmentListResps);
        
        return pageInfo;
    }

    @Override
    public void editDepartment(EditdepartmentInfoReq req) {
        DepartmentInfo departmentInfo = new DepartmentInfo();
        BeanUtils.copyProperties(req,departmentInfo);
        
        if (req.getId()==null){ //insert
            Date createTime = new Date();
            departmentInfo.setCreateTime(createTime);
            departmentInfo.setUpdateTime(createTime);
            
            departmentInfoDao.insertSelective(departmentInfo);
            
        }else { //update
            departmentInfo.setUpdateTime(new Date());
            DepartmentInfo departmentInfo1 = departmentInfoDao.selectByPrimaryKey(req.getId());
            if (departmentInfo1==null){
                LOG.error("department info is not exist by id{}"+ req.getId());
                throw new BusinessException(new ErrorCode(1,"院系信息不存在"));
            }
            departmentInfoDao.updateByPrimaryKeySelective(departmentInfo);
        }
    }

    @Override
    public void delete(int id) {
        departmentInfoDao.deleteByPrimaryKey(id);
    }
}
