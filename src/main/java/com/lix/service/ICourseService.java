package com.lix.service;

import com.lix.entity.Course;

import java.util.List;

public interface ICourseService {
    List<Course> findCoursePage(Course course, int pageNo, int pageSize);

    List<Course> selectAllCourse(int pageNo);
}
