package com.sunjunjie.eduservice.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunjunjie.eduservice.bean.EduTeacher;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author testjava
 * @since 2021-06-10
 */
public interface EduTeacherService extends IService<EduTeacher> {

    Map<String, Object> getTeacherFrontList(Page<EduTeacher> pageTeacher);
}
