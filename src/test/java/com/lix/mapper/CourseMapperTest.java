package com.lix.mapper;

import com.lix.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/exam-dao.xml")
public class CourseMapperTest {

    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void test() {
        List<Course> list = courseMapper.selectAll();
        for (Course c : list)
            System.out.println(c);

        System.out.println();

        Course course = new Course();
        course.setClassroom("4");

        list = courseMapper.findCoursePage(course);
        for (Course c : list)
            System.out.println(c);

    }
}
