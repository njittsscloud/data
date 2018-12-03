package com.tss.data.web;

import com.github.pagehelper.PageInfo;
import com.tss.data.interfaces.department.DepartmentInterface;
import com.tss.data.interfaces.department.request.QueryDepartmentListReq;
import com.tss.data.interfaces.department.response.DepartmentListResp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by LT on 2018/12/3.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class DepartmentServiceTest {
    
    @Autowired
    DepartmentInterface departmentInterface;
    
    @Test
    public void queryDepartmentList() {
        QueryDepartmentListReq request = new QueryDepartmentListReq();
        request.setPageNumber(1);
        request.setPageSize(10);
        PageInfo<DepartmentListResp> pageInfo = departmentInterface.queryDepartmentList(request);
        List<DepartmentListResp> list = pageInfo.getList();
        list.forEach(vo->System.out.println(vo.getId()));
    }
}