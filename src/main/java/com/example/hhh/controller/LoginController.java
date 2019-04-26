package com.example.hhh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author hanhehuan
 * @create 2019-04-24 15:29
 */
@Controller
@RequestMapping("/wms")
public class LoginController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("msg","欢迎来到进销存管理系统！");
        return "views/index";
    }
    @RequestMapping("/toLogin")
    public String login(){
        return "views/login";
    }
    @PostMapping("/main")
    public String main(Model model){
        model.addAttribute("msg","登录成功！");
        return "views/main";
    }
}
