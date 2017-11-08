package com.lix.controller;

import com.lix.entity.Userlogin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    // jump
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String doLogin() throws Exception {
        return "../../doLogin";
    }

    @RequestMapping(value = "/doLogin", method = RequestMethod.GET)
    public String login(Userlogin userlogin) throws Exception {
        // Shiro
        UsernamePasswordToken token = new UsernamePasswordToken(
                userlogin.getUsername(), userlogin.getPassword());
        Subject subject = SecurityUtils.getSubject();

        //如果获取不到用户名就是登录失败，但登录失败的话，会直接抛出异常
        subject.login(token);
        if (subject.hasRole(("admin")))
            return "redirect:/admin/showStudent";
        else if (subject.hasRole("student"))
            return "redirect:/student/showCourse";
        else if (subject.hasRole("tecacher"))
            return "redirect:/teacher/showCourse";

        return "/login";
    }
}
