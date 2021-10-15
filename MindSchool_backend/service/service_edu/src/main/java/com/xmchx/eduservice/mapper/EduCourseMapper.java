package com.xmchx.eduservice.mapper;

import com.xmchx.eduservice.entity.EduCourse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xmchx.eduservice.entity.frontvo.CourseWebVo;
import com.xmchx.eduservice.entity.vo.CoursePublishVo;

/**
 * 课程 Mapper 接口
 * @author 西门吹雪
 *
 */
public interface EduCourseMapper extends BaseMapper<EduCourse> {

    CoursePublishVo getPublishCourseInfo(String courseId);

    //根据课程id，查询课程信息
    CourseWebVo getBaseCourseInfo(String courseId);
}
