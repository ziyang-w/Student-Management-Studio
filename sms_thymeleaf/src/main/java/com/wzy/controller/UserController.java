package com.wzy.controller;

import com.wzy.entity.User;
import com.wzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //登陆方法
    @RequestMapping("/user/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpSession session,
            Model model){
        User login=userService.login(username, password);
        if (login!=null){
            session.setAttribute("user",login);
            return "redirect:/stu/findAll";      //跳转到查询所有的页面
        }else {
            model.addAttribute("msg", "用户名或密码错误");
            return "/sms/login";
        }
    }
}
