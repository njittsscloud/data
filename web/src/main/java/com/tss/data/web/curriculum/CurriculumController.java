package com.tss.data.web.curriculum;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: MQG
 * @date: 2018/11/21
 */
@Api(value = "课程模块", tags = "CurriculumController", description = "课程模块")
@RestController
@RequestMapping("/curriculum")
public class CurriculumController {
}
