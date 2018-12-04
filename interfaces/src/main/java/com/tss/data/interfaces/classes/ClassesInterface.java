/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Tong Liu
 * Date: 2018/11/29
 * Description:DepartmentInterface.java
 */
package com.tss.data.interfaces.classes;

import com.github.pagehelper.PageInfo;
import com.tss.data.interfaces.classes.request.ClassInfoDeleteReq;
import com.tss.data.interfaces.classes.request.ClassInfoEditReq;
import com.tss.data.interfaces.classes.request.ClassListQueryReq;
import com.tss.data.interfaces.classes.response.ClassListResp;

/**
 * @author Tong Liu
 */
public interface ClassesInterface {
    
    PageInfo<ClassListResp> queryClassList(ClassListQueryReq req);

    void editClass(ClassInfoEditReq req);

    void delete(ClassInfoDeleteReq ids);
}
