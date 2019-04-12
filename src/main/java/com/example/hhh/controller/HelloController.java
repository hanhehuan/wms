package com.example.hhh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*
* @author hanhehuan
* @createDate 2019-04-12
*
* */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public @ResponseBody String hello(){
        return "hello world!";
    }
}
