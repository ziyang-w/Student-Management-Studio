package com.wzy.controller;

import com.wzy.entity.Stu;
import com.wzy.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StuController {

    @Autowired
    private StuService stuService;

    //查询学生信息
    @RequestMapping("/stu/findAll")
    public String findAll(Model model){
        List<Stu> stu = stuService.findAll();
        model.addAttribute("stus",stu);
        return "sms/stuList";
    }

    //添加学生信息并保存
    @RequestMapping("/stu/addStu")
    public String addStu(Stu stu){
        stuService.addStu(stu);
        return "redirect:/stu/findAll";
    }

    //根据Id查询学生信息
    @RequestMapping(value = "/stu/findStuById")
    public String updateStuStu(String id,Model model){
        Stu stu = stuService.findStuById(id);
        model.addAttribute("stu",stu);
        return "/sms/updateStu";
    }

    //修改学生信息并保存
    @RequestMapping(value = "/stu/updateStu")
    public String updateStuStu(Stu stu){
        stuService.updateStu(stu);
        return "redirect:/stu/findAll";
    }

    //删除学生信息并保存
    @RequestMapping(value = "/stu/deleteStu")
    public String deleteStu(String id){
        stuService.deleteStu(id);
        return "redirect:/stu/findAll";
    }
}
