package com.tss.data.web.curriculum;

import com.tss.data.interfaces.curriculum.CurriculumProjectInterface;
import com.tss.data.interfaces.curriculum.vo.TeacherCourseCurriculumProjectRespVO;
import com.tss.data.web.course.CourseController;
import io.swagger.annotations.Api;
import net.bytebuddy.asm.Advice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
@Api(value = "课程项目模块", tags = "CurriculumProjectController", description = "课程项目模块")
@RestController
@RequestMapping("/curriculum/project")
public class CurriculumProjectController {
    private static final Logger LOG = LoggerFactory.getLogger(CurriculumProjectController.class);
    
    @Autowired
    private CurriculumProjectInterface curriculumProjectInterface;
    
    @RequestMapping(value = "/getCourseCurriculumProjectList/{teacherId}", method = RequestMethod.GET)
    public TeacherCourseCurriculumProjectRespVO getTeacherCourseCurriculumProjectList(@PathVariable Long teacherId) {
        return curriculumProjectInterface.getTeacherCourseCurriculumProjectList(teacherId);
    }
}
