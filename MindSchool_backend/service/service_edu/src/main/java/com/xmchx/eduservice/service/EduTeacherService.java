package com.xmchx.eduservice.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xmchx.eduservice.entity.EduTeacher;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * 讲师 服务类
 * @author 西门吹雪
 * @time
 */
public interface EduTeacherService extends IService<EduTeacher> {

    //查询前4条名师
    List<EduTeacher> selectHotTeacher();

    //1  讲师页  分页查询讲师的方法
    Map<String, Object> getTeacherFrontList(Page<EduTeacher> pageTeacher);
}
