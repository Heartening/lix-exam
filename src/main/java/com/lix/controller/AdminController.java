package com.lix.controller;

import com.github.pagehelper.PageInfo;
import com.lix.entity.Course;
import com.lix.service.ICollegeService;
import com.lix.service.ICourseService;
import com.lix.service.IStudentService;
import com.lix.service.IUserLoginService;
import com.lix.util.CommonConstant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource(name = "studentService")
    private IStudentService studentService;

    @Resource(name = "courseService")
    private ICourseService courseService;

    @Resource(name = "collegeService")
    private ICollegeService collegeService;

    @Resource(name = "userLoginService")
    private IUserLoginService userloginService;



    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<课程操作>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/

    // 课程信息显示
    @RequestMapping("/showCourse")
    public String showCourse(Model model, Integer page) throws Exception {
        List<Course> list = courseService.selectAllCourse(page);

        PageInfo<Course> pageInfo = new PageInfo<Course>(list);

        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("courseList", list);
        model.addAttribute("pageNo", page);

        return "admin/showCourse.jsp";
    }

    //搜索课程
    @RequestMapping(value = "selectCourse", method = {RequestMethod.POST})
    private String selectCourse(Course course, Model model) throws Exception {
        List<Course> list = courseService.findCoursePage(course,
                CommonConstant.DEFAULT_PAGE_NO, CommonConstant.DEFAULT_PAGE_SIZE);

        PageInfo<Course> pageInfo = new PageInfo<Course>(list);
        model.addAttribute("courseList", list);
        model.addAttribute("pageInfo", pageInfo);

        return "admin/showCourse.jsp";
    }
}
