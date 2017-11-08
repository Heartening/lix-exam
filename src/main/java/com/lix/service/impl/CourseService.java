package com.lix.service.impl;

import com.github.pagehelper.PageHelper;
import com.lix.entity.Course;
import com.lix.mapper.CourseMapper;
import com.lix.service.ICourseService;
import com.lix.util.CommonConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;

@Service("courseService")
public class CourseService implements ICourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> findCoursePage(Course course, int pageNo, int pageSize) {
        PageHelper .startPage(pageNo, pageSize);
        return courseMapper.findCoursePage(course);
    }

    @Override
    public List<Course> selectAllCourse(int pageNo) {
        PageHelper.startPage(pageNo, CommonConstant.DEFAULT_PAGE_SIZE);
        return courseMapper.selectAll();
    }
}
