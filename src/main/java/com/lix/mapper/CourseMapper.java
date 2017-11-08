package com.lix.mapper;

import com.lix.entity.Course;
import com.lix.util.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface CourseMapper extends MyMapper<Course> {
    List<Course> findCoursePage(Course course);
}