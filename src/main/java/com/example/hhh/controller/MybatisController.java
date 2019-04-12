package com.example.hhh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanhehuan
 * @create 2019-04-12 16:13
 */
@RestController
public class MybatisController {
    @GetMapping("/boot/students")
    public String students(){
        return "students";
    }
}
