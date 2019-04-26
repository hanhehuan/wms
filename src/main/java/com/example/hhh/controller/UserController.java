package com.example.hhh.controller;

import com.example.hhh.model.User;
import com.example.hhh.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hanhehuan
 * @create 2019-04-26 16:30
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/allUser")
    public List<User> selectAllUser(){
        List<User> users = userService.selectAllUser();
        return users;
    }
}
