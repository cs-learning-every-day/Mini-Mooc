package com.xmchx.eduservice.controller.front;

import com.xmchx.commonutils.result.R;
import com.xmchx.eduservice.entity.EduCourse;
import com.xmchx.eduservice.entity.EduTeacher;
import com.xmchx.eduservice.service.EduCourseService;
import com.xmchx.eduservice.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(description="前台首页：热门讲师；热门课程")
@RestController
@RequestMapping("/eduservice/indexfront")
@CrossOrigin
public class IndexFrontController {

    @Autowired
    private EduCourseService courseService;

    @Autowired
    private EduTeacherService teacherService;

    //查询前4条名师
    @ApiOperation(value = "查询前4条名师")
    @GetMapping("indexHotTeacher")
    public R indexHotTeacher() {
        List<EduTeacher> teacherList = teacherService.selectHotTeacher();
        return R.success().data("teacherList",teacherList);
    }

    //查询前8条热门课程
    @ApiOperation(value = "查询前8条热门课程")
    @GetMapping("indexHotCourse")
    public R indexHotCourse() {
        List<EduCourse> courseList = courseService.selectHotCourse();
        return R.success().data("courseList",courseList);
    }

}
