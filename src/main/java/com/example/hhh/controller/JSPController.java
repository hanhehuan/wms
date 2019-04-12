package com.example.hhh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hanhehuan
 * @create 2019-04-12 14:46
 */
@Controller
public class JSPController {
    @GetMapping("/boot/index")
    public String index(Model model){
        model.addAttribute("msg","springboot 集成 jsp");
        return "index";
    }
}
