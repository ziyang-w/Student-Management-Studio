package com.wzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller     //说明本类是一个控制器
public class indexController {

//    @GetMapping("/login")   //这句话的意思是当客户寻找index时，就执行该标注下的方法
    public String toIndex(){
        return "sms/login";    //返回templates路径下sms/login文件
    }

    @RequestMapping("/toAddStu")
    public String toAddStu(){

        return "/sms/addStu";
    }
    @RequestMapping("/toFind")
    public String toFindStu(){

        return "/sms/findStu";
    }


}
