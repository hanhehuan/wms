package com.example.hhh.controller;

import com.example.hhh.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanhehuan
 * @create 2019-04-12 14:07
 */
@RestController
public class MvcController {
    @RequestMapping("/boot/getUser")
    public Object getUser(){
        User user = new User();
        user.setId(1);
        user.setName("韩合欢");
        return user;
    }
}
