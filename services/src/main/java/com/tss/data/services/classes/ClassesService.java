/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Tong Liu
 * Date: 2018/11/29
 * Description:ClassesService.java
 */
package com.tss.data.services.classes;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tss.basic.common.util.ModelMapperUtil;
import com.tss.data.interfaces.classes.ClassesInterface;
import com.tss.data.interfaces.classes.request.ClassInfoDeleteReq;
import com.tss.data.interfaces.classes.request.ClassInfoEditReq;
import com.tss.data.interfaces.classes.request.ClassListQueryReq;
import com.tss.data.interfaces.classes.response.ClassListResp;
import com.tss.data.services.classes.dao.ClassInfoDao;
import com.tss.data.services.classes.po.ClassInfo;
import org.apache.commons.collections.CollectionUtils;
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
public class ClassesService implements ClassesInterface {

    @Autowired
    ClassInfoDao classInfoDao;

    @Override
    public PageInfo<ClassListResp> queryClassList(ClassListQueryReq req) {
        List<ClassInfo> classInfos = classInfoDao.selectByPage();
        PageHelper.startPage(req.getPageNumber(), req.getPageSize());
        List<ClassListResp> list = new ArrayList<>();

        if (CollectionUtils.isNotEmpty(classInfos)) {
            list = ModelMapperUtil.strictMapList(classInfos, ClassListResp.class);
        }

        PageInfo<ClassListResp> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public void editClass(ClassInfoEditReq req) {
        ClassInfo classInfo = new ClassInfo();
        BeanUtils.copyProperties(req, classInfo);

        if (req.getId() == null) {
            Date createTime = new Date();
            classInfo.setCreateTime(createTime);
            classInfo.setUpdateTime(createTime);
            classInfoDao.insertSelective(classInfo);
        } else {
            classInfo.setUpdateTime(new Date());
            classInfoDao.updateByPrimaryKeySelective(classInfo);
        }
    }

    /**
     * 批量刪除
     * @param req
     */
    @Override
    public void delete(ClassInfoDeleteReq req) {
        classInfoDao.batchDelete(new Date(), req.getIds());
    }
}
