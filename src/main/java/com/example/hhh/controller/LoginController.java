package com.example.hhh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hanhehuan
 * @create 2019-04-24 15:29
 */
@Controller
public class LoginController {

    @RequestMapping("/wms")
    public String index(Model model){
        model.addAttribute("msg","欢迎来到进销存管理系统！");
        return "index";
    }
    @RequestMapping("/toLogin")
    public String login(){
        return "login";
    }
    @PostMapping("/main")
    public String main(Model model){
        model.addAttribute("msg","登录成功！");
        return "main";
    }
}
