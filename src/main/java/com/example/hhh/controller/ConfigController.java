package com.example.hhh.controller;

import com.example.hhh.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR hanhehuan
 * @CREATEDATE 2019-04-12 13:33
 *
 */
@RestController
public class ConfigController {
    @Value("${boot.name}")
    private String name;

    @Value("${boot.location}")
    private String location;

    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping("/boot/config")
    public @ResponseBody String config(){

        return name+"---"+location+"=="+configInfo.getLocation()+"---"+configInfo.getName();
    }
}
