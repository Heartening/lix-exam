package com.lix.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lix.entity.Course;
import com.lix.service.impl.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/exam-*.xml")
public class CourseServiceTest {
    @Autowired
    private ICourseService courseService;

    @Test
    public void test() {
        Course c = new Course();
        c.setClassroom("4");

       List<Course> list = courseService.findCoursePage(c, 2, 2);

       PageInfo<Course> pageInfo = new PageInfo<Course>(list);
       System.out.println(pageInfo.getTotal());
    }
}
